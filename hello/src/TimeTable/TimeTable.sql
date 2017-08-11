CREATE DATABASE  IF NOT EXISTS `timetable` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `timetable`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: timetable
-- ------------------------------------------------------
-- Server version	5.7.18-log

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
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `COURSE_ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) NOT NULL,
  `LEVEL` int(11) NOT NULL,
  `STREAM` varchar(45) DEFAULT NULL,
  `STREAM2` varchar(45) DEFAULT NULL,
  `STREAM3` varchar(45) DEFAULT NULL,
  `STREAM4` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`COURSE_ID`),
  UNIQUE KEY `COURSE_ID_UNIQUE` (`COURSE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,'IT7320',7,'SP2','SP1','2N1',NULL),(2,'IT6260',6,'GD1','SP2','2N2',NULL),(4,'IT6268',6,'SP1','SP3',NULL,NULL),(5,'IT6261',6,'SP2','3P1',NULL,NULL),(6,'IT5134',5,'D1','D2','D3','D4'),(7,'IT5678',5,'SP3','GD2',NULL,NULL),(8,'IT5376',5,'SP1',NULL,NULL,NULL),(9,'IT7656',7,'SP2','D4',NULL,NULL),(10,'IT7348',7,'SP3','GD1',NULL,NULL);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stream`
--

DROP TABLE IF EXISTS `stream`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stream` (
  `streamid` int(11) NOT NULL,
  `name` varchar(45) NOT NULL,
  `coursename` varchar(100) NOT NULL,
  `starttime` varchar(45) NOT NULL,
  `endtime` varchar(45) NOT NULL,
  `room` varchar(45) NOT NULL,
  `textfeild` varchar(45) NOT NULL,
  PRIMARY KEY (`streamid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stream`
--

LOCK TABLES `stream` WRITE;
/*!40000 ALTER TABLE `stream` DISABLE KEYS */;
INSERT INTO `stream` VALUES (1,'SP1','IT7320','8','9','C116','textField_18'),(2,'SP2','IT7320','13','14','B102','textField_113'),(3,'2N1','IT7320','9','10','C301','textField_29'),(4,'GD1','IT6260','10','11','B102','textField_19'),(5,'SP2','IT6260','14','15','B106','textField_314'),(6,'2N2','IT6260','12','13','C304','textField_212'),(7,'SP1','IT6268','11','12','C304','textField_211'),(8,'SP3','IT6268','11','12','C116','textField_411'),(9,'SP2','IT6261','14','15','B101','textField_114'),(10,'3P1','IT6261','9','10','B101','textField_59'),(11,'D1','IT5134','13','14','B103','textField_513'),(12,'D2','IT5134','11','12','B103','textField_511'),(13,'D3','IT5134','14','15','T601','textField_514'),(14,'D4','IT5134','15','16','T602','textField_515'),(15,'SP3','IT5678','11','12','T603','textField_111'),(16,'GD2','IT5678','14','15','T604','textField_114'),(17,'SP1','IT5376','8','9','C302','textField_28'),(18,'SP2','IT7656','10','11','C302','textField_310'),(19,'D4','IT7656','12','13','C303','textField_312'),(20,'SP3','IT7348','15','16','C303','textField_315'),(21,'GD1','IT7348','8','9','C305','textField_48');
/*!40000 ALTER TABLE `stream` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-08-11 14:31:10
