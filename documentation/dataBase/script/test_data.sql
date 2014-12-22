INSERT INTO `stairway_sounds`.`roles` (`id_role`,`name`) VALUES (1,'ADMIN');
INSERT INTO `stairway_sounds`.`roles` (`id_role`,`name`) VALUES (2,'USER');
INSERT INTO `stairway_sounds`.`roles` (`id_role`,`name`) VALUES (3,'MANAGER');

-- sha256(password) = 5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8

INSERT INTO `stairway_sounds`.`users` (`id_user`,`email`,`username`,`pass_hash`,`pass_salt`,`password`)
	VALUES(2,'email2@mail.com','uName2','pHash2','pSalt2','5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8');
INSERT INTO `stairway_sounds`.`users` (`id_user`,`email`,`username`,`pass_hash`,`pass_salt`,`password`)
	VALUES(1,'email1@mail.com','uName1','pHash1','pSalt1','5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8');
INSERT INTO `stairway_sounds`.`users` (`id_user`,`email`,`username`,`pass_hash`,`pass_salt`,`password`)
	VALUES(3,'email3@mail.com','uName3','pHash3','pSalt3','5e884898da28047151d0e56f8dc6292773603d0d6aabbdd62a11ef721d1542d8');

INSERT INTO `stairway_sounds`.`users_have_roles` (`user_id`,`role_id`) VALUES (2,2);
INSERT INTO `stairway_sounds`.`users_have_roles` (`user_id`,`role_id`) VALUES (1,1);
INSERT INTO `stairway_sounds`.`users_have_roles` (`user_id`,`role_id`) VALUES (3,2);