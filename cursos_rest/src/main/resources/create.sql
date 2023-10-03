CREATE TABLE `bdcursos`.`cursos` (
  `codigo` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `duracion` INT NULL,
  `precio` INT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;