package pl.dpotyralski.learning

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import pl.dpotyralski.domain.CreditCard
import pl.dpotyralski.domain.PizzaOrder
import pl.dpotyralski.domain.Receipt
import java.math.BigDecimal

class BillingServiceTest {
    private val billingService = BillingService()

    @BeforeEach
    fun setUp() {
        println("Setting up")
    }

    @Test
    fun `should successfully charge pizza order`() {
        // given
        val pizzaOrder = PizzaOrder(BigDecimal("100"))
        val creditCard = CreditCard("0000 1111 2222 3333 4444)", "12/24", "123")

        // when
        val chargeOrder = billingService.chargeOrder(pizzaOrder, creditCard)

        // then
        assertThat(chargeOrder).isEqualTo(Receipt.Success(BigDecimal("100")))
    }

    @Test
    fun `should not charge for pizza`() {
        // given
        val pizzaOrder = PizzaOrder(BigDecimal("120"))
        val creditCard = CreditCard("0000 1111 2222 3333 4444", "12/24", "123")

        // when
        val chargeOrder = billingService.chargeOrder(pizzaOrder, creditCard)

        // then
        assertThat(chargeOrder).isEqualTo(Receipt.Failure("Insufficient funds"))
    }
}
