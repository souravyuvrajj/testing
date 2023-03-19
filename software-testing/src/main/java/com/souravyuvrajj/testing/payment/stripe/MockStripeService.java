package com.souravyuvrajj.testing.payment.stripe;

import com.souravyuvrajj.testing.payment.CardPaymentCharge;
import com.souravyuvrajj.testing.payment.CardPaymentCharger;
import com.souravyuvrajj.testing.payment.Currency;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

//Mock stripe for integration testing
@Service
@ConditionalOnProperty(
        value = "stripe.enabled",
        havingValue = "false"
)
public class MockStripeService implements CardPaymentCharger {
    @Override
    public CardPaymentCharge chargeCard(String cardSource,
                                        BigDecimal amount,
                                        Currency currency,
                                        String description) {
        return new CardPaymentCharge(true);
    }
}
