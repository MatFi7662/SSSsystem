-- Insert data into users table
INSERT INTO users (username, password, email, first_name, last_name, is_blocked, failed_login_attempts)
VALUES 
('john_doe', 'hashed_password_1', 'john.doe@example.com', 'John', 'Doe', false, 0),
('jane_smith', 'hashed_password_2', 'jane.smith@example.com', 'Jane', 'Smith', false, 0),
('admin_user', 'hashed_password_3', 'admin@example.com', 'Admin', 'User', false, 0);

-- Insert data into subjects table
INSERT INTO subjects (name, description, lecturer, date)
VALUES 
('Database Systems', 'An introduction to database systems', 'Dr. Alan Turing', '2024-09-01'),
('Computer Networks', 'Study of computer networking principles', 'Dr. Grace Hopper', '2024-09-01'),
('Operating Systems', 'Understanding operating systems', 'Dr. Ken Thompson', '2024-09-01');

-- Insert data into subscriptions table
INSERT INTO subscriptions (user_id, subject_id, subscribed_at)
VALUES 
(1, 1, '2024-01-15 09:00:00'),
(1, 2, '2024-01-16 10:00:00'),
(2, 2, '2024-01-17 11:00:00'),
(2, 3, '2024-01-18 12:00:00');

-- Insert data into timetables table
INSERT INTO timetables (subject_id, start_time, end_time, location)
VALUES 
(1, '2024-09-01 09:00:00', '2024-09-01 11:00:00', 'Room 101'),
(2, '2024-09-02 10:00:00', '2024-09-02 12:00:00', 'Room 202'),
(3, '2024-09-03 11:00:00', '2024-09-03 13:00:00', 'Room 303');

-- Insert data into grades table
INSERT INTO grades (user_id, subject_id, grade, grade_date, issued_by)
VALUES 
(1, 1, 'A', '2024-01-20', 'Dr. Alan Turing'),
(1, 2, 'B+', '2024-02-15', 'Dr. Grace Hopper'),
(2, 2, 'A-', '2024-03-10', 'Dr. Grace Hopper'),
(2, 3, 'B', '2024-04-05', 'Dr. Ken Thompson');

-- Insert data into payments table
INSERT INTO payments (user_id, amount, payment_date, payment_status)
VALUES 
(1, 5000.00, '2024-01-05', 'Completed'),
(1, 5000.00, '2024-02-05', 'Completed'),
(2, 5000.00, '2024-01-10', 'Completed'),
(2, 5000.00, '2024-02-10', 'Pending');

-- Insert data into library_records table
INSERT INTO library_records (user_id, book_title, borrow_date, return_date, status)
VALUES 
(1, 'Introduction to Algorithms', '2024-01-01', '2024-01-15', 'Returned'),
(1, 'The Art of Computer Programming', '2024-02-01', '2024-02-20', 'Overdue'),
(2, 'Clean Code', '2024-01-10', '2024-01-25', 'Returned'),
(2, 'Design Patterns', '2024-02-10', null, 'Borrowed');

-- Insert data into account_logs table
INSERT INTO account_logs (user_id, action, action_date, details)
VALUES 
(1, 'Account Created', '2024-01-01 10:00:00', 'Account created for user john_doe'),
(1, 'Password Changed', '2024-01-10 12:00:00', 'Password changed by user john_doe'),
(2, 'Account Created', '2024-01-05 11:00:00', 'Account created for user jane_smith'),
(2, 'Email Updated', '2024-01-15 13:00:00', 'Email updated to new_email@example.com');
