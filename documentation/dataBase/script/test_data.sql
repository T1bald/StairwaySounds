INSERT INTO `stairway_sounds`.`roles` (`id_role`,`name`) VALUES (1,'ADMIN');
INSERT INTO `stairway_sounds`.`roles` (`id_role`,`name`) VALUES (2,'USER');
INSERT INTO `stairway_sounds`.`roles` (`id_role`,`name`) VALUES (3,'MANAGER');

INSERT INTO `stairway_sounds`.`users` (`id_user`,`email`,`username`,`pass_hash`,`pass_salt`,`password`)
	VALUES(2,'email2','uName2','pHash2','pSalt2','MyPassword2');
INSERT INTO `stairway_sounds`.`users` (`id_user`,`email`,`username`,`pass_hash`,`pass_salt`,`password`)
	VALUES(1,'email1','uName1','pHash1','pSalt1','MyPassword1');
INSERT INTO `stairway_sounds`.`users` (`id_user`,`email`,`username`,`pass_hash`,`pass_salt`,`password`)
	VALUES(3,'email3','uName3','pHash3','pSalt3','MyPassword3');

INSERT INTO `stairway_sounds`.`users_have_roles` (`user_id`,`role_id`) VALUES (2,2);
INSERT INTO `stairway_sounds`.`users_have_roles` (`user_id`,`role_id`) VALUES (1,1);
INSERT INTO `stairway_sounds`.`users_have_roles` (`user_id`,`role_id`) VALUES (3,2);