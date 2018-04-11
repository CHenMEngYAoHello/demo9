DROP TABLE IF EXISTS users;

CREATE TABLE users
(id INT PRIMARY KEY AUTO_INCREMENT
  ,name VARCHAR(30)
  ,birthday DATE
  ,salary DOUBLE
  ,status BOOLEAN
);

INSERT INTO users (name, birthday, salary, status)
VALUES ('Tom', DATE'1990-01-01', 5000, TRUE);

INSERT INTO users (name, birthday, salary, status)
VALUES ('Jerry', DATE'1991-12-12', 3000, TRUE);