package com.wwsis.sss.dao;

import java.util.List;

public interface LibraryDao {
    List<Borrowing> getAllBorrowings();
    Borrowing getBorrowingDetails(int borrowingId);
    List<Borrowing> getOverdueBorrowings();
    void addBorrowing(Borrowing borrowing);
    void returnBorrowing(int borrowingId);
}
