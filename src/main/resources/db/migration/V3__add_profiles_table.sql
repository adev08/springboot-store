create table profiles
(
    id bigint DEFAULT nextval('auto_sequence') PRIMARY KEY,
    bio    text ,
    phone_number varchar(15),
    date_of_birth date,
    loyalty_points int DEFAULT 0, 
    foreign key (id) references users(id)
  );