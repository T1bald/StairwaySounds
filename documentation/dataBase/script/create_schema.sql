SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `stairway_sounds` ;
CREATE SCHEMA IF NOT EXISTS `stairway_sounds` DEFAULT CHARACTER SET utf8 ;
USE `stairway_sounds` ;

-- -----------------------------------------------------
-- Table `stairway_sounds`.`users`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stairway_sounds`.`users` ;

CREATE TABLE IF NOT EXISTS `stairway_sounds`.`users` (
  `id_user` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(45) NULL,
  `username` VARCHAR(45) NULL,
  `pass_hash` VARCHAR(45) NULL,
  `pass_salt` VARCHAR(45) NULL,
  `password` VARCHAR(64) NULL,
  `deleted` BIT(1) NULL DEFAULT 0,
  `creating_timestamp` TIMESTAMP NULL,
  `last_changing_timestamp` TIMESTAMP NULL,
  `token` VARCHAR(45) NULL,
  `registration_status` INT NULL,
  PRIMARY KEY (`id_user`),
  UNIQUE INDEX `id_user_UNIQUE` (`id_user` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `stairway_sounds`.`roles`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stairway_sounds`.`roles` ;

CREATE TABLE IF NOT EXISTS `stairway_sounds`.`roles` (
  `id_role` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `deleted` BIT(1) NULL DEFAULT 0,
  `creating_timestamp` TIMESTAMP NULL,
  `last_changing_timestamp` TIMESTAMP NULL,
  PRIMARY KEY (`id_role`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `stairway_sounds`.`artists`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stairway_sounds`.`artists` ;

CREATE TABLE IF NOT EXISTS `stairway_sounds`.`artists` (
  `id_artist` INT NOT NULL,
  `pseudonym` VARCHAR(45) NULL,
  `description` TEXT NULL,
  `deleted` BIT(1) NULL DEFAULT 0,
  `creating_timestamp` TIMESTAMP NULL,
  `last_changing_timestamp` TIMESTAMP NULL,
  PRIMARY KEY (`id_artist`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `stairway_sounds`.`albums`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stairway_sounds`.`albums` ;

CREATE TABLE IF NOT EXISTS `stairway_sounds`.`albums` (
  `id_album` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `description` TEXT NULL,
  `cover` VARCHAR(64) NULL,
  `artist_id` INT NULL,
  `deleted` BIT(1) NULL DEFAULT 0,
  `creating_timestamp` TIMESTAMP NULL,
  `last_changing_timestamp` TIMESTAMP NULL,
  PRIMARY KEY (`id_album`),
  INDEX `fk_artist_id_idx` (`artist_id` ASC),
  CONSTRAINT `alb_fk_artist_id`
    FOREIGN KEY (`artist_id`)
    REFERENCES `stairway_sounds`.`artists` (`id_artist`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `stairway_sounds`.`raitings`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stairway_sounds`.`raitings` ;

CREATE TABLE IF NOT EXISTS `stairway_sounds`.`raitings` (
  `id_raiting` INT NOT NULL,
  `downloads` INT NULL,
  `deleted` BIT(1) NULL DEFAULT 0,
  `creating_timestamp` TIMESTAMP NULL,
  `last_changing_timestamp` TIMESTAMP NULL,
  PRIMARY KEY (`id_raiting`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `stairway_sounds`.`tracks_additional_info`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stairway_sounds`.`tracks_additional_info` ;

CREATE TABLE IF NOT EXISTS `stairway_sounds`.`tracks_additional_info` (
  `id_additional_info` INT NOT NULL,
  `country` VARCHAR(45) NULL,
  `language` VARCHAR(45) NULL,
  `year_of_issue` VARCHAR(45) NULL,
  `label` VARCHAR(45) NULL,
  `deleted` BIT(1) NULL DEFAULT 0,
  `creating_timestamp` TIMESTAMP NULL,
  `last_changing_timestamp` TIMESTAMP NULL,
  PRIMARY KEY (`id_additional_info`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `stairway_sounds`.`tracks`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stairway_sounds`.`tracks` ;

CREATE TABLE IF NOT EXISTS `stairway_sounds`.`tracks` (
  `id_track` INT NOT NULL,
  `track_name` VARCHAR(45) NULL,
  `file_path` VARCHAR(100) NOT NULL,
  `duration` MEDIUMTEXT NULL,
  `description` TEXT NULL,
  `album_id` INT NULL,
  `raiting_id` INT NULL,
  `track_info_id` INT NULL,
  `deleted` BIT(1) NULL DEFAULT 0,
  `creating_timestamp` TIMESTAMP NULL,
  `last_changing_timestamp` TIMESTAMP NULL,
  PRIMARY KEY (`id_track`),
  INDEX `fk_album_id_idx` (`album_id` ASC),
  INDEX `fk_raiting_id_idx` (`raiting_id` ASC),
  INDEX `fk_tracks_tracks_additional_info1_idx` (`track_info_id` ASC),
  CONSTRAINT `tra_fk_album_id`
    FOREIGN KEY (`album_id`)
    REFERENCES `stairway_sounds`.`albums` (`id_album`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `tra_fk_raiting_id`
    FOREIGN KEY (`raiting_id`)
    REFERENCES `stairway_sounds`.`raitings` (`id_raiting`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tracks_tracks_additional_info1`
    FOREIGN KEY (`track_info_id`)
    REFERENCES `stairway_sounds`.`tracks_additional_info` (`id_additional_info`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `stairway_sounds`.`access_modifires`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stairway_sounds`.`access_modifires` ;

CREATE TABLE IF NOT EXISTS `stairway_sounds`.`access_modifires` (
  `id_access_modifire` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `deleted` BIT(1) NULL DEFAULT 0,
  `creating_timestamp` TIMESTAMP NULL,
  `last_changing_timestamp` TIMESTAMP NULL,
  PRIMARY KEY (`id_access_modifire`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `stairway_sounds`.`playlists`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stairway_sounds`.`playlists` ;

CREATE TABLE IF NOT EXISTS `stairway_sounds`.`playlists` (
  `id_playlist` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `description` TEXT NULL,
  `access_modifier_id` INT NOT NULL,
  `user_id` INT NULL,
  `deleted` BIT(1) NULL DEFAULT 0,
  `creating_timestamp` TIMESTAMP NULL,
  `last_changing_timestamp` TIMESTAMP NULL,
  PRIMARY KEY (`id_playlist`),
  INDEX `fk_access_modifier_id_idx` (`access_modifier_id` ASC),
  INDEX `fk_user_id_idx` (`user_id` ASC),
  CONSTRAINT `pla_fk_access_modifier_id`
    FOREIGN KEY (`access_modifier_id`)
    REFERENCES `stairway_sounds`.`access_modifires` (`id_access_modifire`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `pla_fk_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `stairway_sounds`.`users` (`id_user`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `stairway_sounds`.`tracks_in_playlists`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stairway_sounds`.`tracks_in_playlists` ;

CREATE TABLE IF NOT EXISTS `stairway_sounds`.`tracks_in_playlists` (
  `playlist_id` INT NOT NULL,
  `track_id` INT NOT NULL,
  PRIMARY KEY (`playlist_id`, `track_id`),
  INDEX `fk_track_id_idx` (`track_id` ASC),
  INDEX `fk_playlist_id_idx` (`playlist_id` ASC),
  CONSTRAINT `tip_fk_playlist_id`
    FOREIGN KEY (`playlist_id`)
    REFERENCES `stairway_sounds`.`playlists` (`id_playlist`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `tip_fk_track_id`
    FOREIGN KEY (`track_id`)
    REFERENCES `stairway_sounds`.`tracks` (`id_track`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `stairway_sounds`.`hashtags`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stairway_sounds`.`hashtags` ;

CREATE TABLE IF NOT EXISTS `stairway_sounds`.`hashtags` (
  `id_hashtag` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  `description` TEXT NULL,
  `deleted` BIT(1) NULL DEFAULT 0,
  `creating_timestamp` TIMESTAMP NULL,
  `last_changing_timestamp` TIMESTAMP NULL,
  PRIMARY KEY (`id_hashtag`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `stairway_sounds`.`tracks_have_hashtags`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stairway_sounds`.`tracks_have_hashtags` ;

CREATE TABLE IF NOT EXISTS `stairway_sounds`.`tracks_have_hashtags` (
  `track_id` INT NOT NULL,
  `hashtag_id` INT NOT NULL,
  PRIMARY KEY (`track_id`, `hashtag_id`),
  INDEX `thh_fk_hashtag_id_idx` (`hashtag_id` ASC),
  INDEX `thh_fk_track_id_idx` (`track_id` ASC),
  CONSTRAINT `thh_fk_track_id`
    FOREIGN KEY (`track_id`)
    REFERENCES `stairway_sounds`.`tracks` (`id_track`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `thh_fk_hashtag_id`
    FOREIGN KEY (`hashtag_id`)
    REFERENCES `stairway_sounds`.`hashtags` (`id_hashtag`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `stairway_sounds`.`users_subscribe_hashtags`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stairway_sounds`.`users_subscribe_hashtags` ;

CREATE TABLE IF NOT EXISTS `stairway_sounds`.`users_subscribe_hashtags` (
  `user_id` INT NOT NULL,
  `hashtag_id` INT NOT NULL,
  PRIMARY KEY (`user_id`, `hashtag_id`),
  INDEX `ush_fk_user_id_idx` (`user_id` ASC),
  INDEX `ush_fk_hashtag_id_idx` (`hashtag_id` ASC),
  CONSTRAINT `ush_fk_hashtag_id`
    FOREIGN KEY (`hashtag_id`)
    REFERENCES `stairway_sounds`.`hashtags` (`id_hashtag`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `ush_fk_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `stairway_sounds`.`users` (`id_user`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `stairway_sounds`.`styles`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stairway_sounds`.`styles` ;

CREATE TABLE IF NOT EXISTS `stairway_sounds`.`styles` (
  `id_style` INT NOT NULL,
  `style_name` VARCHAR(45) NOT NULL,
  `deleted` BIT(1) NULL DEFAULT 0,
  `creating_timestamp` TIMESTAMP NULL,
  `last_changing_timestamp` TIMESTAMP NULL,
  PRIMARY KEY (`id_style`),
  UNIQUE INDEX `style_name_UNIQUE` (`style_name` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `stairway_sounds`.`tracks_have_styles`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stairway_sounds`.`tracks_have_styles` ;

CREATE TABLE IF NOT EXISTS `stairway_sounds`.`tracks_have_styles` (
  `track_id` INT NOT NULL,
  `style_id` INT NOT NULL,
  INDEX `ths_fk_track_id_idx` (`track_id` ASC),
  INDEX `ths_fk_style_id_idx` (`style_id` ASC),
  PRIMARY KEY (`track_id`, `style_id`),
  CONSTRAINT `ths_fk_track_id`
    FOREIGN KEY (`track_id`)
    REFERENCES `stairway_sounds`.`tracks` (`id_track`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `ths_fk_style_id`
    FOREIGN KEY (`style_id`)
    REFERENCES `stairway_sounds`.`styles` (`id_style`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `stairway_sounds`.`users_have_roles`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `stairway_sounds`.`users_have_roles` ;

CREATE TABLE IF NOT EXISTS `stairway_sounds`.`users_have_roles` (
  `user_id` INT NOT NULL,
  `role_id` INT NOT NULL,
  PRIMARY KEY (`user_id`, `role_id`),
  INDEX `uhg_fk_role_id_idx` (`role_id` ASC),
  INDEX `uhg_fk_user_id_idx` (`user_id` ASC),
  CONSTRAINT `uhg_fk_user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `stairway_sounds`.`users` (`id_user`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `uhg_fk_role_id`
    FOREIGN KEY (`role_id`)
    REFERENCES `stairway_sounds`.`roles` (`id_role`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `stairway_sounds` ;

-- -----------------------------------------------------
-- Placeholder table for view `stairway_sounds`.`users_roles_view`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `stairway_sounds`.`users_roles_view` (`email` INT, `password` INT, `rolename` INT);

-- -----------------------------------------------------
-- View `stairway_sounds`.`users_roles_view`
-- -----------------------------------------------------
DROP VIEW IF EXISTS `stairway_sounds`.`users_roles_view` ;
DROP TABLE IF EXISTS `stairway_sounds`.`users_roles_view`;
USE `stairway_sounds`;
CREATE 
     OR REPLACE ALGORITHM = UNDEFINED 
    DEFINER = `ss_admin`@`localhost` 
    SQL SECURITY DEFINER
VIEW `stairway_sounds`.`users_roles_view` AS
    select 
        `stairway_sounds`.`users`.`email` AS `email`,
        `stairway_sounds`.`users`.`password` AS `password`,
        `stairway_sounds`.`roles`.`name` AS `rolename`
    from
        ((`stairway_sounds`.`users_have_roles`
        join `stairway_sounds`.`users` ON ((`stairway_sounds`.`users_have_roles`.`user_id` = `stairway_sounds`.`users`.`id_user`)))
        join `stairway_sounds`.`roles` ON ((`stairway_sounds`.`users_have_roles`.`role_id` = `stairway_sounds`.`roles`.`id_role`))) ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
