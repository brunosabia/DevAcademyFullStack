
create table if not exists login.user_permission (
  id_user int,
  id_permission int,
  PRIMARY KEY (id_user,id_permission),
  KEY fk_user_permission_permission (`id_permission`),
  CONSTRAINT fk_user_permission FOREIGN KEY (id_user) REFERENCES users (id),
  CONSTRAINT fk_user_permission_permission FOREIGN KEY (id_permission) REFERENCES permission (id)
);


 INSERT INTO login.user_permission (id_user, id_permission) VALUES
	(1, 1),
	(2, 1),
	(1, 2),
	(3, 1);