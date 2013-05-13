DROP DATABASE IF EXISTS wheel;
CREATE DATABASE wheel;
USE wheel;

CREATE TABLE author (
  id      INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name    VARCHAR(255),
  age     INT(11),
  book_id INT(11)
);

CREATE TABLE book (
  id       INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name     VARCHAR(255),
  category VARCHAR(255)
)