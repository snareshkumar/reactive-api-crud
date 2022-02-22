CREATE TABLE IF NOT EXISTS EMPLOYEE
(
    ID INT(13) AUTO_INCREMENT PRIMARY KEY,
    EMPLOYEE_NAME     VARCHAR(30)         NOT NULL,
    DEPARTMENT VARCHAR(30) NOT NULL,
    GENDER       VARCHAR(6),
    EMPLOYER_NAME      VARCHAR(30) NOT NULL,
    DESIGNATION  VARCHAR(80)   NOT NULL
);

CREATE TABLE IF NOT EXISTS ADDRESS
(
  ID INT(13) AUTO_INCREMENT PRIMARY KEY,
  ADDRESS_LINE1 VARCHAR(35) NOT NULL,
  ADDRESS_LINE2 VARCHAR(35) NOT NULL,
  CITY VARCHAR(35) NOT NULL,
  STATE VARCHAR(35) NOT NULL,
  COUNTRY VARCHAR(35) ,
  EMAIL VARCHAR(40) NOT NULL,
  PHONE_NUMBER INT(10),
  ADDRESS_TYPE VARCHAR(6),
  EMPLOYEE_ID INT(13)
);