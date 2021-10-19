   create table if not exists login.permission (
	id int(20) not null auto_increment,
	description varchar(255),
	PRIMARY KEY(id)
);

INSERT Into login.permission(description) values ("ADMIN"),("MANAGER"),("COMMON_USER");