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

-- degrees
insert into degrees(degree) values ('Bachelor');
insert into degrees(degree) values ('Master');
insert into degrees(degree) values ('Doctoral');

-- subjects
insert into subjects(subject) values('Anthropology');
insert into subjects(subject) values('Applied Inter-American Studies');
insert into subjects(subject) values('Applied Statistics');
insert into subjects(subject) values('Applied Studies in German in Tourism and Communication');
insert into subjects(subject) values('Archaeology');
insert into subjects(subject) values('Arctic Studies');
insert into subjects(subject) values('Biochemistry');
insert into subjects(subject) values('Bioengineering');
insert into subjects(subject) values('Bioinformatics');
insert into subjects(subject) values('Biology');
insert into subjects(subject) values('Biostatistics');
insert into subjects(subject) values('Business Administration');
insert into subjects(subject) values('Chemical Engineering');
insert into subjects(subject) values('Chemistry');
insert into subjects(subject) values('Civil Engineering');
insert into subjects(subject) values('Computational Engineering');
insert into subjects(subject) values('Computer Engineering');
insert into subjects(subject) values('Computer Science');
insert into subjects(subject) values('Danish');
insert into subjects(subject) values('Dentistry');
insert into subjects(subject) values('Development Studies');
insert into subjects(subject) values('Disability Studies');
insert into subjects(subject) values('Earth Sciences');
insert into subjects(subject) values('Economics');
insert into subjects(subject) values('Electrical and Computer Engineering');
insert into subjects(subject) values('Electrical Engineering');
insert into subjects(subject) values('Engineering Physics');
insert into subjects(subject) values('English');
insert into subjects(subject) values('English for Academic Purposes');
insert into subjects(subject) values('Environment and Natural Resources');
insert into subjects(subject) values('Environmental Engineering');
insert into subjects(subject) values('Environmental Studies');
insert into subjects(subject) values('Epidemiology');
insert into subjects(subject) values('Folkloristics');
insert into subjects(subject) values('Food Science');
insert into subjects(subject) values('French');
insert into subjects(subject) values('French Studies');
insert into subjects(subject) values('Gender Studies');
insert into subjects(subject) values('Geography');
insert into subjects(subject) values('Geology');
insert into subjects(subject) values('Geophysics');
insert into subjects(subject) values('German');
insert into subjects(subject) values('Global Studies');
insert into subjects(subject) values('Health Science');
insert into subjects(subject) values('Icelandic as a second language');
insert into subjects(subject) values('Icelandic as a second language, for Practical Purposes');
insert into subjects(subject) values('Industrial Biotechnology');
insert into subjects(subject) values('Industrial Engineering');
insert into subjects(subject) values('Inter-American Studies');
insert into subjects(subject) values('International Affairs');
insert into subjects(subject) values('Italian');
insert into subjects(subject) values('Japanese Language and Culture');
insert into subjects(subject) values('Law');
insert into subjects(subject) values('Law, Natural Resources Law and International Environmental Law');
insert into subjects(subject) values('Literature, Culture and Media');
insert into subjects(subject) values('Mathematics');
insert into subjects(subject) values('Mechanical Engineering');
insert into subjects(subject) values('Medical Life Sciences');
insert into subjects(subject) values('Medical Sciences');
insert into subjects(subject) values('Medieval Icelandic Studies');
insert into subjects(subject) values('Midwifery');
insert into subjects(subject) values('Museum Studies');
insert into subjects(subject) values('Nordicsters Programme in Gerontology');
insert into subjects(subject) values('Nordic Studies');
insert into subjects(subject) values('Nursing');
insert into subjects(subject) values('Nutrition');
insert into subjects(subject) values('Pharmaceutical Sciences');
insert into subjects(subject) values('Pharmacy');
insert into subjects(subject) values('Physics');
insert into subjects(subject) values('Political Science');
insert into subjects(subject) values('Psychology');
insert into subjects(subject) values('Public');
insert into subjects(subject) values('Renewable energy');
insert into subjects(subject) values('Small State Studies: Small States in the International System');
insert into subjects(subject) values('Sociology');
insert into subjects(subject) values('Software Engineering');
insert into subjects(subject) values('Spanish');
insert into subjects(subject) values('Statistics');
insert into subjects(subject) values('Swedish');
insert into subjects(subject) values('Tourism Studies');
insert into subjects(subject) values('Viking and Medieval Norse Studies');
