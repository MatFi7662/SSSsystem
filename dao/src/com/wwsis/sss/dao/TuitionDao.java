package com.wwsis.sss.dao;

import java.util.List;

public interface TuitionDao {
    List<Tuition> getAllTuitionPayments();
    Tuition getTuitionPaymentDetails(int paymentId);
    void addTuitionPayment(Tuition tuition);
    void updateTuitionPayment(Tuition tuition);
    void deleteTuitionPayment(int paymentId);
}