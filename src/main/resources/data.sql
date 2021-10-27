-- data

-- schools
insert into schools(name, level) values ('University of Iceland', 'University');
insert into schools(name, level) values ('Reykjavik University', 'University');

-- users
insert into users(school_id, username, password, email, admin) values (1, 'admin', 'admin', 'icehot1@althingi.is', true);

-- courses
insert into courses(school_id, short_name, name) values (1, 'HBV501G', 'Software Project 1');

-- user_courses (tímabundið fyrir admin/test user)
insert into user_courses(user_id, course_id) values (1, 1);
