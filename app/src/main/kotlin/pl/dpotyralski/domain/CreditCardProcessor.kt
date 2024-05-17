package pl.dpotyralski.domain

import java.math.BigDecimal

interface CreditCardProcessor {
    fun charge(
        creditCard: CreditCard,
        amount: BigDecimal,
    ): ChargeResult
}
