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


-- users
insert into users(school_id, username, password, email, admin) values (1, 'admin', 'admin', 'admin@admin.com', true);

-- courses
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'STÆ302G', 'Mathematical Analysis III');--1
insert into courses(school_id, degree_id, short_name, name) values (2, 1, 'L-102-STSR', 'Constitutional Law');--2
insert into courses(school_id, degree_id, short_name, name) values (2, 1, 'L-502-SKAT', 'Tax Law');--3
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'STÆ105G', 'Practical Mathematical Analysis');--4
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL101G', 'Computer Science 1');--5
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL104G', 'Mathematical Structure');--6
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL107G', 'Web Programming 1');--7
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'HBV201G', 'Graphical User Interface Programming');--8
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'REI201G', 'Mathematics and Scientific Computing');--9
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL203G', 'Computer Science 2');--10
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖV201G', 'Digital Circuit Design and Analysis');--11
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖV202G', 'Digital Circuit Design and Analysis - lab');--12
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL303G', 'Data Base Theory and Practice');--13
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL304G', 'Programming Languages');--14
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL309G', 'Computer organization and programming');--15
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'HBV401G', 'Software Development');--16
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'STÆ209G', 'Statistics and Data Analysis');--17
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL401G', 'Operating Systems');--18
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL403G', 'Analysis of Algorithms');--19
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'HBV501G', 'Software Project 1');--20
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'TÖL301G', 'Formal Languages and Computability');--21
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'HBV503G', 'Software Project 2');--22
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'GKY001M', 'Mentor in Sprettur');--23
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'HBV004G', 'Internship');--24
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'HBV103M', 'Software Maintenance');--25
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'HBV261L', 'Final project');--26
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'HBV502G', 'Hackathon Project');--27
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'IÐN102M', 'Computational Intelligence');--28
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'IÐN103G', 'Engineering Management');--29
insert into courses(school_id, degree_id, short_name, name) values (1, 3, 'LÖG561L', 'Doctoral studies');--30
insert into courses(school_id, degree_id, short_name, name) values (1, 3, 'STÆ562L', 'Final project');--31
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'STÆ529M', 'Bayesian Data Analysis');--32
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'STÆ442L', 'Final project');--33
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'STÆ313M', 'Theoretical Statistics');--34
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'STÆ310M', 'Theory of linear models');--35
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'STÆ312M', 'Applied Linear Statistical models');--36
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'MAS201M', 'Statistical Consulting');--37
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'LÖG101G', 'Introduction to the Icelandic legal system');--38
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'LÖG103G', 'Legal theory, Statutory Interpretation');--39
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'LÖG108G', 'Propaedeutic Philosophy');--40
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'LÖG201G', 'Constitutional Law and Introduction to Internatinal Law');--41
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'LÖG203G', 'Family and Inheritance Law');--42
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'LÖG206G', 'European Law');--43
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'LÖG303G', 'Law of Contracts');--44
insert into courses(school_id, degree_id, short_name, name) values (2, 1, 'T-738-EMBE', 'Embedded System Programming');--45
insert into courses(school_id, degree_id, short_name, name) values (2, 1, 'T-806-SIMU', 'Simulation II');--46
insert into courses(school_id, degree_id, short_name, name) values (2, 1, 'T-807-QUAL', 'Quality Management');--47
insert into courses(school_id, degree_id, short_name, name) values (2, 1, 'T-808-NOLI', 'Applying Models in Management');--48
insert into courses(school_id, degree_id, short_name, name) values (2, 2, 'E-701-SAM1', 'Psychological Assessment I');--49
insert into courses(school_id, degree_id, short_name, name) values (2, 2, 'E-708-TRAU', 'Trauma and its sequels');--50
insert into courses(school_id, degree_id, short_name, name) values (2, 2, 'E-801-SAM2', 'Psychological Assessment II');--51
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'HBV103M', 'Software Maintenance');--52
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'HBV442L', 'Final project');--53
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'HBV505M', 'Software Quality Management');--54
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'IÐN101', 'Quality Management');--55
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'HBV204M', 'Software Quality Management');--56
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'HBV205M', 'Software Testing'); --57
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'IÐN201F', 'Organization and Management'); --58
insert into courses(school_id, degree_id, short_name, name) values (1, 2, 'TÖL204F', 'Seminar for MS-Students'); --59
insert into courses(school_id, degree_id, short_name, name) values (1, 3, 'TÖL561L', 'Final project'); --60
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'FOM101G', 'Work Methods in Sociology, Anthropology and Folkloristics'); --61
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'MAN103G', 'Introduction to Anthropology'); --62
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'MAN106G', 'Ethnography I'); --63
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'MAN201G', 'Research methods I');--64
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'MAN203G', 'The history of theory in Anthropology');--65
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'MAN204G', 'Ethnography II');--66
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'MAN330G', 'Introduction to Biological Anthropology');--67
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'MAN331G', 'Theories in Anthropology II');--68
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'MAN403G', 'Qualitative Research Methods II');--69
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'MAN261L', 'BA Thesis in Anthropology');--70
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'FÉL326G', 'Sexualities and bodies:Pleasure and pain');--71
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'ÞJÓ323G', 'Oral Tradition in Sagas and Eddas');--72
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'FÉL443G', 'Social media');--73
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'ÞJÓ021M', 'Gender and Folklore');--74
insert into courses(school_id, degree_id, short_name, name) values (1, 1, 'ÞJÓ437G', 'Old Nordic Religion and Belief');--75





