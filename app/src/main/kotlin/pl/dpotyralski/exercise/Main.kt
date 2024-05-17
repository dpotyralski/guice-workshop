package pl.dpotyralski.exercise

class Main {
    // TODO setup guice injector
}

// class BillingService(
//    private val processor: PaypalCreditCardProcessor,
//    private val transactionLog: DatabaseTransactionLog,
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
