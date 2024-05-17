package pl.dpotyralski.domain

class ChargeResult private constructor(
    val wasSuccessful: Boolean,
    val declineMessage: String = "",
) {
    companion object {
        fun success() = ChargeResult(wasSuccessful = true)

        fun failure(message: String) = ChargeResult(wasSuccessful = false, declineMessage = message)
    }
}