-- course_subjects
insert into course_subjects(course_id, subject_id) values(1, 1);
insert into course_subjects(course_id, subject_id) values(1, 3);
insert into course_subjects(course_id, subject_id) values(2, 4);
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
insert into course_subjects(course_id, subject_id) values(20, 1);
insert into course_subjects(course_id, subject_id) values(20, 2);
insert into course_subjects(course_id, subject_id) values(22, 2);
insert into course_subjects(course_id, subject_id) values(22, 1);
insert into course_subjects(course_id, subject_id) values(30, 4);
insert into course_subjects(course_id, subject_id) values(31, 3);
insert into course_subjects(course_id, subject_id) values(32, 3);
insert into course_subjects(course_id, subject_id) values(33, 3);
insert into course_subjects(course_id, subject_id) values(34, 3);
insert into course_subjects(course_id, subject_id) values(35, 3);
insert into course_subjects(course_id, subject_id) values(36, 3);
insert into course_subjects(course_id, subject_id) values(37, 4);
insert into course_subjects(course_id, subject_id) values(38, 4);
insert into course_subjects(course_id, subject_id) values(39, 4);
insert into course_subjects(course_id, subject_id) values(40, 4);
insert into course_subjects(course_id, subject_id) values(41, 4);
insert into course_subjects(course_id, subject_id) values(42, 4);
insert into course_subjects(course_id, subject_id) values(43, 4);
insert into course_subjects(course_id, subject_id) values(44, 4);
insert into course_subjects(course_id, subject_id) values(45, 5);
insert into course_subjects(course_id, subject_id) values(46, 5);
insert into course_subjects(course_id, subject_id) values(47, 5);
insert into course_subjects(course_id, subject_id) values(48, 6);
insert into course_subjects(course_id, subject_id) values(49, 6);
insert into course_subjects(course_id, subject_id) values(50, 6);
insert into course_subjects(course_id, subject_id) values(51, 1);
insert into course_subjects(course_id, subject_id) values(52, 1);
insert into course_subjects(course_id, subject_id) values(52, 1);
insert into course_subjects(course_id, subject_id) values(53, 1);
insert into course_subjects(course_id, subject_id) values(54, 1);
insert into course_subjects(course_id, subject_id) values(55, 1);
insert into course_subjects(course_id, subject_id) values(56, 1);
insert into course_subjects(course_id, subject_id) values(57, 1);
insert into course_subjects(course_id, subject_id) values(58, 1);
insert into course_subjects(course_id, subject_id) values(59, 2);
insert into course_subjects(course_id, subject_id) values(59, 1);
insert into course_subjects(course_id, subject_id) values(61, 7); -- anthropology
insert into course_subjects(course_id, subject_id) values(62, 7); -- anthropology
insert into course_subjects(course_id, subject_id) values(63, 7); -- anthropology
insert into course_subjects(course_id, subject_id) values(64, 7); -- anthropology
insert into course_subjects(course_id, subject_id) values(65, 7); -- anthropology
insert into course_subjects(course_id, subject_id) values(66, 7); -- anthropology
insert into course_subjects(course_id, subject_id) values(67, 7); -- anthropology
insert into course_subjects(course_id, subject_id) values(68, 7); -- anthropology
insert into course_subjects(course_id, subject_id) values(69, 7); -- anthropology
insert into course_subjects(course_id, subject_id) values(70, 7); -- anthropology
insert into course_subjects(course_id, subject_id) values(71, 7); -- anthropology
insert into course_subjects(course_id, subject_id) values(72, 7); -- anthropology
insert into course_subjects(course_id, subject_id) values(73, 7); -- anthropology
insert into course_subjects(course_id, subject_id) values(74, 7); -- anthropology
insert into course_subjects(course_id, subject_id) values(75, 7); -- anthropology




-- user_courses
insert into user_courses(user_id, course_id) values (1, 1);
insert into user_courses(user_id, course_id) values (1, 2);
insert into user_courses(user_id, course_id) values (1, 3);
insert into user_courses(user_id, course_id) values (1, 4);
insert into user_courses(user_id, course_id) values (1, 5);
insert into user_courses(user_id, course_id) values (1, 6);
insert into user_courses(user_id, course_id) values (1, 7);



