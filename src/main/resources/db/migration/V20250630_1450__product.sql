--liquibase formatted sql

--changeset any:1
create table product_category (
   code varchar(32) not null,
   name varchar(255),
   constraint pk_product_category primary key (code)
);

comment on table product_category is 'product category';
comment on column product_category.code is 'product category code';
comment on column product_category.name is 'product category name';

create table product (
   id uuid not null,
   name varchar(255),
   cost numeric(19, 2),
   category_code varchar(255),
   constraint pk_product primary key (id),
   constraint fk_product_on_category_code foreign key (category_code) references product_category (code)
);

comment on table product is 'product';
comment on column product.id is 'product id';
comment on column product.name is 'product name';
comment on column product.cost is 'product cost';
comment on column product.category_code is 'product category code';
