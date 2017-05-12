-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema restlab
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `restlab` ;

-- -----------------------------------------------------
-- Schema restlab
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `restlab` DEFAULT CHARACTER SET utf8 ;
USE `restlab` ;

-- -----------------------------------------------------
-- Table `user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `user` ;

CREATE TABLE IF NOT EXISTS `user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `todo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `todo` ;

CREATE TABLE IF NOT EXISTS `todo` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `task` VARCHAR(55) NOT NULL,
  `description` TEXT NULL,
  `completed` TINYINT(1) NULL,
  `due_date` VARCHAR(50) NULL,
  `complete_date` VARCHAR(50) NULL,
  `created_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `user_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_todo_user_idx` (`user_id` ASC),
  CONSTRAINT `fk_todo_user`
    FOREIGN KEY (`user_id`)
    REFERENCES `user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `restlab`;

DELIMITER $$

USE `restlab`$$
DROP TRIGGER IF EXISTS `todo_AFTER_UPDATE` $$
USE `restlab`$$
CREATE DEFINER = CURRENT_USER TRIGGER `restlab`.`todo_AFTER_UPDATE` AFTER UPDATE ON `todo` FOR EACH ROW
BEGIN

END
$$


DELIMITER ;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `user`
-- -----------------------------------------------------
START TRANSACTION;
USE `restlab`;
INSERT INTO `user` (`id`, `email`, `password`) VALUES (1, 'example@example.com', 'password');

COMMIT;


-- -----------------------------------------------------
-- Data for table `todo`
-- -----------------------------------------------------
START TRANSACTION;
USE `restlab`;
INSERT INTO `todo` (`id`, `task`, `description`, `completed`, `due_date`, `complete_date`, `created_at`, `updated_at`, `user_id`) VALUES (1, 'chores', 'take out the garbage', 0, NULL, NULL, DEFAULT, DEFAULT, 1);
INSERT INTO `todo` (`id`, `task`, `description`, `completed`, `due_date`, `complete_date`, `created_at`, `updated_at`, `user_id`) VALUES (2, 'baseball', 'hit a homerun', 1, NULL, NULL, DEFAULT, DEFAULT, 1);
INSERT INTO `todo` (`id`, `task`, `description`, `completed`, `due_date`, `complete_date`, `created_at`, `updated_at`, `user_id`) VALUES (3, 'java', 'create an entity', 1, NULL, NULL, DEFAULT, DEFAULT, 1);

COMMIT;
