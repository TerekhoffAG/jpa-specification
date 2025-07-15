--liquibase formatted sql

--changeset any:1
insert into product_category(code, name) values
    ('CLOTHES', 'clothes'),
    ('FOOT', 'foot'),
    ('CARS', 'cars'),
    ('REALTY', 'realty'),
    ('VEGETABLES', 'vegetables'),
    ('FRUITS', 'fruits');

insert into product(id, name, cost, category_code) values
    ('3b62a1a6-502b-4de0-8029-98adf5bea000', 'Apple', 130.99, 'FRUITS'),
    ('3b62a1a6-502b-4de0-8029-98adf5bea001', 'Lime', 67.99, 'FRUITS'),
    ('3b62a1a6-502b-4de0-8029-98adf5bea002', 'Tomato', 95.78, 'VEGETABLES'),
    ('3b62a1a6-502b-4de0-8029-98adf5bea003', 'Pumpkin', 105.99, 'VEGETABLES'),
    ('3b62a1a6-502b-4de0-8029-98adf5bea004', 'Ford F150', 3500.99, 'CARS'),
    ('3b62a1a6-502b-4de0-8029-98adf5bea005', 'Toyota RAF4', 7999.99, 'CARS')