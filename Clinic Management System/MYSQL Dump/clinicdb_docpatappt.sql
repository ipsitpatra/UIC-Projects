CREATE DATABASE  IF NOT EXISTS `clinicdb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `clinicdb`;
-- MySQL dump 10.13  Distrib 5.6.19, for osx10.7 (i386)
--
-- Host: localhost    Database: clinicdb
-- ------------------------------------------------------
-- Server version	5.6.20

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
-- Table structure for table `docpatappt`
--

DROP TABLE IF EXISTS `docpatappt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `docpatappt` (
  `doctor_doctor id` int(11) NOT NULL,
  `appointment date` varchar(45) DEFAULT NULL,
  `appointment time` varchar(750) DEFAULT NULL,
  `severity` varchar(45) DEFAULT NULL,
  `patient_patient id1` int(11) NOT NULL,
  `Appointment_ID` int(11) NOT NULL,
  `appt_status` varchar(45) NOT NULL,
  `testId` int(11) DEFAULT NULL,
  `labId` int(11) DEFAULT '0',
  `med` varchar(450) DEFAULT NULL,
  `notes` varchar(1000) DEFAULT NULL,
  KEY `fk_DocPatAppt_doctor1_idx` (`doctor_doctor id`),
  KEY `fk_DocPatAppt_patient2_idx` (`patient_patient id1`),
  CONSTRAINT `fk_DocPatAppt_doctor1` FOREIGN KEY (`doctor_doctor id`) REFERENCES `doctor` (`doctor id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_DocPatAppt_patient2` FOREIGN KEY (`patient_patient id1`) REFERENCES `patient` (`patient id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `docpatappt`
--

LOCK TABLES `docpatappt` WRITE;
/*!40000 ALTER TABLE `docpatappt` DISABLE KEYS */;
INSERT INTO `docpatappt` VALUES (1001,'2014-11-04','10am','3',2000,100000,'Bill',1,5001,'What,The hell,23,21','What'),(1002,'2014-11-18','11am','2',2000,100001,'Request',3000,2000,NULL,NULL),(1003,'2014-11-21','12am','4',2000,100002,'Accept',NULL,0,NULL,NULL),(1001,'2014-11-16','2pm','1',2010,100003,'Accept',NULL,0,NULL,NULL),(1005,'2014-11-24','10am','3',2000,100004,'Accept',NULL,0,NULL,NULL),(1001,'2014-11-22','11am','5',2001,100005,'Accept',NULL,0,NULL,NULL),(1002,'2014-11-13','12am','2',2001,100006,'Reject',NULL,0,NULL,NULL),(1001,'2014-11-12','2pm','1',2002,100007,'Pending',NULL,0,NULL,NULL),(1001,'2014-11-02','10am','3',2003,100008,'Bill',NULL,0,NULL,NULL),(1002,'2014-11-05','11am','4',2002,100009,'Accept',NULL,0,NULL,NULL),(1002,'2014-11-21','12am','4',2003,100010,'Accept',1111,5000,'1222;1533;1443;1222;5;2;2;3','Prescription Given'),(1001,'08/12/2014','8','1',2000,100011,'Request',1112,5000,'1222;1443;1222;2;2;3','Prescription Given to Patient for Fever'),(1001,'11/03/2014','3','1',2000,100012,'Accept',NULL,0,NULL,NULL);
/*!40000 ALTER TABLE `docpatappt` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-12-05  1:13:35
