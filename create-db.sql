-- Drop schema and existing tables
drop schema public cascade;

-- Create table for users
create table users (
    user_id serial primary key,
    username varchar(50) not null unique,
    password varchar(255) not null,
    email varchar(100) not null unique,
    first_name varchar(50),
    last_name varchar(50),
    is_blocked boolean default false,
    failed_login_attempts int default 0,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp
);

-- Create table for subjects
create table subjects (
    subject_id serial primary key,
    name varchar(100) not null,
    description text,
    lecturer varchar(100),
    date date
);

-- Create table for subscriptions
create table subscriptions (
    subscription_id serial primary key,
    user_id int references users(user_id) on delete cascade,
    subject_id int references subjects(subject_id) on delete cascade,
    subscribed_at timestamp default current_timestamp
);

-- Create table for timetables
create table timetables (
    timetable_id serial primary key,
    subject_id int references subjects(subject_id) on delete cascade,
    start_time timestamp,
    end_time timestamp,
    location varchar(100)
);

-- Create table for grades
create table grades (
    grade_id serial primary key,
    user_id int references users(user_id) on delete cascade,
    subject_id int references subjects(subject_id) on delete cascade,
    grade varchar(2),
    grade_date date,
    issued_by varchar(100)
);

-- Create table for payments
create table payments (
    payment_id serial primary key,
    user_id int references users(user_id) on delete cascade,
    amount numeric(10,2),
    payment_date date,
    payment_status varchar(20)
);

-- Create table for library records
create table library_records (
    record_id serial primary key,
    user_id int references users(user_id) on delete cascade,
    book_title varchar(200),
    borrow_date date,
    return_date date,
    status varchar(20)
);

-- Create table for user account management logs
create table account_logs (
    log_id serial primary key,
    user_id int references users(user_id) on delete cascade,
    action varchar(50),
    action_date timestamp default current_timestamp,
    details text
);
