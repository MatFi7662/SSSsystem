package com.wwsis.sss.dao;

import com.wwsis.sss.entity.Tuition;
import java.util.ArrayList;
import java.util.List;

public class TuitionDaoImpl implements TuitionDao {
    private List<Tuition> tuitionPayments = new ArrayList<>();

    @Override
    public List<Tuition> getAllTuitionPayments() {
        return tuitionPayments;
    }

    @Override
    public Tuition getTuitionPaymentDetails(int paymentId) {
        return tuitionPayments.stream().filter(t -> t.getId() == paymentId).findFirst().orElse(null);
    }

    @Override
    public void addTuitionPayment(Tuition tuition) {
        tuitionPayments.add(tuition);
    }

    @Override
    public void updateTuitionPayment(Tuition tuition) {
        int index = tuitionPayments.indexOf(getTuitionPaymentDetails(tuition.getId()));
        if (index >= 0) {
            tuitionPayments.set(index, tuition);
        }
    }

    @Override
    public void deleteTuitionPayment(int paymentId) {
        tuitionPayments.removeIf(t -> t.getId() == paymentId);
    }
}
