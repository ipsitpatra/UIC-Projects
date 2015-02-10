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
-- Table structure for table `lab`
--

DROP TABLE IF EXISTS `lab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lab` (
  `assistant id` int(11) NOT NULL AUTO_INCREMENT,
  `assistant name` varchar(45) DEFAULT NULL,
  `assis phone` varchar(45) DEFAULT NULL,
  `assis email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`assistant id`)
) ENGINE=InnoDB AUTO_INCREMENT=5100 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lab`
--

LOCK TABLES `lab` WRITE;
/*!40000 ALTER TABLE `lab` DISABLE KEYS */;
INSERT INTO `lab` VALUES (5000,'Amir Duran','1-841-654-5904','Cum.sociis.natoque@dignissim.net'),(5001,'Rinah Welch','1-198-153-1288','ut@infaucibus.net'),(5002,'Camilla Hamilton','1-235-219-3093','adipiscing.elit.Etiam@eratSednunc.ca'),(5003,'Baxter Solomon','1-698-463-9683','quam@eu.com'),(5004,'Quincy Allen','1-148-813-3287','sit.amet@sodalesnisimagna.co.uk'),(5005,'Donovan Chavez','1-308-359-8833','lorem.Donec.elementum@eget.edu'),(5006,'Hayes Boone','1-289-948-5576','sem@ante.net'),(5007,'Chadwick Nieves','1-327-740-8744','id.blandit.at@imperdiet.ca'),(5008,'Angelica Logan','1-922-766-8744','Suspendisse@sagittis.co.uk'),(5009,'Sydney Christensen','1-247-189-5299','risus@egestas.org'),(5010,'Patrick Rose','1-470-110-7580','enim@egestasrhoncus.co.uk'),(5011,'Stephen Brown','1-768-213-0637','nisi.a.odio@scelerisquemollisPhasellus.ca'),(5012,'Jolene Benson','1-118-634-7416','diam.at.pretium@Aliquam.org'),(5013,'Jamalia Chambers','1-248-929-4450','sem@Nunc.ca'),(5014,'Zena Shaffer','1-838-977-3600','orci@Sednullaante.edu'),(5015,'Len Chase','1-357-773-8372','ornare@vulputatemaurissagittis.com'),(5016,'Cameron Phelps','1-705-544-6532','Aliquam@atvelit.net'),(5017,'Lynn Delacruz','1-930-437-6361','tincidunt.orci@sollicitudincommodo.ca'),(5018,'Callie Blevins','1-174-810-7058','Quisque.ornare.tortor@Maurisvestibulum.co.uk'),(5019,'Kitra Harmon','1-301-804-8029','vel@luctusutpellentesque.ca'),(5020,'Hiroko Solomon','1-634-677-0171','vel.faucibus@iaculis.co.uk'),(5021,'Michael Santana','1-192-234-0280','vitae@dui.com'),(5022,'Chancellor Jones','1-581-429-8470','at.augue@ategestas.net'),(5023,'Dieter Henderson','1-492-595-2067','Ut.nec@Phasellusvitae.co.uk'),(5024,'Linda Davidson','1-218-839-7670','dui.semper@adipiscing.org'),(5025,'Addison Rosario','1-264-638-5741','euismod@Proinvel.org'),(5026,'Noel Reyes','1-447-625-2269','pulvinar.arcu@duilectus.ca'),(5027,'Reese Cherry','1-646-452-4284','a.sollicitudin@Sedmalesuadaaugue.org'),(5028,'Peter Nelson','1-554-582-3666','luctus.Curabitur.egestas@non.ca'),(5029,'Chancellor Mckinney','1-180-905-6484','ultrices@sodalesnisimagna.edu'),(5030,'Hedley Pate','1-655-169-1177','metus.facilisis.lorem@fringilla.org'),(5031,'Rosalyn Leach','1-389-792-4547','blandit@auctorvelit.co.uk'),(5032,'Ashely Weaver','1-225-106-5379','a.purus.Duis@Quisquenonummyipsum.com'),(5033,'Bruce Nash','1-432-166-9621','Vivamus.non.lorem@telluseu.edu'),(5034,'Byron Carney','1-527-330-0943','feugiat.metus@Duis.org'),(5035,'Christopher Edwards','1-599-368-5401','cubilia.Curae@amagna.net'),(5036,'Hamilton Brown','1-193-793-2442','interdum.enim.non@seddictumeleifend.edu'),(5037,'Benedict Bryant','1-453-878-6035','Mauris@quis.co.uk'),(5038,'Zelenia Willis','1-670-744-7513','Vivamus.rhoncus@anteblanditviverra.co.uk'),(5039,'Russell Bridges','1-638-639-1435','aliquam.eros@montes.org'),(5040,'Harper Hancock','1-535-195-2557','nibh@variusNamporttitor.net'),(5041,'Mara Faulkner','1-832-624-7246','libero@euplacerat.net'),(5042,'Claudia Villarreal','1-866-722-3388','eu.ultrices.sit@magnaetipsum.org'),(5043,'Chantale Hanson','1-211-375-3026','Nullam@magnaPhasellusdolor.edu'),(5044,'Xanthus Witt','1-834-795-7206','Cras.interdum@faucibusut.com'),(5045,'Nell Anderson','1-335-259-0086','Vestibulum.ante.ipsum@non.com'),(5046,'Zelda Ratliff','1-491-715-9001','Integer.vitae@arcuvelquam.edu'),(5047,'Yuri Rivers','1-453-656-8259','non.cursus@nonummy.edu'),(5048,'Lavinia Pitts','1-940-771-0021','ac.feugiat.non@utaliquam.net'),(5049,'Roary Fox','1-626-160-4081','ac.sem@euismod.com'),(5050,'Kato Lawrence','1-791-864-8658','Sed.diam@velit.edu'),(5051,'Danielle Trevino','1-170-199-1057','massa.Quisque@dictumProineget.com'),(5052,'Emerson Daniel','1-552-891-1722','scelerisque@fringillaestMauris.com'),(5053,'Thomas Townsend','1-238-288-3080','metus@Phasellus.com'),(5054,'Yuli Dawson','1-522-802-1308','turpis@nulla.net'),(5055,'Lydia Gregory','1-186-393-2411','Suspendisse@interdumligula.com'),(5056,'Carter Wells','1-937-709-3989','diam.at@odioNam.net'),(5057,'Ahmed Stephens','1-327-229-0416','Vivamus@Nullamnisl.ca'),(5058,'Danielle Jimenez','1-211-528-9417','nec@ullamcorpereueuismod.org'),(5059,'Emi Alford','1-172-443-9582','sit.amet@bibendumullamcorper.com'),(5060,'Daria Finley','1-268-149-0057','ipsum.dolor@Donec.ca'),(5061,'Abbot Williamson','1-608-993-4555','ultrices@nullaatsem.com'),(5062,'Christian Holcomb','1-330-382-4740','a.magna.Lorem@Donectempus.com'),(5063,'Myles Leach','1-695-764-6016','ipsum.Curabitur@nuncac.ca'),(5064,'Beverly Burns','1-381-421-4957','facilisis.vitae.orci@commodoatlibero.edu'),(5065,'Marshall Park','1-533-935-9962','amet@nibh.com'),(5066,'Uta Johnson','1-242-928-7162','magnis@nullaIntincidunt.ca'),(5067,'Stephanie Mcdowell','1-569-675-0175','vulputate.ullamcorper.magna@arcuSedet.net'),(5068,'Daquan Miles','1-884-633-4310','habitant.morbi@mauris.net'),(5069,'Xena Velez','1-394-306-5686','lacinia@velitPellentesque.com'),(5070,'Nash Tate','1-694-275-7501','arcu.Sed.eu@condimentumeget.co.uk'),(5071,'Reece Harris','1-609-963-7151','ultrices.iaculis@metusInlorem.org'),(5072,'Brooke Weiss','1-218-763-5085','ullamcorper.nisl@dui.co.uk'),(5073,'Hope Harper','1-940-249-6834','lorem.semper@et.co.uk'),(5074,'Jael Wells','1-503-702-3789','est@at.com'),(5075,'Harrison Giles','1-182-939-0668','sem.molestie@lacinia.ca'),(5076,'Whitney Miranda','1-317-262-6390','placerat@Nuncsed.org'),(5077,'Nehru Glass','1-644-403-3202','posuere@velfaucibus.edu'),(5078,'Iona Cash','1-459-271-7795','mauris@pharetranibhAliquam.co.uk'),(5079,'Damian Raymond','1-307-966-7393','quam.dignissim@eratVivamusnisi.com'),(5080,'Isaac Galloway','1-605-759-8430','Vivamus.non@aliquameros.org'),(5081,'Noelle Best','1-754-163-5167','est@sapienmolestie.org'),(5082,'Bell Peck','1-642-252-2069','non.enim.commodo@elit.org'),(5083,'Berk Hester','1-241-382-7615','Aenean.eget.magna@eget.net'),(5084,'Inez Waters','1-336-396-9637','orci@magna.edu'),(5085,'Valentine Greene','1-824-464-9759','ac.arcu.Nunc@vitaeerat.com'),(5086,'Kitra Knight','1-833-555-2885','auctor@accumsan.org'),(5087,'Lamar Glenn','1-207-274-0588','hendrerit.consectetuer.cursus@eleifend.net'),(5088,'Paki Lyons','1-410-629-4643','dui.semper.et@pedesagittis.edu'),(5089,'Chanda Paul','1-389-729-4553','ullamcorper.velit@nuncIn.net'),(5090,'Ruth Conner','1-981-253-4728','hendrerit.cursus@Proinultrices.edu'),(5091,'Stewart Silva','1-830-392-3170','purus.mauris.a@nonummyFusce.co.uk'),(5092,'Joshua Parker','1-232-182-2936','magna@facilisiSedneque.org'),(5093,'Kylan Shepard','1-376-287-4860','posuere.cubilia@Cumsociis.edu'),(5094,'Jordan Strong','1-732-408-0724','eleifend.vitae.erat@Sednullaante.org'),(5095,'Clio Romero','1-938-400-4015','molestie@sem.co.uk'),(5096,'James Padilla','1-278-480-9516','sodales.elit@ac.ca'),(5097,'Rae Hughes','1-795-790-4969','lorem.tristique.aliquet@Inornare.ca'),(5098,'Dana Pope','1-705-547-7834','sed@ornareegestasligula.org'),(5099,'Leila Vazquez','1-307-388-4622','volutpat.Nulla@dictumcursus.edu');
/*!40000 ALTER TABLE `lab` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-12-05  1:13:34
