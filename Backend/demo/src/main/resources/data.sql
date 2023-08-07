
CREATE TABLE trades (
    trade_id INT PRIMARY KEY,
    quantity INT,
    status VARCHAR(255),
    price INT,
    type VARCHAR(255),
    trade_date TIMESTAMP,
    book_id INT
);
  
  
CREATE TABLE securities (
    security_id INT PRIMARY KEY,
    maturity_date TIMESTAMP,
    face_value INT,
    status VARCHAR(255)
);

INSERT INTO trades (trade_id, quantity, status, price, type, trade_date, book_id)
VALUES
    (1, 250, 'ACTIVE', 90, 'SELL', '2023-08-07 19:45:30', 122),
(2, 150, 'ACTIVE', 60, 'SELL', '2023-08-07 16:45:30', 124),
    (3, 75, 'PENDING', 80, 'BUY', '2023-08-07 17:15:00', 125),
    (4, 200, 'ACTIVE', 70, 'SELL', '2023-08-07 18:00:00', 126),
    (5, 50, 'ACTIVE', 90, 'BUY', '2023-08-07 19:30:00', 127),
    (6, 120, 'INACTIVE', 55, 'SELL', '2023-08-08 10:00:00', 128),
    (7, 80, 'ACTIVE', 75, 'BUY', '2023-08-08 11:45:00', 129),
    (8, 300, 'PENDING', 100, 'SELL', '2023-08-08 13:15:00', 130),
    (9, 150, 'ACTIVE', 85, 'BUY', '2023-08-08 14:30:00', 131),
    (10, 200, 'ACTIVE', 70, 'SELL', '2023-08-08 15:45:00', 132);
    
    


INSERT INTO securities (security_id, maturity_date, face_value, status)
VALUES
    (1, '2023-08-15 00:00:00', 1000, 'ACTIVE'),
    (2, '2024-06-30 00:00:00', 1500, 'PENDING'),
    (3, '2025-01-20 00:00:00', 800, 'ACTIVE'),
    (4, '2024-12-10 00:00:00', 1200, 'INACTIVE'),
    (5, '2023-11-05 00:00:00', 900, 'ACTIVE'),
    (6, '2025-03-18 00:00:00', 1300, 'PENDING'),
    (7, '2024-08-22 00:00:00', 1100, 'ACTIVE'),
    (8, '2025-02-28 00:00:00', 1600, 'INACTIVE'),
    (9, '2023-09-12 00:00:00', 950, 'ACTIVE'),
    (10, '2024-07-10 00:00:00', 1400, 'PENDING');

