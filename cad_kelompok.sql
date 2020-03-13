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
-- Database: `cad_kelompok`
--

-- --------------------------------------------------------

--
-- Table structure for table `kelompok1`
--

CREATE TABLE IF NOT EXISTS `kelompok1` (
  `Nama` varchar(50) NOT NULL,
  `NPM` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelompok1`
--

INSERT INTO `kelompok1` (`Nama`, `NPM`) VALUES
('Andy Kurniawan', '2015 4350 1333'),
('Hafiz Thariq Aziz', '2015 4350 1344'),
('Tio Riswanto', '2015 4350 1376'),
('Ahmad Febyansyah', '2015 4350 1398'),
('Alif Abdul Basith', '2015 4350 1404'),
('Fatqur Rohim', '2015 4350 2252');

-- --------------------------------------------------------

--
-- Table structure for table `kelompok2`
--

CREATE TABLE IF NOT EXISTS `kelompok2` (
  `Nama` varchar(50) NOT NULL,
  `NPM` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelompok2`
--

INSERT INTO `kelompok2` (`Nama`, `NPM`) VALUES
('Widya Maurizka R', '2015 4350 1330'),
('Falya Anastasya', '2015 4350 1334'),
('Novita Amelia', '2015 4350 1356'),
('Anita Amelia', '2015 4350 1360'),
('Putri Nurjannah Marasabessy', '2015 4350 1410'),
('Sherly Mardilah', '2015 4350 1421');

-- --------------------------------------------------------

--
-- Table structure for table `kelompok3`
--

CREATE TABLE IF NOT EXISTS `kelompok3` (
  `Nama` varchar(50) NOT NULL,
  `NPM` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelompok3`
--

INSERT INTO `kelompok3` (`Nama`, `NPM`) VALUES
('Indra Sasmita', '2015 4350 1328'),
('Ridwan Dwi Permana', '2015 4350 1386'),
('Mega Oktavia', '2015 4350 1401'),
('Muhammad Barkah', '2015 4350 1411'),
('Nirwan Apriansyah', '2015 4350 1418'),
('Ramadhan Firdaus', '2015 4350 1420'),
('Ahmad Eko Hardianto', '2015 4350 1423');

-- --------------------------------------------------------

--
-- Table structure for table `kelompok4`
--

CREATE TABLE IF NOT EXISTS `kelompok4` (
  `Nama` varchar(50) NOT NULL,
  `NPM` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelompok4`
--

INSERT INTO `kelompok4` (`Nama`, `NPM`) VALUES
('Audi Dwi Arisfiansyah', '2015 4350 1349'),
('Bagus Maulana Akhsan', '2015 4350 1352'),
('Asprilia Putri Utami', '2015 4350 1357'),
('Febriani Safitri', '2015 4350 1392'),
('Hanif Hesya Ghifari', '2015 4350 1395'),
('Rehulina Kabeakan', '2015 4350 1450'),
('Qory Ichsana Savitri', '2015 4350 2242');

-- --------------------------------------------------------

--
-- Table structure for table `kelompok5`
--

CREATE TABLE IF NOT EXISTS `kelompok5` (
  `Nama` varchar(50) NOT NULL,
  `NPM` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelompok5`
--

INSERT INTO `kelompok5` (`Nama`, `NPM`) VALUES
('Pupung Saepulloh', '2015 4350 1337'),
('Sony Indra Prabowo', '2015 4350 1413'),
('Umar Jati Alamsyah', '2015 4350 1433'),
('Hery Siswandi', '2015 4350 1441'),
('Untung Angga Saputra', '2015 4350 1453'),
('Ridho Imam Nugroho', '2015 4350 2246'),
('Meikel Fiveton Situmorang', '2015 4350 2263');

-- --------------------------------------------------------

--
-- Table structure for table `kelompok6`
--

CREATE TABLE IF NOT EXISTS `kelompok6` (
  `Nama` varchar(50) NOT NULL,
  `NPM` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelompok6`
--

INSERT INTO `kelompok6` (`Nama`, `NPM`) VALUES
('Andreas Prima Simorangkir', '2015 4350 1341'),
('Rizal Setiawan', '2015 4350 1345'),
('Bramantyo Lingga Febrian', '2015 4350 1365'),
('Rivaldi Novian', '2015 4350 1378'),
('Ade Nana Juliana', '2015 4350 1414'),
('Amran Baldah Fazri', '2015 4350 1432'),
('Bayu Novian Wiguna', '2015 4350 2253');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kelompok1`
--
ALTER TABLE `kelompok1`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `kelompok2`
--
ALTER TABLE `kelompok2`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `kelompok3`
--
ALTER TABLE `kelompok3`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `kelompok4`
--
ALTER TABLE `kelompok4`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `kelompok5`
--
ALTER TABLE `kelompok5`
 ADD PRIMARY KEY (`NPM`);

--
-- Indexes for table `kelompok6`
--
ALTER TABLE `kelompok6`
 ADD PRIMARY KEY (`NPM`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
