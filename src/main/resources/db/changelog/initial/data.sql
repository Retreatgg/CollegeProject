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

insert into USER_AUTHORITY(user_email, role_id)
VALUES ( 'admin@email.com', 1 );