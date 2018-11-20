-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema aulas
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema aulas
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `aulas` DEFAULT CHARACTER SET utf8 ;
USE `aulas` ;

-- -----------------------------------------------------
-- Table `aulas`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aulas`.`cliente` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(120) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `aulas`.`locacao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aulas`.`locacao` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `horaInicio` DATETIME NULL DEFAULT NULL,
  `horaFim` DATETIME NULL DEFAULT NULL,
  `kmInicio` DOUBLE NULL DEFAULT NULL,
  `kmFim` DOUBLE NULL DEFAULT NULL,
  `kmRodado` DOUBLE NULL DEFAULT NULL,
  `tempoHoras` DOUBLE NULL DEFAULT NULL,
  `vlHora` DOUBLE NULL DEFAULT NULL,
  `vlKm` DOUBLE NULL DEFAULT NULL,
  `valorTotal` DOUBLE NULL DEFAULT NULL,
  `situacao` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `aulas`.`marcas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aulas`.`marcas` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `titulo` VARCHAR(30) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `aulas`.`modelo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aulas`.`modelo` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `aulas`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aulas`.`usuario` (
  `usuario` VARCHAR(20) NOT NULL DEFAULT '0',
  `senha` VARCHAR(32) NOT NULL DEFAULT '',
  `nivel` CHAR(2) NOT NULL DEFAULT '')
ENGINE = MyISAM
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `aulas`.`veiculo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aulas`.`veiculo` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `numPlaca` VARCHAR(10) NULL DEFAULT NULL,
  `Cor` VARCHAR(20) NULL DEFAULT NULL,
  `Ano` VARCHAR(10) NULL DEFAULT NULL,
  `TipoCombustivel` VARCHAR(15) NULL DEFAULT NULL,
  `NumePortas` INT(11) NULL DEFAULT NULL,
  `Quilometragem` DOUBLE NULL DEFAULT NULL,
  `Renavam` VARCHAR(30) NULL DEFAULT NULL,
  `Chassi` VARCHAR(30) NULL DEFAULT NULL,
  `ValorLocacaoHora` DOUBLE NULL DEFAULT NULL,
  `ValorLovacaoKm` DOUBLE NULL DEFAULT NULL,
  `situacao` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
