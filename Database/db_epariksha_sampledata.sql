
-- [This File Contains Sample Data of the E-pariksha Database]

-- to load database use below command in Command Prompt
--   mysql -u username -p password examdbtrial < db_epariksha_sampledata.sql 









-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: examdbtrial
-- ------------------------------------------------------
-- Server version	8.0.27

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `exam_info_tbl`
--

DROP TABLE IF EXISTS `exam_info_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exam_info_tbl` (
  `exam_id` int NOT NULL,
  `subject_id` int DEFAULT NULL,
  `teacher_id` int DEFAULT NULL,
  `exam_name` varchar(45) DEFAULT NULL,
  `exam_date` date DEFAULT NULL,
  `no_of_questions` int DEFAULT NULL,
  `marks` int DEFAULT NULL,
  `actual_time` time DEFAULT NULL,
  `login_time` time DEFAULT NULL,
  `exam_status` tinyint(1) DEFAULT NULL,
  `exam_level` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`exam_id`),
  KEY `fk_exam_info_tbl_subject_info_tbl_idx` (`subject_id`),
  KEY `fk_exam_info_tbl_teacher_info_tbl1_idx` (`teacher_id`),
  CONSTRAINT `fk_exam_info` FOREIGN KEY (`teacher_id`) REFERENCES `teacher_info_tbl` (`teacher_id`),
  CONSTRAINT `fk_exam_info_tbl_subject_info_tbl` FOREIGN KEY (`subject_id`) REFERENCES `subject_info_tbl` (`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam_info_tbl`
--

LOCK TABLES `exam_info_tbl` WRITE;
/*!40000 ALTER TABLE `exam_info_tbl` DISABLE KEYS */;
INSERT INTO `exam_info_tbl` VALUES (1,1101,1,'advancejavaexam','2022-11-04',25,50,'00:30:00','00:10:00',1,'easy\r'),(2,1102,2,'databaseexam','2022-11-07',25,50,'01:30:00','01:10:00',0,'medium\r'),(3,1103,3,'corejavaexam','2022-11-09',25,50,'02:30:00','02:10:00',1,'hard\r'),(4,1104,4,'webprogramming','2022-11-10',25,50,'03:30:00','03:10:00',1,'medium\r'),(5,1105,5,'copexam','2022-11-20',25,50,'04:30:00','04:10:00',0,'hard\r');
/*!40000 ALTER TABLE `exam_info_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam_question_map_info_tbl`
--

DROP TABLE IF EXISTS `exam_question_map_info_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `exam_question_map_info_tbl` (
  `question_id` int DEFAULT NULL,
  `exam_id` int DEFAULT NULL,
  UNIQUE KEY `question_id_UNIQUE` (`question_id`),
  UNIQUE KEY `exam_id_UNIQUE` (`exam_id`),
  CONSTRAINT `fk_exam_question_map_info_tbl_exam_info_tbl1` FOREIGN KEY (`exam_id`) REFERENCES `exam_info_tbl` (`exam_id`),
  CONSTRAINT `fk_exam_question_map_info_tbl_question_info_tbl1` FOREIGN KEY (`question_id`) REFERENCES `question_info_tbl` (`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam_question_map_info_tbl`
--

LOCK TABLES `exam_question_map_info_tbl` WRITE;
/*!40000 ALTER TABLE `exam_question_map_info_tbl` DISABLE KEYS */;
INSERT INTO `exam_question_map_info_tbl` VALUES (1,1),(2,2),(3,3),(4,4),(5,5);
/*!40000 ALTER TABLE `exam_question_map_info_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `question_info_tbl`
--

DROP TABLE IF EXISTS `question_info_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question_info_tbl` (
  `question_id` int NOT NULL,
  `subject_id` int DEFAULT NULL,
  `question_level` varchar(45) DEFAULT NULL,
  `question` varchar(1000) DEFAULT NULL,
  `option1` varchar(1000) DEFAULT NULL,
  `option2` varchar(1000) DEFAULT NULL,
  `option3` varchar(1000) DEFAULT NULL,
  `option4` varchar(1000) DEFAULT NULL,
  `answer` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`question_id`),
  KEY `fk_question_info_tbl_subject_info_tbl1_idx` (`subject_id`),
  CONSTRAINT `fk_question_info_tbl_subject_info_tbl1` FOREIGN KEY (`subject_id`) REFERENCES `subject_info_tbl` (`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question_info_tbl`
--

LOCK TABLES `question_info_tbl` WRITE;
/*!40000 ALTER TABLE `question_info_tbl` DISABLE KEYS */;
INSERT INTO `question_info_tbl` VALUES (1,1101,'easy',' which is responsible for getting a connection to the database?','connection','driver','statement','resultset','option2\r'),(2,1102,'medium','which one of the following is a type of data manipulation command?','create','alter','delete','all of the above','option3\r'),(3,1103,'hard',' what is the extension of java code files?','.js','.txt','.class','.java','option4\r'),(4,1104,'medium','what should be the first tag in any html document?','<head>','<title>','<html>','<document>','option3\r'),(5,1105,'hard','what is an example of iteration in c?','for',' while','do-while','all of the mentioned','option4\r');
/*!40000 ALTER TABLE `question_info_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `result_info_tbl`
--

DROP TABLE IF EXISTS `result_info_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `result_info_tbl` (
  `result_id` int NOT NULL,
  `student_id` int DEFAULT NULL,
  `marks` int DEFAULT NULL,
  `exam_id` int DEFAULT NULL,
  PRIMARY KEY (`result_id`),
  KEY `fk_result_info_tbl_exam_info_tbl1_idx` (`exam_id`),
  KEY `fk_result_info_tbl_student_info_tbl1_idx` (`student_id`),
  CONSTRAINT `fk_result_info_tbl_exam_info_tbl1` FOREIGN KEY (`exam_id`) REFERENCES `exam_info_tbl` (`exam_id`),
  CONSTRAINT `fk_result_info_tbl_student_info_tbl1` FOREIGN KEY (`student_id`) REFERENCES `student_info_tbl` (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `result_info_tbl`
--

LOCK TABLES `result_info_tbl` WRITE;
/*!40000 ALTER TABLE `result_info_tbl` DISABLE KEYS */;
INSERT INTO `result_info_tbl` VALUES (1,11,45,1),(2,22,44,2),(3,33,42,3),(4,44,48,4),(5,55,47,5),(6,22,48,4),(7,33,47,4),(8,44,44,3),(9,55,42,1),(10,11,48,5);
/*!40000 ALTER TABLE `result_info_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_info_tbl`
--

DROP TABLE IF EXISTS `student_info_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_info_tbl` (
  `student_id` int NOT NULL,
  `student_firstname` varchar(45) DEFAULT NULL,
  `student_lastname` varchar(45) DEFAULT NULL,
  `student_mobile` varchar(20) DEFAULT NULL,
  `student_dob` date DEFAULT NULL,
  `student_username` varchar(45) DEFAULT NULL,
  `student_password` varchar(45) DEFAULT NULL,
  `student_email_id` varchar(45) DEFAULT NULL,
  `ssc_percentage` double DEFAULT NULL,
  `hsc_percentage` double DEFAULT NULL,
  `degree_percentage` double DEFAULT NULL,
  `isactive` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`student_id`),
  UNIQUE KEY `student_mobile_UNIQUE` (`student_mobile`),
  UNIQUE KEY `student_emailid_UNIQUE` (`student_email_id`),
  UNIQUE KEY `student_username_UNIQUE` (`student_username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_info_tbl`
--

LOCK TABLES `student_info_tbl` WRITE;
/*!40000 ALTER TABLE `student_info_tbl` DISABLE KEYS */;
INSERT INTO `student_info_tbl` VALUES (11,'sumit','bonde','9988774455','2000-12-20','sumit27','sumit@123','sumitbonde@gmail.com',92,92,92,1),(22,'pritam','kadam','9658216112','2000-12-22','pritam17','pritam@223','pritamkadam@gmail.com',90,90,90,0),(33,'sagar','thorat','9685431232','2000-12-23','sagar97','sagar@323','sagarthorat@gmail.com',85,85,85,1),(44,'pooja','patil','9661255461','2000-12-24','pooja11','pooja@423','poojapatil@gmail.com',95,95,95,0),(55,'abhijeet','mutkule','9826311322','2000-12-25','abhijeet12','abhijeet@523','abhijeetmutkule@gmail.com',82,82,82,1);
/*!40000 ALTER TABLE `student_info_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject_info_tbl`
--

DROP TABLE IF EXISTS `subject_info_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject_info_tbl` (
  `subject_id` int NOT NULL,
  `subject_name` varchar(45) DEFAULT NULL,
  `subject_desc` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`subject_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject_info_tbl`
--

LOCK TABLES `subject_info_tbl` WRITE;
/*!40000 ALTER TABLE `subject_info_tbl` DISABLE KEYS */;
INSERT INTO `subject_info_tbl` VALUES (1101,'advancejava','advancejava\r'),(1102,'database','database\r'),(1103,'corejava','corejava\r'),(1104,'webprogramming','webprogramming\r'),(1105,'cop','cop\r');
/*!40000 ALTER TABLE `subject_info_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher_info_tbl`
--

DROP TABLE IF EXISTS `teacher_info_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher_info_tbl` (
  `teacher_id` int NOT NULL,
  `teacher_firstname` varchar(45) DEFAULT NULL,
  `teacher_lastname` varchar(45) DEFAULT NULL,
  `teacher_mobile` varchar(20) DEFAULT NULL,
  `teacher_dob` date DEFAULT NULL,
  `teacher_username` varchar(45) DEFAULT NULL,
  `teacher_password` varchar(45) DEFAULT NULL,
  `teacher_email_id` varchar(45) DEFAULT NULL,
  `teacher_qualification` varchar(45) DEFAULT NULL,
  `teacher_experience` int DEFAULT NULL,
  PRIMARY KEY (`teacher_id`),
  UNIQUE KEY `teacher_email_id_UNIQUE` (`teacher_email_id`),
  UNIQUE KEY `teacher_username_UNIQUE` (`teacher_username`),
  UNIQUE KEY `teacher_mobile_UNIQUE` (`teacher_mobile`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher_info_tbl`
--

LOCK TABLES `teacher_info_tbl` WRITE;
/*!40000 ALTER TABLE `teacher_info_tbl` DISABLE KEYS */;
INSERT INTO `teacher_info_tbl` VALUES (1,'prachi','godbole','9986236566','1975-12-20','prachi99','prachi@123','prachigodbole@gmail.com','m.tech cs',20),(2,'janhvi','deo','9866115135','1975-12-10','janhvi98','janhvi@211','janhvideo@gmail.com','m.tech cs',25),(3,'shrinivas','dudhani','9751531355','1975-11-25','shrinivas97','shrinivas@353','shrinivasdudhani@gmail.com','m.tech cs',15),(4,'saleel ','bagde','9581513513','1975-12-27','saleel95','saleel@451','saleelbagde@gmail.com','m.tech cs',25),(5,'parag','joshi','9435132153','1975-01-20','parag94','parag@513','paragjoshi@gmail.com','m.tech cs',18);
/*!40000 ALTER TABLE `teacher_info_tbl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher_subject_info_tbl`
--

DROP TABLE IF EXISTS `teacher_subject_info_tbl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher_subject_info_tbl` (
  `teacher_id` int NOT NULL,
  `subject_id` int NOT NULL,
  KEY `fk_teacher_subject_info_tbl_subject_info_tbl1` (`subject_id`),
  KEY `fk_teacher_subject_info_tbl_teacher_info_tbl1` (`teacher_id`),
  CONSTRAINT `fk_teacher_subject_info_tbl_subject_info_tbl1` FOREIGN KEY (`subject_id`) REFERENCES `subject_info_tbl` (`subject_id`),
  CONSTRAINT `fk_teacher_subject_info_tbl_teacher_info_tbl1` FOREIGN KEY (`teacher_id`) REFERENCES `teacher_info_tbl` (`teacher_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher_subject_info_tbl`
--

LOCK TABLES `teacher_subject_info_tbl` WRITE;
/*!40000 ALTER TABLE `teacher_subject_info_tbl` DISABLE KEYS */;
INSERT INTO `teacher_subject_info_tbl` VALUES (1,1101),(2,1105),(3,1103),(4,1102),(1,1104),(1,1103);
/*!40000 ALTER TABLE `teacher_subject_info_tbl` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-02-27 18:09:06
