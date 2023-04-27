select *
from kodilla_course.users;

select LASTNAME
from users
where lastname = 'lee'; /* wyszukaj nazwiska z tabeli users, gdzie nazwisko=lee */
select *
from users
where ID > 3; /* czyli tu wyswietla 4 i 5 */

                 select *
from users
where ID > 3 or lastname = 'lee';

select * from users where (ID > 3 and lastname = 'Thomson') or firstname like  '%anie';
select count(*) from users where (ID > 3 and lastname = 'Thomson') or firstname like  '%anie';
select max(id) as identyfikator from users;

SELECT U.FIRSTNAME, U.LASTNAME, P.BODY
FROM USERS U
         left JOIN POSTS P ON U.ID = P.USER_ID;


CREATE TABLE POSTS
(
    ID SERIAL PRIMARY KEY,
    USER_ID BIGINT UNSIGNED NOT NULL,
    BODY VARCHAR(1024),
    FOREIGN KEY (USER_ID) REFERENCES USERS(ID)
);

INSERT INTO POSTS (USER_ID, BODY)
VALUES (1, 'This is my second post too!');

INSERT INTO POSTS (USER_ID, BODY)
VALUES (3, 'This is my first post too!');

INSERT INTO POSTS (USER_ID, BODY)
VALUES (3, 'How are you?');

INSERT INTO POSTS (USER_ID, BODY)
VALUES (1, 'Quite good, thanks bro!');

INSERT INTO POSTS (USER_ID, BODY)
VALUES (5, 'Yo all! Here is Thomas!');

-- 16.4
select * from issues;

select i1.*, i2.NAME
from issues i1
         join issueslists i2 on i1.ISSUESLIST_ID = i2.ID;

select i.*, u.FIRSTNAME, u.LASTNAME
from issues i
         join users u on i.USER_ID_ASSIGNEDTO = u.ID;

SELECT U.FIRSTNAME, U.LASTNAME, COUNT(i.USER_ID_ASSIGNEDTO) AS POSTS_NUMBER
FROM users U
         LEFT JOIN issues i on i.USER_ID_ASSIGNEDTO = u.ID
GROUP BY U.FIRSTNAME, U.LASTNAME
HAVING COUNT(i.USER_ID_ASSIGNEDTO) > 0;

INSERT INTO ISSUESLISTS (NAME)
VALUES ('ToDo'),
       ('In progress'),
       ('Done');

select * from users;
select * from posts;

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (4, 'Summary 1 for 1 Issue', 'Description 1 for 1 Issue', 1),
       (4, 'Summary 2 for 1 Issue', 'Description 2 for 1 Issue', 1),
       (4, 'Summary 3 for 1 Issue', 'Description 3 for 1 Issue', 2),
       (4, 'Summary 4 for 1 Issue', 'Description 4 for 1 Issue', 2),
       (4, 'Summary 5 for 1 Issue', 'Description 5 for 1 Issue', 3);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (5, 'Summary 1 for 2 Issue', 'Description 1 for 2 Issue', 1),
       (5, 'Summary 2 for 2 Issue', 'Description 2 for 2 Issue', 2),
       (5, 'Summary 3 for 2 Issue', 'Description 3 for 2 Issue', 2),
       (5, 'Summary 4 for 2 Issue', 'Description 4 for 2 Issue', 3),
       (5, 'Summary 5 for 2 Issue', 'Description 5 for 2 Issue', 4);

INSERT INTO ISSUES (ISSUESLIST_ID, SUMMARY, DESCRIPTION, USER_ID_ASSIGNEDTO)
VALUES (6, 'Summary 1 for 3 Issue', 'Description 1 for 3 Issue', 1),
       (6, 'Summary 2 for 3 Issue', 'Description 2 for 3 Issue', 2),
       (6, 'Summary 3 for 3 Issue', 'Description 3 for 3 Issue', 3),
       (6, 'Summary 4 for 3 Issue', 'Description 4 for 3 Issue', 4),
       (6, 'Summary 5 for 3 Issue', 'Description 5 for 3 Issue', 5);


