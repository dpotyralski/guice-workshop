@file:Suppress("ktlint:standard:filename")

package pl.dpotyralski.learning

// SOLID - Dependency Inversion Principle
//
// IoC
// DI
// DIP

// fun main() {
//    val paypalCreditCardProcessor = PaypalCreditCardProcessor()
//    val dataDogTransactionLog = DataDogTransactionLog()
//
//    val service = BillingService(paypalCreditCardProcessor, dataDogTransactionLog)
// }
//
// class BillingService(
//    private val processor: CreditCardProcessor, // interface
//    private val transactionLog: TransactionLog, // interface
// ) {
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
