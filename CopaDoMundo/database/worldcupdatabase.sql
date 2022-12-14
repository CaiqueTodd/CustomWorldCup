CREATE DATABASE worldcup;

CREATE TABLE `selecoes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `selecao` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_selecao` (`selecao`)


INSERT INTO `selecoes` VALUES (1,'Alemanha'),(2,'Arábia Saudita'),(3,'Argentina'),(4,'Austrália'),(5,'Bélgica'),(6,'Brasil'),(7,'Camarões'),(8,'Canadá'),(9,'Catar'),(10,'Coreia do Sul'),(11,'Costa Rica'),(12,'Croácia'),(13,'Dinamarca'),(14,'Equador'),(15,'Espanha'),(16,'Estados Unidos'),(17,'França'),(18,'Gana'),(19,'Holanda'),(20,'Inglaterra'),(21,'Irã'),(22,'Japão'),(23,'Marrocos'),(24,'México'),(25,'País de Gales'),(26,'Polônia'),(27,'Portugal'),(28,'Senegal'),(29,'Sérvia'),(30,'Suíça'),(31,'Tunísia'),(32,'Uruguai');


CREATE TABLE `usuarios` (
  `tipo` varchar(50) DEFAULT NULL,
  `nome` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `senha` varchar(50) DEFAULT NULL,
  UNIQUE KEY `nome` (`nome`)
)
INSERT INTO `usuarios` VALUES ('admin',NULL,NULL,NULL),('admin','admin','customworldcup@gmail.com','0000');
