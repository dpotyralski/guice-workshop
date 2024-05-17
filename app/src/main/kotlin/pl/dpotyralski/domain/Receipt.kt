package pl.dpotyralski.domain

import java.math.BigDecimal

sealed class Receipt {
    data class Success(val amount: BigDecimal) : Receipt()

    data class Failure(val message: String) : Receipt()
}
