CREATE TABLE user(
    id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(20) NOT NULL,
    gender VARCHAR(5),
    age INT,
    address VARCHAR(32), 
    qq VARCHAR(20),
    email VARCHAR(50),
    username VARCHAR(32),
    password VARCHAR(32)
);