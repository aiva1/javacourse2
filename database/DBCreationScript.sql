SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL, ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `Java2_t` DEFAULT CHARACTER SET utf8;
USE `Java2_t`;

--------------------------------------------------------
-- Table `TEACHERS`
--------------------------------------------------------
DROP TABLE IF EXISTS `teachers`;

CREATE TABLE IF NOT EXISTS `teachers` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(32) NOT NULL,
  `last_name` VARCHAR(32) NOT NULL,
  `bio` VARCHAR(200),
  `photo` VARCHAR(32),
PRIMARY KEY (`id`)
)
ENGINE = InnoDB
AUTO_INCREMENT = 1001;

--------------------------------------------------------
-- Table `TRAINING_CLASSES`
--------------------------------------------------------
DROP TABLE IF EXISTS `training_classes`;

CREATE TABLE IF NOT EXISTS `training_classes` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(32) NOT NULL,
  `description` VARCHAR(200) NOT NULL,
PRIMARY KEY (`id`)
)
ENGINE = InnoDB
AUTO_INCREMENT = 101;

--------------------------------------------------------
-- Table `TIMETABLE`
--------------------------------------------------------
DROP TABLE IF EXISTS `timetable`;

CREATE TABLE IF NOT EXISTS `timetable` (
  `entry_id` INT(11) NOT NULL,
  `class_id` INT(11) NOT NULL,
  `teacher_id` INT(11) NOT NULL,
  `day_of_week` INT(7) NOT NULL,
  `start_time` TIME(6) NOT NULL,
  `end_time` TIME(6) NOT NULL,
PRIMARY KEY (`entry_id`),
FOREIGN KEY (`class_id`) REFERENCES `training_classes`(`id`),
FOREIGN KEY (`teacher_id`) REFERENCES `teachers`(`id`)
)
ENGINE = InnoDB


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;