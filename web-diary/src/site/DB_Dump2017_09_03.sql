CREATE DATABASE  IF NOT EXISTS `diary` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `diary`;
-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: diary
-- ------------------------------------------------------
-- Server version	5.1.40-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `diary_entry`
--

DROP TABLE IF EXISTS `diary_entry`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diary_entry` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `entry_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `tags` varchar(128) DEFAULT NULL,
  `entry_text` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diary_entry`
--

LOCK TABLES `diary_entry` WRITE;
/*!40000 ALTER TABLE `diary_entry` DISABLE KEYS */;
INSERT INTO `diary_entry` VALUES (1,'2017-09-03 10:34:16','market cat job','buy fruit, pick up cat food, download e-mails'),(2,'2017-08-30 03:34:16','bday','gift for dad'),(4,'2017-09-03 13:36:37','school;books; learning','some tex #1 \n some text#1 some tex #1 \n some text#1'),(5,'2017-09-03 13:36:38','vacation;visa','some tex #2 \n some text#2 some tex #2 \n some text#2'),(6,'2017-09-03 13:37:36','car;insurance;bday','some tex #3 \n some text#3 some tex #3 \n some text#3'),(7,'2017-09-03 13:46:18','school;books; learning','some tex #1 \n some text#1 some tex #1 \n some text#1'),(8,'2017-09-03 13:46:18','vacation;visa','...now diary entry has fresh value'),(9,'2017-09-03 13:46:23','car;insurance;bday','some tex #3 \n some text#3 some tex #3 \n some text#3'),(10,'2017-09-03 13:57:15','school;books; learning','some tex #1 \n some text#1 some tex #1 \n some text#1'),(12,'2017-09-03 13:57:16','car;insurance;bday','some tex #3 \n some text#3 some tex #3 \n some text#3'),(13,'2017-09-03 14:00:11','school;books; learning','some tex #1 \n some text#1 some tex #1 \n some text#1'),(15,'2017-09-03 14:00:13','car;insurance;bday','some tex #3 \n some text#3 some tex #3 \n some text#3'),(17,'2017-09-21 00:00:00','visa money maps','test save prepare all doc for visa, go to bank');
/*!40000 ALTER TABLE `diary_entry` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-03 22:29:35
