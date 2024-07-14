package com.wwsis.sss.dao;

import com.wwsis.sss.entity.Borrowing;
import java.util.ArrayList;
import java.util.List;

public class LibraryDaoImpl implements LibraryDao {
    private List<Borrowing> borrowings = new ArrayList<>();

    @Override
    public List<Borrowing> getAllBorrowings() {
        return borrowings;
    }

    @Override
    public Borrowing getBorrowingDetails(int borrowingId) {
        return borrowings.stream().filter(b -> b.getId() == borrowingId).findFirst().orElse(null);
    }

    @Override
    public List<Borrowing> getOverdueBorrowings() {
        // Implement logic for finding overdue borrowings
        return new ArrayList<>();
    }

    @Override
    public void addBorrowing(Borrowing borrowing) {
        borrowings.add(borrowing);
    }

    @Override
    public void returnBorrowing(int borrowingId) {
        borrowings.removeIf(b -> b.getId() == borrowingId);
    }
}
