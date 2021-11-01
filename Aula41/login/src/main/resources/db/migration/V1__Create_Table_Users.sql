create table if not exists login.users (
	id int not null auto_increment,
	user_name varchar(255) DEFAULT NULL,
    full_name varchar(255) DEFAULT NULL,
    password varchar(255) DEFAULT NULL,
    account_non_expired bit(1) DEFAULT NULL,
    account_non_locked bit(1) DEFAULT NULL,
    credentials_non_expired bit(1) DEFAULT NULL,
    enabled bit(1) DEFAULT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY uk_user_name (user_name));

insert into login.users (user_name,full_name, password,account_non_expired, account_non_locked, credentials_non_expired,enabled)
values ('leandro', 'Leandro Costa', '$2a$16$9qr2tv0HmXbHBsx.TZFjfux742wCZM32a8Wi6iBqwIqaizlHPuxHS', b'1', b'1', b'1', b'1'),
	   ('flavio' , 'Flavio Costa', '$2a$16$h4yDQCYTy62R6xrtFDWONeMH3Lim4WQuU/aj8hxW.dJJoeyvtEkhK', b'1', b'1', b'1', b'1'),
       ('bruno'  , 'Bruno Sabia', '$2a$16$oAiRaXiR03Hs7vkgA0Vsn.Q9nL1lhUchBpZ3i4ttY8cKyr2mtaouu', b'1', b'1', b'1', b'1');




