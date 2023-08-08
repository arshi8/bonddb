CREATE TABLE trades (
    trade_id INT AUTO_INCREMENT PRIMARY KEY,
    quantity INT,
    status VARCHAR(255),
    price INT,
    type VARCHAR(255),
    trade_date DATETIME,
    book_id INT,
    counterparty_id INT,
    security_id INT,
    settlement_date DATETIME
);



  CREATE TABLE securities (
    security_id INT AUTO_INCREMENT PRIMARY KEY,
    maturity_date DATETIME,
    face_value INT,
    status VARCHAR(255),
    isin VARCHAR(255),
    cusip VARCHAR(255),
    issuer VARCHAR(255),
    coupon VARCHAR(255),
    type VARCHAR(255)
);
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    user_name VARCHAR(255),
    user_email VARCHAR(255),
    user_role VARCHAR(255)
);
CREATE TABLE bookusers (
    access_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    book_id INT
);





INSERT INTO trades (quantity, status, price, type, trade_date, book_id, counterparty_id, security_id, settlement_date)
VALUES
    (2, 'Settled', 200, 'Buy', '2021-01-01T00:00:00', 102, 1001, 1001, '2023-06-01T00:00:00'),
    (3, 'Not-Settled', 150, 'Sell', '2023-04-20T00:00:00', 101, 1002, 1003, '2023-12-20T00:00:00'),
    (6, 'Settled', 450, 'Buy', '2020-10-30T00:00:00', 101, 1002, 1002, '2022-10-30T00:00:00'),
    (5, 'Settled', 400, 'Sell', '2022-05-25T00:00:00', 102, 1003, 1004, '2023-03-10T00:00:00'),
    (18, 'Not-Settled', 900, 'Buy', '2020-12-15T00:00:00', 101, 1001, 1005, '2024-12-15T00:00:00');
    


INSERT INTO securities (maturity_date, face_value, status, isin, cusip, issuer, coupon, type)
VALUES
    ('2023-08-02T00:00:00', 100, 'Matured', 'IN123456A78B', '123456121', 'Reserve Bank Of India', 'CPNCD001', 'GOVT'),
    ('2023-08-12T00:00:00', 75, 'Not-Matured', 'US123456A78C', '123456122', 'Morgan Stanley', 'CPNCD002', 'CORP'),
    ('2023-06-12T00:00:00', 50, 'Matured', 'US123456A78D', '123456123', 'Bank Of America', 'CPNCD003', 'GOVT'),
    ('2023-07-24T00:00:00', 80, 'Matured', 'UK123456A78E', '123456124', 'Barclays', 'CPNCD004', 'CORP'),
    ('2022-12-25T00:00:00', 50, 'Matured', 'HK123456A78F', '123456125', 'HSBC', 'CPNCD005', 'CORP');

INSERT INTO users (user_name, user_email, user_role)
VALUES
    ('User1', 'User1@domain.com', 'Director'),
    ('User2', 'User2@domain.com', 'Vice President'),
    ('User3', 'User3@domain.com', 'Analyst');

INSERT INTO bookusers (access_id,user_id, book_id)
VALUES
    (1,1001, 101),
    (2,2001, 102);
