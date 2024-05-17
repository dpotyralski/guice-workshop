@file:Suppress("ktlint:standard:filename")

package pl.dpotyralski.learning

import pl.dpotyralski.domain.ChargeResult
import pl.dpotyralski.domain.CreditCard
import pl.dpotyralski.domain.CreditCardProcessor
import pl.dpotyralski.domain.DatabaseTransactionLog
import pl.dpotyralski.domain.PaypalCreditCardProcessor
import pl.dpotyralski.domain.PizzaOrder
import pl.dpotyralski.domain.Receipt
import pl.dpotyralski.domain.TransactionLog
import java.math.BigDecimal
import java.net.ConnectException

fun main() {
    val order = PizzaOrder(BigDecimal("140"))
    val creditCard = CreditCard("0000 1111 2222 3333 4444", "12/24", "123")

    val service = BillingService()

    val receipt: Receipt = service.chargeOrder(order, creditCard)
    if (receipt is Receipt.Success) {
        println("Payment successful")
    } else {
        println("Payment failed")
    }
}

class BillingService {
    fun chargeOrder(
        order: PizzaOrder,
        creditCard: CreditCard,
    ): Receipt {
        val processor: CreditCardProcessor = PaypalCreditCardProcessor()
        val transactionLog: TransactionLog = DatabaseTransactionLog()

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
