-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: rentals
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `houses`
--

DROP TABLE IF EXISTS `houses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `houses` (
  `houseID` int NOT NULL AUTO_INCREMENT,
  `house_typeID` int DEFAULT NULL,
  `house_number` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `price` float NOT NULL,
  `date_created` datetime(6) DEFAULT NULL,
  `date_modified` datetime(6) DEFAULT NULL,
  `active` int DEFAULT NULL,
  PRIMARY KEY (`houseID`),
  UNIQUE KEY `house_number_UNIQUE` (`house_number`),
  KEY `houseTypeID_idx` (`house_typeID`),
  CONSTRAINT `FK3kwtchj7iuuqwhsb6edbpu491` FOREIGN KEY (`house_typeID`) REFERENCES `housestypes` (`house_typeID`),
  CONSTRAINT `houseTypeID` FOREIGN KEY (`house_typeID`) REFERENCES `housestypes` (`house_typeID`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `houses`
--

LOCK TABLES `houses` WRITE;
/*!40000 ALTER TABLE `houses` DISABLE KEYS */;
INSERT INTO `houses` VALUES (1,1,'1A','Parklands',15000,'2020-01-01 00:00:00.000000','2020-01-02 00:00:00.000000',1),(2,2,'2B','Roysambu',8000,'2020-06-07 00:00:00.000000','2020-06-07 00:00:00.000000',1),(3,4,'1B','Umoja',9000,'2020-06-09 00:00:00.000000','2020-06-10 00:00:00.000000',1),(12,3,'2C','Langata',12000,'2020-06-01 00:00:00.000000','2020-06-09 00:00:00.000000',1),(27,18,'1C','Westlands',14000,'2020-06-15 00:00:00.000000','2020-01-16 00:00:00.000000',1),(31,4,'2A','Westie',11000,'2020-11-13 21:08:39.147000','2020-11-13 21:08:39.147000',1),(39,38,'1D','Parklands',15000,'2020-01-01 00:00:00.000000','2020-01-02 00:00:00.000000',1),(50,49,'3A','Makadara',18000,NULL,'2020-11-19 00:00:00.000000',1);
/*!40000 ALTER TABLE `houses` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-07  6:58:48
