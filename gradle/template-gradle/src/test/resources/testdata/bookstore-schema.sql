CREATE TABLE authors (id  int,
                      firstName varchar(255), 
                      middleName varchar(255),
                      sirName varchar(255),
                      dateOfBirth date,
                      dateOfDeath date,
                      PRIMARY KEY(id));
                      
INSERT INTO authors values(1, 'Arthur', 'C', 'Clark', '1917-12-16', '2008-03-19');
INSERT INTO authors values(2, 'Douglas', 'Noel', 'Adams', '1952-03-11', '2001-05-11');

CREATE TABLE books (isbn varchar(20),
                    title varchar(255),
                    authorId int,
                    PRIMARY KEY (isbn),
                    FOREIGN KEY (authorId) REFERENCES authors(id));

INSERT INTO books values('0-453-00269-2', '2001: A Space Odyssey', 1);
INSERT INTO books values('0-671-69267-4', 'Dirk Gentlys Holistic Detective Agency', 2);