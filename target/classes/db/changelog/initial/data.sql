insert into INSTITUTIONS(NAME)
values ('Институт дизайна, архитектура и текстиля'),
       ('Институт цифровой трансформации и программирования'),
       ('Институт строительства и инновационных технологий'),
       ('Институт энергетики и транспорта'),
       ('Институт экономики и менеджмента'),
       ('Институт российско-кыргызского института автоматизации управления бизнеса'),
       ('Институт межкультурной коммуникации и психологии'),
       ('Институт маркетинга и электронной коммерции'),
       ('Структурные подразделения');


insert into LEVEL_OF_EDUCATION(NAME)
values ('Колледж'),
       ('Бакалавриат');

insert into FORM_EDUCATION (NAME)
values ('Очно'),
       ('Заочно');

insert into AUTHORITIES(AUTHORITY)
values ( 'ADMIN' );

insert into USERS(email, password, enabled)
VALUES ( 'admin@email.com', 'comtehnoAdmin', true );
--
-- insert into USER_AUTHORITY(user_email, role_id)
-- VALUES ( 'admin@email.com', 1 );
--
-- insert into TEACHER_THROUGH_THE_EYES_OF_A_STUDENT(institution_name, "group", discipline, teacher_full_name, presentation_of_material, interest_subject, proportionality_of_requirements_in_examinations, objectivity_in_assessment, relations_with_students, ability_to_dialogue_with_student_audiences, using_modern_teaching_methods, involving_students_in_scientific_activities, culture_of_speech, appearance, evaluation_of_the_work_of_the_group_curator, date_of_passage)
-- values
--     ('Институт экономики и менеджмента', 'Группа 101', 'Экономика', 'Иванова Елена Петровна', 4, 5, 4, 5, 4, 5, 3, 4, 5, 5, 4, '2024-05-19'),
--     ('Институт дизайна, архитектура и текстиля', 'Группа 201', 'Дизайн', 'Смирнова Анна Игоревна', 5, 4, 5, 4, 5, 4, 5, 4, 5, 4, 5, '2024-05-20'),
--     ('Институт цифровой трансформации и программирования', 'Группа 301', 'Программирование', 'Петров Иван Сергеевич', 5, 5, 5, 4, 4, 5, 5, 5, 5, 5, 4, '2024-05-21'),
--     ('Институт российско-кыргызского института автоматизации управления бизнеса', 'Группа 401', 'Управление бизнесом', 'Крылов Дмитрий Александрович', 3, 4, 3, 3, 4, 3, 4, 3, 3, 4, 3, '2024-05-22'),
--     ('Институт межкультурной коммуникации и психологии', 'Группа 501', 'Психология', 'Михайлова Ольга Николаевна', 4, 3, 4, 4, 5, 4, 4, 3, 4, 4, 3, '2024-05-23'),
--     ('Институт маркетинга и электронной коммерции', 'Группа 601', 'Маркетинг', 'Гаврилова Марина Андреевна', 5, 5, 4, 5, 4, 5, 4, 5, 5, 5, 4, '2024-05-24'),
--     ('Институт строительства и инновационных технологий', 'Группа 701', 'Строительство', 'Попов Алексей Владимирович', 4, 4, 4, 4, 3, 4, 4, 3, 4, 4, 3, '2024-05-25'),
--     ('Институт энергетики и транспорта', 'Группа 801', 'Энергетика', 'Сидоров Владимир Игоревич', 3, 4, 3, 3, 3, 3, 4, 3, 3, 3, 3, '2024-05-26'),
--     ('Институт экономики и менеджмента', 'Группа 901', 'Менеджмент', 'Новиков Александр Степанович', 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, '2024-05-27'),
--     ('Институт дизайна, архитектура и текстиля', 'Группа 1001', 'Текстиль', 'Козлова Екатерина Александровна', 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, '2024-05-28');
--
-- insert into EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_STUDENTS(institution_name, "group", form_of_education, level_of_study, course, correct_choice_organization,
--                                                                   correct_choice_direction, quality_teaching, pay_level, participation_in_science, quality_of_events,
--                                                                   relevance_of_information, modern_equipment, objectivity_of_teachers, learning_outcomes, access_to_technology,
--                                                                   library_work, accessible_electronic_materials, psychological_support,
--                                                                   canteen_work, medical_service, teaching_staff, best_teacher, worst_teacher, positive,
--                                                                   negative, appearance, date_of_passage)
-- values
--     ('Институт строительства и инновационных технологий', 'AI3-45', 'Очно', 'Бакалавр', 1, 3, 4, 3, 4, 3, 3, 3, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 'Антон Викторович', 'Мария Петровна', 'Столовая', 'Пары', 'Нормально', current_timestamp),
--     ('Институт экономики и менеджмента', 'BM2-12', 'Очно', 'Бакалавр', 3, 4, 5, 4, 3, 5, 5, 4, 4, 5, 5, 4, 5, 5, 5, 4, 5, 5, 'Василиса Николаевна', 'Иван Сергеевич', 'Столовая', 'Пары', 'Отлично', current_timestamp),
--     ('Институт российско-кыргызского института автоматизации управления бизнеса', 'MP1-32', 'Очно', 'Бакалавр', 2, 5, 4, 3, 4, 4, 4, 4, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 'Ирина Владимировна', 'Сергей Васильевич', 'Столовая', 'Пары', 'Красиво', current_timestamp),
--     ('Институт межкультурной коммуникации и психологии', 'IM2-21', 'Очно', 'Бакалавр', 3, 4, 3, 4, 4, 5, 4, 4, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 'Мария Александровна', 'Александр Владимирович', 'Столовая', 'Пары', 'Красиво', current_timestamp),
--     ('Институт цифровой трансформации и программирования', 'DP3-51', 'Очно', 'Бакалавр', 1, 3, 3, 3, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 'Иван Владимирович', 'Екатерина Ивановна', 'Столовая', 'Пары', 'Нормально', current_timestamp),
--     ('Институт маркетинга и электронной коммерции', 'MM3-42', 'Очно', 'Бакалавр', 2, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 'Андрей Сергеевич', 'Екатерина Васильевна', 'Столовая', 'Пары', 'Отлично', current_timestamp),
--     ('Институт экономики и менеджмента', 'EM1-15', 'Очно', 'Бакалавр', 3, 5, 4, 5, 4, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 'Елена Владимировна', 'Максим Васильевич', 'Столовая', 'Пары', 'Красиво', current_timestamp),
--     ('Институт энергетики и транспорта', 'ET2-34', 'Очно', 'Бакалавр', 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 'Наталья Александровна', 'Павел Андреевич', 'Столовая', 'Пары', 'Нормально', current_timestamp),
--     ('Институт строительства и инновационных технологий', 'SI3-26', 'Очно', 'Бакалавр', 1, 2, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 'Ольга Васильевна', 'Дмитрий Николаевич', 'Столовая', 'Пары', 'Обычно', current_timestamp),
--     ('Институт дизайна, архитектура и текстиля', 'DA2-16', 'Очно', 'Бакалавр', 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 'Ксения Александровна', 'Артем Михайлович', 'Столовая', 'Пары', 'Отлично', current_timestamp);
--
-- insert into EDUCATIONAL_ORGANIZATION_THROUGH_THE_EYES_OF_UNDERGRADUATES(institution_name, "group", form_of_education, course, correct_choice_organization,
--                                                                         correct_choice_direction, quality_teaching, pay_level, participation_in_science,
--                                                                         quality_of_events, relevance_of_information, modern_equipment, objectivity_of_teachers,
--                                                                         learning_outcomes, access_to_technology, library_work, accessible_electronic_materials,
--                                                                         psychological_support, canteen_work, medical_service, teaching_staff, best_teacher,
--                                                                         worst_teacher, positive, negative, appearance, date_of_passage)
-- VALUES     ('Институт дизайна, архитектура и текстиля', 'DA2-16', 'Очно', 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 'Ксения Александровна', 'Артем Михайлович', 'Столовая', 'Пары', 'Отлично', current_timestamp);
--
-- insert into EMPLOYER_ASSESSMENT(educational_programs, start_year_cooperation, count_completed_internship, count_employed, count_working_in_their_specialty, student_training, professional_training_graduates, general_theoretical_training, basic_practical_skills, written_and_oral_literacy, ability_to_acquire_new_knowledge, student_abilities, creativity, importance_foreign_languages, need_for_interpersonal_skills, work_skills, teamwork_skills, independent_workskills, questions_in_the_questionnaire, your_suggestions, your_suggestions_for_changes, date_of_passage) VALUES (  );
--
-- insert into SATISFACTION_RATING(name_of_the_structural_unit, is_employee_of_the_administration, academic_title, trust_level_in_management, trust_level_in_you, degree_of_involvement, relationship_level, recognition_of_your_successes_by_you, recognition_of_your_successes_by_management, help_guide, level_of_regulation, equipment_conditions, safety_and_security, educational_institution, satisfaction_with_technology, quality_satisfaction, possibilities_org, possibilities_adm, salary, motivation_system, level_organization, collective_agreement, labor_regulations, quality_management_system, influence_qms, organization_and_rating, suggestions_for_improvements, specific_proposals, privileges, interference, activity_interference, you_are_missing, training, date_of_passage) VALUES (  );