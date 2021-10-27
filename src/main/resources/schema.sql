-- NoteShare gagnagrunnur

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
    isAdmin bool
);

DROP TABLE IF EXISTS courses CASCADE;
CREATE TABLE courses (
    id serial primary key,
    school_id bigint references schools(id),
    short_name varchar(20),
    name varchar(255)
);

DROP TABLE IF EXISTS files CASCADE;
CREATE TABLE files (
    id serial primary key,
    user_id bigint references users(id),
    title varchar(255),
    date date,
    description text,
    source varchar(2555)
);

DROP TABLE IF EXISTS comments CASCADE;
CREATE TABLE comments (
    id serial primary key,
    file_id bigint references files(id),
    user_id bigint references users(id),
    comment text
);

-- Tengitöflur

DROP TABLE IF EXISTS user_courses CASCADE;
CREATE TABLE user_courses (
    user_id bigint references users(id),
    course_id bigint references courses(id)
);

