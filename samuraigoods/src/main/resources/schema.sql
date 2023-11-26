CREATE TABLE IF NOT EXISTS goods (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    goods_name VARCHAR(50) NOT NULL,  
    kind VARCHAR(50),
    maker_name VARCHAR(50),
    price INT NOT NULL,
    tax INT NOT NULL
);
