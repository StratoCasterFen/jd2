-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.6.23-log - MySQL Community Server (GPL)
-- ОС Сервера:                   Win32
-- HeidiSQL Версия:              9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Дамп структуры базы данных policestation
CREATE DATABASE IF NOT EXISTS `policestation` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `policestation`;


-- Дамп структуры для таблица policestation.criminalevents
CREATE TABLE IF NOT EXISTS `criminalevents` (
  `EventId` int(11) NOT NULL AUTO_INCREMENT,
  `EventName` varchar(70) DEFAULT '0',
  `EventDescription` varchar(700) DEFAULT NULL,
  PRIMARY KEY (`EventId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Экспортируемые данные не выделены.


-- Дамп структуры для таблица policestation.criminals
CREATE TABLE IF NOT EXISTS `criminals` (
  `CriminalId` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(50) DEFAULT '0',
  `SurName` varchar(50) DEFAULT '0',
  `Birthday` date DEFAULT NULL,
  PRIMARY KEY (`CriminalId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Экспортируемые данные не выделены.


-- Дамп структуры для таблица policestation.logevents
CREATE TABLE IF NOT EXISTS `logevents` (
  `LogId` int(11) NOT NULL AUTO_INCREMENT,
  `EventId` int(11) NOT NULL,
  `EventDate` date DEFAULT NULL,
  `CriminalId` int(11) NOT NULL,
  PRIMARY KEY (`LogId`),
  KEY `Event_Key` (`EventId`),
  KEY `Criminal_key` (`CriminalId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Экспортируемые данные не выделены.


-- Дамп структуры для таблица policestation.roles
CREATE TABLE IF NOT EXISTS `roles` (
  `IdRole` int(11) NOT NULL AUTO_INCREMENT,
  `RoleName` varchar(30) DEFAULT '0',
  PRIMARY KEY (`IdRole`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Экспортируемые данные не выделены.


-- Дамп структуры для таблица policestation.users
CREATE TABLE IF NOT EXISTS `users` (
  `UserId` int(11) NOT NULL AUTO_INCREMENT,
  `UserName` varchar(50) DEFAULT '0',
  `Password` varchar(50) DEFAULT '0',
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Экспортируемые данные не выделены.


-- Дамп структуры для таблица policestation.user_role
CREATE TABLE IF NOT EXISTS `user_role` (
  `idUR` int(11) NOT NULL AUTO_INCREMENT,
  `UserId` int(11) DEFAULT '0',
  `RoleId` int(11) DEFAULT '0',
  PRIMARY KEY (`idUR`),
  KEY `User_key` (`UserId`),
  KEY `Role_key` (`RoleId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Экспортируемые данные не выделены.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
