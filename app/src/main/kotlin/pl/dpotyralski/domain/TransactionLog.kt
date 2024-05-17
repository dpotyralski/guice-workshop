package pl.dpotyralski.domain

import java.net.ConnectException

interface TransactionLog {
    fun logChargeResult(result: ChargeResult)

    fun logConnectException(e: ConnectException)
}
