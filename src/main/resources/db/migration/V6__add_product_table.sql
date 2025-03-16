create table products
(
    id bigint DEFAULT nextval('auto_sequence') PRIMARY KEY,
    name     varchar(255),
    price decimal(10, 2),
    category_id smallint,
    constraint fK_category
        foreign key (category_id) references categories (id) ON DELETE RESTRICT
)