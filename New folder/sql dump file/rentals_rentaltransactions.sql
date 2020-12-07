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
-- Table structure for table `rentaltransactions`
--

DROP TABLE IF EXISTS `rentaltransactions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rentaltransactions` (
  `rental_transactionID` int NOT NULL AUTO_INCREMENT,
  `profileID` int DEFAULT NULL,
  `houseID` int DEFAULT NULL,
  `duration` int NOT NULL,
  `entry_date` timestamp NULL DEFAULT NULL,
  `date_created` timestamp NULL DEFAULT NULL,
  `date_modified` timestamp NULL DEFAULT NULL,
  `active` int DEFAULT NULL,
  PRIMARY KEY (`rental_transactionID`),
  KEY `profileID_idx` (`profileID`),
  KEY `houseID_idx` (`houseID`),
  CONSTRAINT `houseID` FOREIGN KEY (`houseID`) REFERENCES `houses` (`houseID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `profileID` FOREIGN KEY (`profileID`) REFERENCES `profiles` (`profileID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rentaltransactions`
--

LOCK TABLES `rentaltransactions` WRITE;
/*!40000 ALTER TABLE `rentaltransactions` DISABLE KEYS */;
INSERT INTO `rentaltransactions` VALUES (1,1,2,10,'1998-11-22 18:00:00','2020-06-05 18:00:00','2020-06-07 18:00:00',1),(21,2,3,12,'2002-10-14 18:00:00','2020-06-14 18:00:00','2020-06-15 18:00:00',1),(25,2,12,8,'2002-08-14 18:00:00','2020-06-15 18:00:00','2020-06-16 18:00:00',1);
/*!40000 ALTER TABLE `rentaltransactions` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-07  6:58:50
