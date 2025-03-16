create table tags
(
    id int DEFAULT nextval('auto_sequence') PRIMARY KEY,
    name     varchar(255) not null
);

-- create the user_tags join table
create table user_tags
(
   user_id bigint not null,
   tag_id int not null,
   PRIMARY key (user_id, tag_id),
   foreign key (user_id) references users (id) on delete cascade,
   foreign key (tag_id) references tags (id) on delete cascade
);