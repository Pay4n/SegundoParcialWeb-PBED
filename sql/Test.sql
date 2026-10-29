CREATE DATABASE `TEST`;
use TEST;

CREATE TABLE TBL_ROL (
                           ID int NOT NULL AUTO_INCREMENT ,
                           ROL varchar(45) NOT NULL,
                           DESCRIPCION varchar(45) DEFAULT NULL,
                           PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;