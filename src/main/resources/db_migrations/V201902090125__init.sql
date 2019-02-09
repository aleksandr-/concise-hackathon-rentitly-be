create table item (
  id bigserial primary key NOT NULL,
  name varchar(255) not null ,
  rating integer,
  location varchar(255),
  price real not null,
  imageUrl varchar(3000) null,
  description varchar(3000) null
);
