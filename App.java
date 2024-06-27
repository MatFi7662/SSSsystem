package pl.wwsis.sss.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Column(name = "email", nullable = false, unique = true, length = 100)
    private String email;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "is_blocked", nullable = false)
    private boolean isBlocked;

    @Column(name = "failed_login_attempts", nullable = false)
    private int failedLoginAttempts;

    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    @Column(name = "updated_at", nullable = false)
    private Timestamp updatedAt;

    // Getters and Setters
}


package pl.wwsis.sss.model;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
public class Subject {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subjectId;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "lecturer", length = 100)
    private String lecturer;

    @Column(name = "date")
    private java.sql.Date date;

    // Getters and Setters
}

package pl.wwsis.sss.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "subscriptions")
public class Subscription {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subscriptionId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    @Column(name = "subscribed_at", nullable = false)
    private Timestamp subscribedAt;

    // Getters and Setters
}

package pl.wwsis.sss.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "timetables")
public class Timetable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int timetableId;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    @Column(name = "start_time")
    private Timestamp startTime;

    @Column(name = "end_time")
    private Timestamp endTime;

    @Column(name = "location", length = 100)
    private String location;

    // Getters and Setters
}

package pl.wwsis.sss.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "grades")
public class Grade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gradeId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    @Column(name = "grade", length = 2)
    private String grade;

    @Column(name = "grade_date")
    private Date gradeDate;

    @Column(name = "issued_by", length = 100)
    private String issuedBy;

    // Getters and Setters
}

package pl.wwsis.sss.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "payments")
public class Payment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "amount", nullable = false)
    private double amount;

    @Column(name = "payment_date")
    private Date paymentDate;

    @Column(name = "payment_status", length = 20)
    private String paymentStatus;

    // Getters and Setters
}

package pl.wwsis.sss.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "library_records")
public class LibraryRecord {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recordId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "book_title", length = 200)
    private String bookTitle;

    @Column(name = "borrow_date")
    private Date borrowDate;

    @Column(name = "return_date")
    private Date returnDate;

    @Column(name = "status", length = 20)
    private String status;

    // Getters and Setters
}

package pl.wwsis.sss.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "account_logs")
public class AccountLog {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int logId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "action", length = 50)
    private String action;

    @Column(name = "action_date", nullable = false)
    private Timestamp actionDate;

    @Column(name = "details")
    private String details;

    // Getters and Setters
}



