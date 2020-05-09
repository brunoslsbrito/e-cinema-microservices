package com.ecinema.ps.api.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecinema.ps.api.entity.Payment;
import com.ecinema.ps.api.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository repository;
	
	public Payment doPayment(Payment payment) {
		payment.setStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		return repository.save(payment);
	}
	

	/**
	 * Check payment status, integrated external apis.
	 * @return
	 */
	public String paymentProcessing() {
		//api should be 3rd pary payment gateway(paypal,paytm...)
		return new Random().nextBoolean()?"success":"false";
	}
	
	
}

