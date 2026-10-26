package kh.edu.istad.platform.payment.domain.service;

import kh.edu.istad.platform.payment.domain.entity.Payment;
import kh.edu.istad.platform.payment.domain.event.PaymentCancelledEvent;
import kh.edu.istad.platform.payment.domain.event.PaymentCompletedEvent;
import kh.edu.istad.platform.payment.domain.event.PaymentFailedEvent;

public class PaymentDomainServiceImpl implements PaymentDomainService {
    @Override
    public PaymentCompletedEvent paymentComplete(Payment payment) {
        return null;
    }

    @Override
    public PaymentCancelledEvent paymentCancel(Payment payment) {
        return null;
    }

    @Override
    public PaymentFailedEvent paymentFail(Payment payment) {
        return null;
    }
}
