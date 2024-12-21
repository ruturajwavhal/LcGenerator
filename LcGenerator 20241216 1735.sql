-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema lcgenerator
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ lcgenerator;
USE lcgenerator;

--
-- Table structure for table `lcgenerator`.`lc_application_info`
--

DROP TABLE IF EXISTS `lc_application_info`;
CREATE TABLE `lc_application_info` (
  `student_id` varchar(45) NOT NULL default '',
  `en_number` varchar(45) NOT NULL default '',
  `standard` varchar(45) NOT NULL default '',
  `student_name` varchar(45) NOT NULL default '',
  `dateTime` varchar(45) NOT NULL default '',
  `hod` varchar(45) NOT NULL default '',
  `addmission` varchar(45) NOT NULL default '',
  `fee` varchar(45) NOT NULL default '',
  `mess` varchar(45) NOT NULL default '',
  `hostel` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lcgenerator`.`lc_application_info`
--

/*!40000 ALTER TABLE `lc_application_info` DISABLE KEYS */;
INSERT INTO `lc_application_info` (`student_id`,`en_number`,`standard`,`student_name`,`dateTime`,`hod`,`addmission`,`fee`,`mess`,`hostel`) VALUES 
 ('003','234567657D','TE Computer','Bhakti Kholpe','16-12-2024/ 4:35:26 PM','Approved','Approved','Approved','Approved','Approved'),
 ('01','123','BE Comp','Ruturaj Wavhal','02-12-2024/ 1:53:50 PM','Approved','Approved','Approved','Approved','Approved'),
 ('02','12736178E','TE Computer','Uday Paikrao','16-12-2024/ 4:16:7 PM','Approved','Approved','Approved','Approved','Approved');
/*!40000 ALTER TABLE `lc_application_info` ENABLE KEYS */;


--
-- Table structure for table `lcgenerator`.`lc_data`
--

DROP TABLE IF EXISTS `lc_data`;
CREATE TABLE `lc_data` (
  `student_id` varchar(45) NOT NULL default '',
  `pulpil_name` varchar(45) NOT NULL default '',
  `mother_name` varchar(45) NOT NULL default '',
  `caste` varchar(45) NOT NULL default '',
  `nationality` varchar(45) NOT NULL default '',
  `pb` varchar(45) NOT NULL default '',
  `dob` varchar(45) NOT NULL default '',
  `dob_word` varchar(456) NOT NULL default '',
  `last_school_attended` varchar(465) NOT NULL default '',
  `doa` varchar(415) NOT NULL default '',
  `progress` varchar(45) NOT NULL default '',
  `conduct` varchar(45) NOT NULL default '',
  `dol` varchar(45) NOT NULL default '',
  `standard` varchar(415) NOT NULL default '',
  `reason` varchar(45) NOT NULL default '',
  `en_number` varchar(45) NOT NULL default '',
  `lc_num` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lcgenerator`.`lc_data`
--

/*!40000 ALTER TABLE `lc_data` DISABLE KEYS */;
INSERT INTO `lc_data` (`student_id`,`pulpil_name`,`mother_name`,`caste`,`nationality`,`pb`,`dob`,`dob_word`,`last_school_attended`,`doa`,`progress`,`conduct`,`dol`,`standard`,`reason`,`en_number`,`lc_num`) VALUES 
 ('003','Bhakti Kholpe','Nilima','Hindu','India','Karad','19-12-2001','Dec 19, 2001','RDTC','Not Known','Good','Good','Not Known','TE Computer','Further Study','234567657D','3'),
 ('01','Ruturaj Wavhal','Rohini','Hindu','India','Pune','07-10-2001','Oct 7, 2001','SPPU','Not Known','Good','Good','Not Known','BE Comp','Further Study','123','1'),
 ('02','Uday Paikrao','Nandini','Hindu','India','Yavatmal','15-12-2005','Dec 15, 2005','AVIT','Not Known','Good','Good','Not Known','TE Computer','Futher Studies','12736178E','2');
/*!40000 ALTER TABLE `lc_data` ENABLE KEYS */;


--
-- Table structure for table `lcgenerator`.`staff_registration_info`
--

DROP TABLE IF EXISTS `staff_registration_info`;
CREATE TABLE `staff_registration_info` (
  `name` varchar(45) NOT NULL default '',
  `mobile` varchar(45) NOT NULL default '',
  `email` varchar(45) NOT NULL default '',
  `id` varchar(45) NOT NULL default '',
  `position` varchar(45) NOT NULL default '',
  `username` varchar(45) NOT NULL default '',
  `password` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lcgenerator`.`staff_registration_info`
--

/*!40000 ALTER TABLE `staff_registration_info` DISABLE KEYS */;
INSERT INTO `staff_registration_info` (`name`,`mobile`,`email`,`id`,`position`,`username`,`password`) VALUES 
 ('admn','1328719287','admn@gmail.com','04','ADMN Department','admn1','1'),
 ('fee','4178972911','fee@gmail.com','05','Fee Department','f1','1'),
 ('hostel','3428793411','hostel@gmail.com','03','Hostel Manager','h1','1'),
 ('kakade','0981239801','kakade@gmail.com','01','HOD','kk','1'),
 ('mess1','8317982212','mess@gmail.com','02','Mess Manager','m1','1');
/*!40000 ALTER TABLE `staff_registration_info` ENABLE KEYS */;


--
-- Table structure for table `lcgenerator`.`student_registration_info`
--

DROP TABLE IF EXISTS `student_registration_info`;
CREATE TABLE `student_registration_info` (
  `name` varchar(45) NOT NULL default '',
  `mobile` varchar(45) NOT NULL default '',
  `email` varchar(45) NOT NULL default '',
  `id` varchar(45) NOT NULL default '',
  `username` varchar(45) NOT NULL default '',
  `password` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lcgenerator`.`student_registration_info`
--

/*!40000 ALTER TABLE `student_registration_info` DISABLE KEYS */;
INSERT INTO `student_registration_info` (`name`,`mobile`,`email`,`id`,`username`,`password`) VALUES 
 ('Bhakti Kholpe','3847021377','bhakti.innovatus@gmail.com','003','bhakti','1'),
 ('Ruturaj','9823719123','ruturaj@gmail.com','01','r','1'),
 ('Uday Paikrao','8734139821','uday.innovatus@gmail.com','02','uday','1');
/*!40000 ALTER TABLE `student_registration_info` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
