-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: tablo
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `okullar`
--

DROP TABLE IF EXISTS `okullar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `okullar` (
  `OKUL ID` int NOT NULL,
  `OKUL PUANI` int DEFAULT NULL,
  `OKUL ADI` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`OKUL ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `okullar`
--

LOCK TABLES `okullar` WRITE;
/*!40000 ALTER TABLE `okullar` DISABLE KEYS */;
INSERT INTO `okullar` VALUES (1,100,'ENDUSTRI MESLEK LISESI'),(2,150,'MURAT TICARET LISESI'),(3,200,'HIDIR SEVER ANADOLU LISESI'),(4,250,'BALAKGAZI ANADOLU LISESI'),(5,300,'MERKEZ ANADOLU LISESI'),(6,350,'KOLOĞLU ANADOLU LISESI'),(7,400,'ÇUBUKBEY ANADOLU LISESI'),(8,450,'CEMIL MERIC FEN LISESI'),(9,500,'KARA KARAKAYA FEN LISESI');
/*!40000 ALTER TABLE `okullar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'tablo'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-04 22:23:22
