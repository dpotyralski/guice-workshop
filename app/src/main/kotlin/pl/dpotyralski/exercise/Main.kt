package pl.dpotyralski.exercise

import pl.dpotyralski.domain.ChargeResult
import pl.dpotyralski.domain.CreditCard
import pl.dpotyralski.domain.CreditCardProcessor
import pl.dpotyralski.domain.PizzaOrder
import pl.dpotyralski.domain.Receipt
import pl.dpotyralski.domain.TransactionLog
import java.net.ConnectException

// TODO setup guice module with card processor and transaction log
// TODO setup guice injector
// TODO get billing service from injector

fun main() {
}

class BillingService(
    private val processor: CreditCardProcessor,
    private val transactionLog: TransactionLog,
) {
    fun chargeOrder(
        order: PizzaOrder,
        creditCard: CreditCard,
    ): Receipt {
        try {
            val result: ChargeResult = processor.charge(creditCard, order.amount)
            transactionLog.logChargeResult(result)
            return when {
                result.wasSuccessful -> {
                    Receipt.Success(order.amount)
                }

                else -> Receipt.Failure(result.declineMessage)
            }
        } catch (e: ConnectException) {
            transactionLog.logConnectException(e)
            return Receipt.Failure(e.message!!)
        }
    }
}
