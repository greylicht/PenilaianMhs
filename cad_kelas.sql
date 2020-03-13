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
-- Database: `cad_kelas`
--

-- --------------------------------------------------------

--
-- Table structure for table `r8r`
--

CREATE TABLE IF NOT EXISTS `r8r` (
  `NAMA` varchar(50) NOT NULL,
  `NPM` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `r8r`
--

INSERT INTO `r8r` (`NAMA`, `NPM`) VALUES
('Indra Sasmita', '2015 4350 1328'),
('Widya Maurizka R', '2015 4350 1330'),
('Andy Kurniawan', '2015 4350 1333'),
('Falya Anastasya', '2015 4350 1334'),
('Pupung Saepulloh', '2015 4350 1337'),
('Andreas Prima Simorangkir', '2015 4350 1341'),
('Hafiz Thariq Aziz', '2015 4350 1344'),
('Rizal Setiawan', '2015 4350 1345'),
('Audi Dwi Arisfiansyah', '2015 4350 1349'),
('Bagus Maulana Akhsan', '2015 4350 1352'),
('Novita Amelia', '2015 4350 1356'),
('Asprilia Putri Utami', '2015 4350 1357'),
('Anita Amelia', '2015 4350 1360'),
('Bramantyo Lingga Febrian', '2015 4350 1365'),
('Tio Riswanto', '2015 4350 1376'),
('Rivaldi Novian', '2015 4350 1378'),
('Ridwan Dwi Permana', '2015 4350 1386'),
('Febriani Safitri', '2015 4350 1392'),
('Hanif Hesya Ghifari', '2015 4350 1395'),
('Ahmad Febyansyah', '2015 4350 1398'),
('Mega Oktavia', '2015 4350 1401'),
('Alif Abdul Basith', '2015 4350 1404'),
('Putri Nurjannah Marasabessy', '2015 4350 1410'),
('Muhammad Barkah', '2015 4350 1411'),
('Sony Indra Prabowo', '2015 4350 1413'),
('Ade Nana Juliana', '2015 4350 1414'),
('Nirwan Apriansyah', '2015 4350 1418'),
('Ramadhan Firdaus', '2015 4350 1420'),
('Sherly Mardilah', '2015 4350 1421'),
('Ahmad Eko Hardianto', '2015 4350 1423'),
('Amrann Baldah Fazri', '2015 4350 1432'),
('Umar Jati Alamsyah', '2015 4350 1433'),
('Hery Siswandi', '2015 4350 1441'),
('Rehulina Kabeakan', '2015 4350 1450'),
('Untung Angga Saputra', '2015 4350 1453'),
('Qory Ichsana Savitri', '2015 4350 2242'),
('Ridho Imam Nugroho', '2015 4350 2246'),
('Fatqur Rohim', '2015 4350 2252'),
('Bayu Novian Wiguna', '2015 4350 2253'),
('Meikel Fiveton Situmorang', '2015 4350 2263');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `r8r`
--
ALTER TABLE `r8r`
 ADD PRIMARY KEY (`NPM`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
