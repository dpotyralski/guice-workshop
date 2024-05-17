package pl.dpotyralski.domain

import java.net.ConnectException

class DatabaseTransactionLog : TransactionLog {
    override fun logChargeResult(result: ChargeResult) {
        println("Charge result logged in database")
    }

    override fun logConnectException(e: ConnectException) {
        println("Connect exception logged in database")
    }
}
