package com.kodlamaio.paymentservice.business.abstracts;


import com.kodlamaio.paymentservice.business.requests.CreatePaymentRequest;
import com.kodlamaio.paymentservice.business.responses.CreatePaymentResponse;

public interface PaymentService {
    CreatePaymentResponse add(CreatePaymentRequest createPaymentRequest);
    void delete (String id);
    void updateStatus (String id, int status);





}
