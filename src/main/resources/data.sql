-- data

-- schools
insert into schools(name, level) values ('University of Iceland', 'University');
insert into schools(name, level) values ('Reykjavik University', 'University');

-- users
insert into users(school_id, username, password, email, admin) values (1, 'admin', 'admin', 'admin@admin.com', true);

-- courses
insert into courses(school_id, short_name, name) values (1, 'HBV501G', 'Software Project 1');
insert into courses(school_id, short_name, name) values (1, 'HBV502G', 'Software Project 2');
insert into courses(school_id, short_name, name) values (1, 'HBV503G', 'Software Project 3');
insert into courses(school_id, short_name, name) values (1, 'HBV504G', 'Software Project 4');
insert into courses(school_id, short_name, name) values (1, 'HBV505G', 'Software Project 5');
insert into courses(school_id, short_name, name) values (1, 'HBV506G', 'Software Project 6');

-- user_courses (tímabundið fyrir admin/test user)
insert into user_courses(user_id, course_id) values (1, 1);
