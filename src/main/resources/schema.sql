-- NoteShare database

DROP TABLE IF EXISTS schools CASCADE;
CREATE TABLE schools (
    id serial primary key,
    name varchar(255),
    level varchar(255)
);

DROP TABLE IF EXISTS users CASCADE;
CREATE TABLE users (
    id serial primary key,
    school_id bigint references schools(id),
    username varchar(30) unique not null,
    password varchar(50) not null,
    email varchar(70) unique not null,
    admin bool
);

DROP TABLE IF EXISTS degrees CASCADE;
CREATE TABLE degrees (
    id serial primary key,
    degree varchar(12)
);

DROP TABLE IF EXISTS courses CASCADE;
CREATE TABLE courses (
    id serial primary key,
    school_id bigint references schools(id),
    degree_id bigint references degrees(id),
    short_name varchar(20),
    name varchar(255)
);

DROP TABLE IF EXISTS files CASCADE;
CREATE TABLE files (
    id serial primary key,
    user_id bigint references users(id),
    course_id bigint references courses(id),
    title varchar(255),
    date date,
    description text,
    likes int,
    file_name varchar(255),
    data bytea
);

DROP TABLE IF EXISTS comments CASCADE;
CREATE TABLE comments (
    id serial primary key,
    file_id bigint references files(id),
    user_id bigint references users(id),
    comment text,
    likes int
);

DROP TABLE IF EXISTS subjects CASCADE;
CREATE TABLE subjects (
    id serial primary key,
    subject varchar(255)
);

-- join tables
DROP TABLE IF EXISTS user_courses CASCADE;
CREATE TABLE user_courses (
    user_id bigint references users(id),
    course_id bigint references courses(id)
);

DROP TABLE IF EXISTS user_likes CASCADE;
CREATE TABLE user_likes (
    user_id bigint references users(id),
    file_id bigint references files(id)
);

DROP TABLE IF EXISTS course_subjects CASCADE;
CREATE TABLE course_subjects (
    course_id bigint references courses(id),
    subject_id bigint references subjects(id)
);
