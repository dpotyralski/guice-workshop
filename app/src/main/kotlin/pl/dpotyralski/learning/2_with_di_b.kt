@file:Suppress("ktlint:standard:filename")

package pl.dpotyralski.learning

// fun main() {
//    val order = PizzaOrder(BigDecimal("140"))
//    val creditCard = CreditCard("0000 1111 2222 3333 4444", "12/24", "123")
//
//    val paypalCreditCardProcessor = PaypalCreditCardProcessor()
//    val databaseTransactionLog = DatabaseTransactionLog()
//    val service = BillingService()
//
//    service.processor = paypalCreditCardProcessor
//    service.transactionLog = databaseTransactionLog
//
//    val receipt: Receipt = service.chargeOrder(order, creditCard)
//    if (receipt is Receipt.Success) {
//        println("Payment successful")
//    } else {
//        println("Payment failed")
//    }
// }
//
// private class BillingService {
//    lateinit var processor: PaypalCreditCardProcessor
//    lateinit var transactionLog: DatabaseTransactionLog
//
//    fun chargeOrder(
//        order: PizzaOrder,
//        creditCard: CreditCard,
//    ): Receipt {
//        try {
//            val result: ChargeResult = processor.charge(creditCard, order.amount)
//            transactionLog.logChargeResult(result)
//            return when {
//                result.wasSuccessful -> {
//                    Receipt.Success(order.amount)
//                }
//
//                else -> Receipt.Failure(result.declineMessage)
//            }
//        } catch (e: ConnectException) {
//            transactionLog.logConnectException(e)
//            return Receipt.Failure(e.message!!)
//        }
//    }
// }
