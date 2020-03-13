-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 26, 2019 at 09:09 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `cad_pbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `pertemuan1`
--

CREATE TABLE IF NOT EXISTS `pertemuan1` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` int(3) DEFAULT NULL,
  `individu` int(3) DEFAULT NULL,
  `ABSEN` int(3) DEFAULT NULL,
  `Topik` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pertemuan2`
--

CREATE TABLE IF NOT EXISTS `pertemuan2` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` int(3) DEFAULT NULL,
  `individu` int(3) DEFAULT NULL,
  `ABSEN` int(3) DEFAULT NULL,
  `Topik` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pertemuan3`
--

CREATE TABLE IF NOT EXISTS `pertemuan3` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` int(3) DEFAULT NULL,
  `individu` int(3) DEFAULT NULL,
  `ABSEN` int(3) DEFAULT NULL,
  `Topik` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pertemuan4`
--

CREATE TABLE IF NOT EXISTS `pertemuan4` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` int(3) DEFAULT NULL,
  `individu` int(3) DEFAULT NULL,
  `ABSEN` int(3) DEFAULT NULL,
  `Topik` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pertemuan5`
--

CREATE TABLE IF NOT EXISTS `pertemuan5` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` int(3) DEFAULT NULL,
  `individu` int(3) DEFAULT NULL,
  `ABSEN` int(3) DEFAULT NULL,
  `Topik` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pertemuan6`
--

CREATE TABLE IF NOT EXISTS `pertemuan6` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` int(3) DEFAULT NULL,
  `individu` int(3) DEFAULT NULL,
  `ABSEN` int(3) DEFAULT NULL,
  `Topik` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pertemuan7`
--

CREATE TABLE IF NOT EXISTS `pertemuan7` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` int(3) DEFAULT NULL,
  `individu` int(3) DEFAULT NULL,
  `ABSEN` int(3) DEFAULT NULL,
  `Topik` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pertemuan8`
--

CREATE TABLE IF NOT EXISTS `pertemuan8` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` int(3) DEFAULT NULL,
  `individu` int(3) DEFAULT NULL,
  `ABSEN` int(3) DEFAULT NULL,
  `Topik` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pertemuan9`
--

CREATE TABLE IF NOT EXISTS `pertemuan9` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` int(3) DEFAULT NULL,
  `individu` int(3) DEFAULT NULL,
  `ABSEN` int(3) DEFAULT NULL,
  `Topik` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pertemuan10`
--

CREATE TABLE IF NOT EXISTS `pertemuan10` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` int(3) DEFAULT NULL,
  `individu` int(3) DEFAULT NULL,
  `ABSEN` int(3) DEFAULT NULL,
  `Topik` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pertemuan11`
--

CREATE TABLE IF NOT EXISTS `pertemuan11` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` int(3) DEFAULT NULL,
  `individu` int(3) DEFAULT NULL,
  `ABSEN` int(3) DEFAULT NULL,
  `Topik` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pertemuan12`
--

CREATE TABLE IF NOT EXISTS `pertemuan12` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` int(3) DEFAULT NULL,
  `individu` int(3) DEFAULT NULL,
  `ABSEN` int(3) DEFAULT NULL,
  `Topik` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pertemuan13`
--

CREATE TABLE IF NOT EXISTS `pertemuan13` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` int(3) DEFAULT NULL,
  `individu` int(3) DEFAULT NULL,
  `ABSEN` int(3) DEFAULT NULL,
  `Topik` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `pertemuan14`
--

CREATE TABLE IF NOT EXISTS `pertemuan14` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` int(3) DEFAULT NULL,
  `individu` int(3) DEFAULT NULL,
  `ABSEN` int(3) DEFAULT NULL,
  `Topik` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `rekapnilai`
--

CREATE TABLE IF NOT EXISTS `rekapnilai` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` varchar(3) DEFAULT NULL,
  `individu` varchar(3) DEFAULT NULL,
  `UTS` varchar(3) DEFAULT NULL,
  `UAS` varchar(3) DEFAULT NULL,
  `skala_huruf` varchar(15) DEFAULT NULL,
  `bobot` varchar(10) DEFAULT NULL,
  `MataKuliah` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pertemuan1`
--
ALTER TABLE `pertemuan1`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `pertemuan2`
--
ALTER TABLE `pertemuan2`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `pertemuan3`
--
ALTER TABLE `pertemuan3`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `pertemuan4`
--
ALTER TABLE `pertemuan4`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `pertemuan5`
--
ALTER TABLE `pertemuan5`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `pertemuan6`
--
ALTER TABLE `pertemuan6`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `pertemuan7`
--
ALTER TABLE `pertemuan7`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `pertemuan8`
--
ALTER TABLE `pertemuan8`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `pertemuan9`
--
ALTER TABLE `pertemuan9`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `pertemuan10`
--
ALTER TABLE `pertemuan10`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `pertemuan11`
--
ALTER TABLE `pertemuan11`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `pertemuan12`
--
ALTER TABLE `pertemuan12`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `pertemuan13`
--
ALTER TABLE `pertemuan13`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `pertemuan14`
--
ALTER TABLE `pertemuan14`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `rekapnilai`
--
ALTER TABLE `rekapnilai`
 ADD PRIMARY KEY (`NPM`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
