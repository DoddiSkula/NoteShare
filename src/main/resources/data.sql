-- data

-- schools
insert into schools(name, level) values ('University of Iceland', 'University');
insert into schools(name, level) values ('Reykjavik University', 'University');

-- degrees
insert into degrees(degree) values ('Bachelor');
insert into degrees(degree) values ('Master');
insert into degrees(degree) values ('Doctoral');

-- subjects
insert into subjects(subject) values('Software Engineering');
insert into subjects(subject) values('Computer Science');
insert into subjects(subject) values('Mathematics');
insert into subjects(subject) values('Law');
insert into subjects(subject) values('Mechatronics Engineering');
insert into subjects(subject) values('Department of Psychology');


-- users
insert into users(school_id, username, password, email, admin) values (1, 'admin', 'admin', 'admin@admin.com', true);

-- courses
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'STÆ302G', 'Mathematical Analysis III');
insert into courses(school_id, degree_id, short_name, name) values (2, 1, 'L-102-STSR', 'Constitutional Law');
insert into courses(school_id, degree_id, short_name, name) values (2, 1, 'L-502-SKAT', 'Tax Law');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'STÆ105G', 'Practical Mathematical Analysis');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL101G', 'Computer Science 1');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL104G', 'Mathematical Structure');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL107G', 'Web Programming 1');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'HBV201G', 'Graphical User Interface Programming');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'REI201G', 'Mathematics and Scientific Computing');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL203G', 'Computer Science 2');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖV201G', 'Digital Circuit Design and Analysis');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖV202G', 'Digital Circuit Design and Analysis - lab');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL303G', 'Data Base Theory and Practice');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL304G', 'Programming Languages');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL309G', 'Computer organization and programming');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'HBV401G', 'Software Development');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'STÆ209G', 'Statistics and Data Analysis');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL401G', 'Operating Systems');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL403G', 'Analysis of Algorithms');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'HBV501G', 'Software Project 1');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL301G', 'Formal Languages and Computability');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'HBV503G', 'Software Project 2');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'GKY001M', 'Mentor in Sprettur');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'HBV004G', 'Internship');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'HBV103M', 'Software Maintenance');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'HBV261L', 'Final project');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'HBV502G', 'Hackathon Project');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'IÐN102M', 'Computational Intelligence');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'IÐN103G', 'Engineering Management');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'DMC101', 'Dummy Course I');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'DMC101', 'Dummy Course I');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'DMC202', 'Dummy Course II');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'DMC303', 'Dummy Course III');
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'DMC404', 'Dummy Course IV');
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'DMC505', 'Dummy Course V');
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'DMC606', 'Dummy Course VI');
insert into courses(school_id, degree_id, short_name, name) values (1, 3, 'DMC707', 'Dummy Course VII');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'LÖG101G', 'Introduction to the Icelandic legal system');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'LÖG103G', 'Legal theory, Statutory Interpretation');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'LÖG108G', 'Propaedeutic Philosophy');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'LÖG201G', 'Constitutional Law and Introduction to Internatinal Law');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'LÖG203G', 'Family and Inheritance Law');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'LÖG206G', 'European Law');
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'LÖG303G', 'Law of Contracts');
insert into courses(school_id, degree_id, short_name, name) values (2, 1, 'T-738-EMBE', 'Embedded System Programming');
insert into courses(school_id, degree_id, short_name, name) values (2, 1, 'T-806-SIMU', 'Simulation II');
insert into courses(school_id, degree_id, short_name, name) values (2, 1, 'T-807-QUAL', 'Qualitiy Management');
insert into courses(school_id, degree_id, short_name, name) values (2, 1, 'T-808-NOLI', 'Applying Models in Management');
insert into courses(school_id, degree_id, short_name, name) values (2, 2, 'E-701-SAM1', 'Psychological Assessment I');
insert into courses(school_id, degree_id, short_name, name) values (2, 2, 'E-708-TRAU', 'Trauma and its sequels');
insert into courses(school_id, degree_id, short_name, name) values (2, 2, 'E-801-SAM2', 'Psychological Assessment II');


-- course_subjects
insert into course_subjects(course_id, subject_id) values(1, 1);
insert into course_subjects(course_id, subject_id) values(1, 3);
insert into course_subjects(course_id, subject_id) values(2, 4);
insert into course_subjects(course_id, subject_id) values(1, 4);
insert into course_subjects(course_id, subject_id) values(2, 1);
insert into course_subjects(course_id, subject_id) values(4, 2);
insert into course_subjects(course_id, subject_id) values(5, 2);
insert into course_subjects(course_id, subject_id) values(6, 2);
insert into course_subjects(course_id, subject_id) values(7, 2);
insert into course_subjects(course_id, subject_id) values(8, 2);
insert into course_subjects(course_id, subject_id) values(9, 2);
insert into course_subjects(course_id, subject_id) values(10, 2);
insert into course_subjects(course_id, subject_id) values(11, 2);
insert into course_subjects(course_id, subject_id) values(12, 2);
insert into course_subjects(course_id, subject_id) values(13, 2);
insert into course_subjects(course_id, subject_id) values(14, 2);
insert into course_subjects(course_id, subject_id) values(15, 2);
insert into course_subjects(course_id, subject_id) values(16, 2);
insert into course_subjects(course_id, subject_id) values(17, 2);
insert into course_subjects(course_id, subject_id) values(18, 2);
insert into course_subjects(course_id, subject_id) values(19, 2);
insert into course_subjects(course_id, subject_id) values(20, 2);
insert into course_subjects(course_id, subject_id) values(20, 2);
insert into course_subjects(course_id, subject_id) values(22, 2);
insert into course_subjects(course_id, subject_id) values(22, 2);
insert into course_subjects(course_id, subject_id) values(37, 4);
insert into course_subjects(course_id, subject_id) values(38, 4);
insert into course_subjects(course_id, subject_id) values(39, 4);
insert into course_subjects(course_id, subject_id) values(40, 4);
insert into course_subjects(course_id, subject_id) values(41, 4);
insert into course_subjects(course_id, subject_id) values(42, 4);
insert into course_subjects(course_id, subject_id) values(43, 4);
insert into course_subjects(course_id, subject_id) values(44, 5);
insert into course_subjects(course_id, subject_id) values(45, 5);
insert into course_subjects(course_id, subject_id) values(46, 5);
insert into course_subjects(course_id, subject_id) values(47, 5);
insert into course_subjects(course_id, subject_id) values(48, 6);
insert into course_subjects(course_id, subject_id) values(49, 6);
insert into course_subjects(course_id, subject_id) values(50, 6);


-- user_courses
insert into user_courses(user_id, course_id) values (1, 1);
insert into user_courses(user_id, course_id) values (1, 2);
insert into user_courses(user_id, course_id) values (1, 3);
insert into user_courses(user_id, course_id) values (1, 4);
insert into user_courses(user_id, course_id) values (1, 5);
insert into user_courses(user_id, course_id) values (1, 6);
insert into user_courses(user_id, course_id) values (1, 7);


-- more subjects
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
insert into subjects(subject) values('Computational Engineering');
insert into subjects(subject) values('Computer Engineering');
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
insert into subjects(subject) values('Spanish');
insert into subjects(subject) values('Statistics');
insert into subjects(subject) values('Swedish');
insert into subjects(subject) values('Tourism Studies');
insert into subjects(subject) values('Viking and Medieval Norse Studies');
