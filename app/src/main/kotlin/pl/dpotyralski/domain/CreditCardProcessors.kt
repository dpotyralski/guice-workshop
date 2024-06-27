package pl.dpotyralski.domain

import java.math.BigDecimal

class PaypalCreditCardProcessor : CreditCardProcessor {
    override fun charge(
        creditCard: CreditCard,
        amount: BigDecimal,
    ): ChargeResult {
        println("Charging $creditCard for $amount")
        if (creditCard.number == "0000 1111 2222 3333 4444" && amount > BigDecimal("100")) {
            return ChargeResult.failure("Insufficient funds")
        }
        return ChargeResult.success()
    }
}

class StripeCreditCardProcessor : CreditCardProcessor {
    override fun charge(
        creditCard: CreditCard,
        amount: BigDecimal,
    ): ChargeResult {
        println("Charging $creditCard for $amount")
        return ChargeResult.success()
    }
}
