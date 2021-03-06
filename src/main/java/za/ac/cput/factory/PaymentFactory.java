package za.ac.cput.factory;

import za.ac.cput.entity.Payment;
import za.ac.cput.util.GenericHelper;

import java.util.UUID;

public class PaymentFactory {
    public static Payment CreatePayment(String paymentId, String paymentDate, String paymentTime, String paymentTotal, String paymentDetails){

        String Payment = UUID.randomUUID().toString();
        if(GenericHelper.isNullorEmpty(paymentId) || GenericHelper.isNullorEmpty(paymentDate))
            return null;

        return new Payment.Builder().setPaymentId(paymentId)
                .setPaymentDate(paymentDate)
                .setPaymentTime(paymentTime)
                .setPaymentTotal(paymentTotal)
                .setPaymentDetails(paymentDetails)
                .build();

    }
}
