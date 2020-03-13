-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 26, 2019 at 09:07 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `cad_teknik_kompilasi`
--

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE IF NOT EXISTS `dosen` (
  `Username` varchar(50) CHARACTER SET ascii COLLATE ascii_bin NOT NULL,
  `Password` varchar(15) NOT NULL,
  `Email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dosen`
--

INSERT INTO `dosen` (`Username`, `Password`, `Email`) VALUES
('Fz', '1234', 'greylicht@gmail.com'),
('Kursehi', '12345678', 'Kursehi.Falgenti@gmail.com'),
('admin', 'admin', 'admin@gmail.com'),
('fz', '1111', 'greylicht@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `pertemuan1`
--

CREATE TABLE IF NOT EXISTS `pertemuan1` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` int(3) DEFAULT NULL,
  `ABSEN` int(3) DEFAULT NULL,
  `individu` int(3) DEFAULT NULL,
  `Topik` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pertemuan1`
--

INSERT INTO `pertemuan1` (`NPM`, `NAMA`, `NILAI`, `ABSEN`, `individu`, `Topik`) VALUES
('2015 4350 1328', 'Indra Sasmita', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1330', 'Widya Maurizka R', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1333', 'Andy Kurniawan', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1334', 'Falya Anastasya', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1337', 'Pupung Saepulloh', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1341', 'Andreas Prima Simorangkir', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1344', 'Hafiz Thariq Aziz', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1345', 'Rizal Setiawan', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1349', 'Audi Dwi Arisfiansyah', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1352', 'Bagus Maulana Akhsan', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1356', 'Novita Amelia', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1357', 'Asprilia Putri Utami', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1360', 'Anita Amelia', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1365', 'Bramantyo Lingga Febrian', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1376', 'Tio Riswanto', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1378', 'Rivaldi Novian', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1386', 'Ridwan Dwi Permana', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1392', 'Febriani Safitri', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1395', 'Hanif Hesya Ghifari', 0, 0, 0, '1.Pengenalan Kompiler'),
('2015 4350 1398', 'Ahmad Febyansyah', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1401', 'Mega Oktavia', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1404', 'Alif Abdul Basith', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1410', 'Putri Nurjannah Marasabessy', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1411', 'Muhammad Barkah', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1413', 'Sony Indra Prabowo', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1414', 'Ade Nana Juliana', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1418', 'Nirwan Apriansyah', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1420', 'Ramadhan Firdaus', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1421', 'Sherly Mardilah', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1423', 'Ahmad Eko Hardianto', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1432', 'Amran Baldah Fazri', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1433', 'Umar Jati Alamsyah', 0, 0, 0, '1.Pengenalan Kompiler'),
('2015 4350 1441', 'Hery Siswandi', 0, 0, 0, '1.Pengenalan Kompiler'),
('2015 4350 1450', 'Rehulina Kabeakan', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 1453', 'Untung Angga Saputra', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 2242', 'Qory Ichsana Savitri', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 2246', 'Ridho Imam Nugroho', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 2252', 'Fatqur Rohim', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 2253', 'Bayu Novian Wiguna', 100, 100, 100, '1.Pengenalan Kompiler'),
('2015 4350 2263', 'Meikel Fiveton Situmorang', 100, 100, 100, '1.Pengenalan Kompiler');

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

--
-- Dumping data for table `pertemuan2`
--

INSERT INTO `pertemuan2` (`NPM`, `NAMA`, `NILAI`, `individu`, `ABSEN`, `Topik`) VALUES
('2015 4350 1328', 'Indra Sasmita', 80, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1330', 'Widya Maurizka R', 85, 87, 100, '2.Analisa Leksikal'),
('2015 4350 1333', 'Andy Kurniawan', 90, 90, 100, '2.Analisa Leksikal'),
('2015 4350 1334', 'Falya Anastasya', 85, 87, 100, '2.Analisa Leksikal'),
('2015 4350 1337', 'Pupung Saepulloh', 90, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1341', 'Andreas Prima Simorangkir', 80, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1344', 'Hafiz Thariq Aziz', 90, 90, 100, '2.Analisa Leksikal'),
('2015 4350 1345', 'Rizal Setiawan', 80, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1349', 'Audi Dwi Arisfiansyah', 88, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1352', 'Bagus Maulana Akhsan', 88, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1356', 'Novita Amelia', 85, 87, 100, '2.Analisa Leksikal'),
('2015 4350 1357', 'Asprilia Putri Utami', 88, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1360', 'Anita Amelia', 85, 87, 100, '2.Analisa Leksikal'),
('2015 4350 1365', 'Bramantyo Lingga Febrian', 80, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1376', 'Tio Riswanto', 90, 90, 100, '2.Analisa Leksikal'),
('2015 4350 1378', 'Rivaldi Novian', 80, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1386', 'Ridwan Dwi Permana', 80, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1392', 'Febriani Safitri', 88, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1395', 'Hanif Hesya Ghifari', 0, 0, 0, '2.Analisa Leksikal'),
('2015 4350 1398', 'Ahmad Febyansyah', 90, 90, 100, '2.Analisa Leksikal'),
('2015 4350 1401', 'Mega Oktavia', 80, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1404', 'Alif Abdul Basith', 90, 90, 100, '2.Analisa Leksikal'),
('2015 4350 1410', 'Putri Nurjannah Marasabessy', 85, 87, 100, '2.Analisa Leksikal'),
('2015 4350 1411', 'Muhammad Barkah', 80, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1413', 'Sony Indra Prabowo', 90, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1414', 'Ade Nana Juliana', 80, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1418', 'Nirwan Apriansyah', 80, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1420', 'Ramadhan Firdaus', 80, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1421', 'Sherly Mardilah', 85, 87, 100, '2.Analisa Leksikal'),
('2015 4350 1423', 'Ahmad Eko Hardianto', 80, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1432', 'Amran Baldah Fazri', 80, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1433', 'Umar Jati Alamsyah', 0, 0, 0, '2.Analisa Leksikal'),
('2015 4350 1441', 'Hery Siswandi', 0, 0, 0, '2.Analisa Leksikal'),
('2015 4350 1450', 'Rehulina Kabeakan', 88, 85, 100, '2.Analisa Leksikal'),
('2015 4350 1453', 'Untung Angga Saputra', 90, 85, 100, '2.Analisa Leksikal'),
('2015 4350 2242', 'Qory Ichsana Savitri', 88, 85, 100, '2.Analisa Leksikal'),
('2015 4350 2246', 'Ridho Imam Nugroho', 90, 85, 100, '2.Analisa Leksikal'),
('2015 4350 2252', 'Fatqur Rohim', 90, 90, 100, '2.Analisa Leksikal'),
('2015 4350 2253', 'Bayu Novian Wiguna', 80, 85, 100, '2.Analisa Leksikal'),
('2015 4350 2263', 'Meikel Fiveton Situmorang', 90, 85, 100, '2.Analisa Leksikal');

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

--
-- Dumping data for table `pertemuan3`
--

INSERT INTO `pertemuan3` (`NPM`, `NAMA`, `NILAI`, `individu`, `ABSEN`, `Topik`) VALUES
('2015 4350 1328', 'Indra Sasmita', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1330', 'Widya Maurizka R', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1333', 'Andy Kurniawan', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1334', 'Falya Anastasya', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1337', 'Pupung Saepulloh', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1341', 'Andreas Prima Simorangkir', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1344', 'Hafiz Thariq Aziz', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1345', 'Rizal Setiawan', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1349', 'Audi Dwi Arisfiansyah', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1352', 'Bagus Maulana Akhsan', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1356', 'Novita Amelia', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1357', 'Asprilia Putri Utami', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1360', 'Anita Amelia', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1365', 'Bramantyo Lingga Febrian', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1376', 'Tio Riswanto', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1378', 'Rivaldi Novian', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1386', 'Ridwan Dwi Permana', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1392', 'Febriani Safitri', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1395', 'Hanif Hesya Ghifari', 0, 0, 0, '3.Contex Free Grammar'),
('2015 4350 1398', 'Ahmad Febyansyah', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1401', 'Mega Oktavia', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1404', 'Alif Abdul Basith', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1410', 'Putri Nurjannah Marasabessy', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1411', 'Muhammad Barkah', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1413', 'Sony Indra Prabowo', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1414', 'Ade Nana Juliana', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1418', 'Nirwan Apriansyah', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1420', 'Ramadhan Firdaus', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1421', 'Sherly Mardilah', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1423', 'Ahmad Eko Hardianto', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1432', 'Amran Baldah Fazri', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1433', 'Umar Jati Alamsyah', 0, 0, 0, '3.Contex Free Grammar'),
('2015 4350 1441', 'Hery Siswandi', 0, 0, 0, '3.Contex Free Grammar'),
('2015 4350 1450', 'Rehulina Kabeakan', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 1453', 'Untung Angga Saputra', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 2242', 'Qory Ichsana Savitri', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 2246', 'Ridho Imam Nugroho', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 2252', 'Fatqur Rohim', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 2253', 'Bayu Novian Wiguna', 100, 100, 100, '3.Contex Free Grammar'),
('2015 4350 2263', 'Meikel Fiveton Situmorang', 100, 100, 100, '3.Contex Free Grammar');

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

--
-- Dumping data for table `pertemuan4`
--

INSERT INTO `pertemuan4` (`NPM`, `NAMA`, `NILAI`, `individu`, `ABSEN`, `Topik`) VALUES
('2015 4350 1328', 'Indra Sasmita', 88, 70, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1330', 'Widya Maurizka R', 90, 85, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1333', 'Andy Kurniawan', 90, 80, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1334', 'Falya Anastasya', 90, 85, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1337', 'Pupung Saepulloh', 70, 80, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1341', 'Andreas Prima Simorangkir', 80, 70, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1344', 'Hafiz Thariq Aziz', 90, 80, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1345', 'Rizal Setiawan', 80, 70, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1349', 'Audi Dwi Arisfiansyah', 80, 75, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1352', 'Bagus Maulana Akhsan', 80, 75, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1356', 'Novita Amelia', 90, 85, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1357', 'Asprilia Putri Utami', 80, 75, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1360', 'Anita Amelia', 90, 85, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1365', 'Bramantyo Lingga Febrian', 80, 70, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1376', 'Tio Riswanto', 90, 80, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1378', 'Rivaldi Novian', 80, 70, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1386', 'Ridwan Dwi Permana', 88, 70, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1392', 'Febriani Safitri', 80, 75, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1395', 'Hanif Hesya Ghifari', 0, 0, 0, '4.Top-Down Parsing(TDP)'),
('2015 4350 1398', 'Ahmad Febyansyah', 90, 80, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1401', 'Mega Oktavia', 88, 70, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1404', 'Alif Abdul Basith', 90, 80, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1410', 'Putri Nurjannah Marasabessy', 90, 85, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1411', 'Muhammad Barkah', 88, 70, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1413', 'Sony Indra Prabowo', 70, 80, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1414', 'Ade Nana Juliana', 80, 70, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1418', 'Nirwan Apriansyah', 88, 70, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1420', 'Ramadhan Firdaus', 88, 70, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1421', 'Sherly Mardilah', 90, 85, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1423', 'Ahmad Eko Hardianto', 88, 70, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1432', 'Amran Baldah Fazri', 80, 70, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1433', 'Umar Jati Alamsyah', 0, 0, 0, '4.Top-Down Parsing(TDP)'),
('2015 4350 1441', 'Hery Siswandi', 0, 0, 0, '4.Top-Down Parsing(TDP)'),
('2015 4350 1450', 'Rehulina Kabeakan', 80, 75, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 1453', 'Untung Angga Saputra', 70, 80, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 2242', 'Qory Ichsana Savitri', 80, 75, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 2246', 'Ridho Imam Nugroho', 70, 80, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 2252', 'Fatqur Rohim', 90, 80, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 2253', 'Bayu Novian Wiguna', 80, 70, 100, '4.Top-Down Parsing(TDP)'),
('2015 4350 2263', 'Meikel Fiveton Situmorang', 70, 80, 100, '4.Top-Down Parsing(TDP)');

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

--
-- Dumping data for table `pertemuan5`
--

INSERT INTO `pertemuan5` (`NPM`, `NAMA`, `NILAI`, `individu`, `ABSEN`, `Topik`) VALUES
('2015 4350 1328', 'Indra Sasmita', 85, 85, 100, '5.First And Follow Set'),
('2015 4350 1330', 'Widya Maurizka R', 90, 90, 100, '5.First And Follow Set'),
('2015 4350 1333', 'Andy Kurniawan', 85, 85, 100, '5.First And Follow Set'),
('2015 4350 1334', 'Falya Anastasya', 90, 90, 100, '5.First And Follow Set'),
('2015 4350 1337', 'Pupung Saepulloh', 70, 70, 100, '5.First And Follow Set'),
('2015 4350 1341', 'Andreas Prima Simorangkir', 80, 80, 100, '5.First And Follow Set'),
('2015 4350 1344', 'Hafiz Thariq Aziz', 85, 85, 100, '5.First And Follow Set'),
('2015 4350 1345', 'Rizal Setiawan', 80, 80, 100, '5.First And Follow Set'),
('2015 4350 1349', 'Audi Dwi Arisfiansyah', 90, 85, 100, '5.First And Follow Set'),
('2015 4350 1352', 'Bagus Maulana Akhsan', 90, 85, 100, '5.First And Follow Set'),
('2015 4350 1356', 'Novita Amelia', 90, 90, 100, '5.First And Follow Set'),
('2015 4350 1357', 'Asprilia Putri Utami', 90, 85, 100, '5.First And Follow Set'),
('2015 4350 1360', 'Anita Amelia', 90, 90, 100, '5.First And Follow Set'),
('2015 4350 1365', 'Bramantyo Lingga Febrian', 80, 80, 100, '5.First And Follow Set'),
('2015 4350 1376', 'Tio Riswanto', 85, 85, 100, '5.First And Follow Set'),
('2015 4350 1378', 'Rivaldi Novian', 80, 80, 100, '5.First And Follow Set'),
('2015 4350 1386', 'Ridwan Dwi Permana', 85, 85, 100, '5.First And Follow Set'),
('2015 4350 1392', 'Febriani Safitri', 90, 85, 100, '5.First And Follow Set'),
('2015 4350 1395', 'Hanif Hesya Ghifari', 0, 0, 0, '5.First And Follow Set'),
('2015 4350 1398', 'Ahmad Febyansyah', 85, 85, 100, '5.First And Follow Set'),
('2015 4350 1401', 'Mega Oktavia', 85, 85, 100, '5.First And Follow Set'),
('2015 4350 1404', 'Alif Abdul Basith', 85, 85, 100, '5.First And Follow Set'),
('2015 4350 1410', 'Putri Nurjannah Marasabessy', 90, 90, 100, '5.First And Follow Set'),
('2015 4350 1411', 'Muhammad Barkah', 85, 85, 100, '5.First And Follow Set'),
('2015 4350 1413', 'Sony Indra Prabowo', 70, 70, 100, '5.First And Follow Set'),
('2015 4350 1414', 'Ade Nana Juliana', 80, 80, 100, '5.First And Follow Set'),
('2015 4350 1418', 'Nirwan Apriansyah', 85, 85, 100, '5.First And Follow Set'),
('2015 4350 1420', 'Ramadhan Firdaus', 85, 85, 100, '5.First And Follow Set'),
('2015 4350 1421', 'Sherly Mardilah', 90, 90, 100, '5.First And Follow Set'),
('2015 4350 1423', 'Ahmad Eko Hardianto', 85, 85, 100, '5.First And Follow Set'),
('2015 4350 1432', 'Amran Baldah Fazri', 80, 80, 100, '5.First And Follow Set'),
('2015 4350 1433', 'Umar Jati Alamsyah', 0, 0, 0, '5.First And Follow Set'),
('2015 4350 1441', 'Hery Siswandi', 0, 0, 0, '5.First And Follow Set'),
('2015 4350 1450', 'Rehulina Kabeakan', 90, 85, 100, '5.First And Follow Set'),
('2015 4350 1453', 'Untung Angga Saputra', 70, 70, 100, '5.First And Follow Set'),
('2015 4350 2242', 'Qory Ichsana Savitri', 90, 85, 100, '5.First And Follow Set'),
('2015 4350 2246', 'Ridho Imam Nugroho', 70, 70, 100, '5.First And Follow Set'),
('2015 4350 2252', 'Fatqur Rohim', 85, 85, 100, '5.First And Follow Set'),
('2015 4350 2253', 'Bayu Novian Wiguna', 80, 80, 100, '5.First And Follow Set'),
('2015 4350 2263', 'Meikel Fiveton Situmorang', 70, 70, 100, '5.First And Follow Set');

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

--
-- Dumping data for table `pertemuan6`
--

INSERT INTO `pertemuan6` (`NPM`, `NAMA`, `NILAI`, `individu`, `ABSEN`, `Topik`) VALUES
('2015 4350 1328', 'Indra Sasmita', 90, 90, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1330', 'Widya Maurizka R', 85, 85, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1333', 'Andy Kurniawan', 90, 90, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1334', 'Falya Anastasya', 85, 85, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1337', 'Pupung Saepulloh', 75, 75, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1341', 'Andreas Prima Simorangkir', 80, 80, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1344', 'Hafiz Thariq Aziz', 90, 90, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1345', 'Rizal Setiawan', 80, 80, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1349', 'Audi Dwi Arisfiansyah', 70, 70, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1352', 'Bagus Maulana Akhsan', 70, 70, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1356', 'Novita Amelia', 85, 85, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1357', 'Asprilia Putri Utami', 70, 70, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1360', 'Anita Amelia', 85, 85, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1365', 'Bramantyo Lingga Febrian', 80, 80, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1376', 'Tio Riswanto', 90, 90, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1378', 'Rivaldi Novian', 80, 80, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1386', 'Ridwan Dwi Permana', 90, 90, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1392', 'Febriani Safitri', 70, 70, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1395', 'Hanif Hesya Ghifari', 0, 0, 0, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1398', 'Ahmad Febyansyah', 90, 90, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1401', 'Mega Oktavia', 90, 90, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1404', 'Alif Abdul Basith', 90, 90, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1410', 'Putri Nurjannah Marasabessy', 85, 85, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1411', 'Muhammad Barkah', 90, 90, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1413', 'Sony Indra Prabowo', 75, 75, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1414', 'Ade Nana Juliana', 80, 80, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1418', 'Nirwan Apriansyah', 90, 90, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1420', 'Ramadhan Firdaus', 90, 90, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1421', 'Sherly Mardilah', 85, 85, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1423', 'Ahmad Eko Hardianto', 90, 90, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1432', 'Amran Baldah Fazri', 80, 80, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1433', 'Umar Jati Alamsyah', 0, 0, 0, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1441', 'Hery Siswandi', 0, 0, 0, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1450', 'Rehulina Kabeakan', 70, 70, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 1453', 'Untung Angga Saputra', 75, 75, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 2242', 'Qory Ichsana Savitri', 70, 70, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 2246', 'Ridho Imam Nugroho', 75, 75, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 2252', 'Fatqur Rohim', 90, 90, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 2253', 'Bayu Novian Wiguna', 80, 80, 100, '6.TDP Non-Recursive Descent Parser(LL(1))'),
('2015 4350 2263', 'Meikel Fiveton Situmorang', 75, 75, 100, '6.TDP Non-Recursive Descent Parser(LL(1))');

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

--
-- Dumping data for table `pertemuan7`
--

INSERT INTO `pertemuan7` (`NPM`, `NAMA`, `NILAI`, `individu`, `ABSEN`, `Topik`) VALUES
('2015 4350 1328', 'Indra Sasmita', 70, 70, 100, '7.Bottom Up Parser'),
('2015 4350 1330', 'Widya Maurizka R', 80, 80, 100, '7.Bottom Up Parser'),
('2015 4350 1333', 'Andy Kurniawan', 85, 85, 100, '7.Bottom Up Parser'),
('2015 4350 1334', 'Falya Anastasya', 80, 80, 100, '7.Bottom Up Parser'),
('2015 4350 1337', 'Pupung Saepulloh', 80, 80, 100, '7.Bottom Up Parser'),
('2015 4350 1341', 'Andreas Prima Simorangkir', 80, 75, 100, '7.Bottom Up Parser'),
('2015 4350 1344', 'Hafiz Thariq Aziz', 85, 85, 100, '7.Bottom Up Parser'),
('2015 4350 1345', 'Rizal Setiawan', 80, 75, 100, '7.Bottom Up Parser'),
('2015 4350 1349', 'Audi Dwi Arisfiansyah', 80, 80, 100, '7.Bottom Up Parser'),
('2015 4350 1352', 'Bagus Maulana Akhsan', 80, 80, 100, '7.Bottom Up Parser'),
('2015 4350 1356', 'Novita Amelia', 80, 80, 100, '7.Bottom Up Parser'),
('2015 4350 1357', 'Asprilia Putri Utami', 80, 80, 100, '7.Bottom Up Parser'),
('2015 4350 1360', 'Anita Amelia', 80, 80, 100, '7.Bottom Up Parser'),
('2015 4350 1365', 'Bramantyo Lingga Febrian', 80, 75, 100, '7.Bottom Up Parser'),
('2015 4350 1376', 'Tio Riswanto', 85, 85, 100, '7.Bottom Up Parser'),
('2015 4350 1378', 'Rivaldi Novian', 80, 75, 100, '7.Bottom Up Parser'),
('2015 4350 1386', 'Ridwan Dwi Permana', 70, 70, 100, '7.Bottom Up Parser'),
('2015 4350 1392', 'Febriani Safitri', 80, 80, 100, '7.Bottom Up Parser'),
('2015 4350 1395', 'Hanif Hesya Ghifari', 0, 0, 0, '7.Bottom Up Parser'),
('2015 4350 1398', 'Ahmad Febyansyah', 85, 85, 100, '7.Bottom Up Parser'),
('2015 4350 1401', 'Mega Oktavia', 70, 70, 100, '7.Bottom Up Parser'),
('2015 4350 1404', 'Alif Abdul Basith', 85, 85, 100, '7.Bottom Up Parser'),
('2015 4350 1410', 'Putri Nurjannah Marasabessy', 80, 80, 100, '7.Bottom Up Parser'),
('2015 4350 1411', 'Muhammad Barkah', 70, 70, 100, '7.Bottom Up Parser'),
('2015 4350 1413', 'Sony Indra Prabowo', 80, 80, 100, '7.Bottom Up Parser'),
('2015 4350 1414', 'Ade Nana Juliana', 80, 75, 100, '7.Bottom Up Parser'),
('2015 4350 1418', 'Nirwan Apriansyah', 70, 70, 100, '7.Bottom Up Parser'),
('2015 4350 1420', 'Ramadhan Firdaus', 70, 70, 100, '7.Bottom Up Parser'),
('2015 4350 1421', 'Sherly Mardilah', 80, 80, 100, '7.Bottom Up Parser'),
('2015 4350 1423', 'Ahmad Eko Hardianto', 70, 70, 100, '7.Bottom Up Parser'),
('2015 4350 1432', 'Amran Baldah Fazri', 80, 75, 100, '7.Bottom Up Parser'),
('2015 4350 1433', 'Umar Jati Alamsyah', 0, 0, 0, '7.Bottom Up Parser'),
('2015 4350 1441', 'Hery Siswandi', 0, 0, 0, '7.Bottom Up Parser'),
('2015 4350 1450', 'Rehulina Kabeakan', 80, 80, 100, '7.Bottom Up Parser'),
('2015 4350 1453', 'Untung Angga Saputra', 80, 80, 100, '7.Bottom Up Parser'),
('2015 4350 2242', 'Qory Ichsana Savitri', 80, 80, 100, '7.Bottom Up Parser'),
('2015 4350 2246', 'Ridho Imam Nugroho', 80, 80, 100, '7.Bottom Up Parser'),
('2015 4350 2252', 'Fatqur Rohim', 85, 85, 100, '7.Bottom Up Parser'),
('2015 4350 2253', 'Bayu Novian Wiguna', 80, 75, 100, '7.Bottom Up Parser'),
('2015 4350 2263', 'Meikel Fiveton Situmorang', 80, 80, 100, '7.Bottom Up Parser');

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

--
-- Dumping data for table `pertemuan8`
--

INSERT INTO `pertemuan8` (`NPM`, `NAMA`, `NILAI`, `individu`, `ABSEN`, `Topik`) VALUES
('2015 4350 1328', 'Indra Sasmita', 85, 85, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1330', 'Widya Maurizka R', 90, 90, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1333', 'Andy Kurniawan', 100, 100, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1334', 'Falya Anastasya', 90, 90, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1337', 'Pupung Saepulloh', 75, 75, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1341', 'Andreas Prima Simorangkir', 80, 80, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1344', 'Hafiz Thariq Aziz', 100, 100, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1345', 'Rizal Setiawan', 80, 80, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1349', 'Audi Dwi Arisfiansyah', 80, 80, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1352', 'Bagus Maulana Akhsan', 80, 80, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1356', 'Novita Amelia', 90, 90, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1357', 'Asprilia Putri Utami', 80, 80, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1360', 'Anita Amelia', 90, 90, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1365', 'Bramantyo Lingga Febrian', 80, 80, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1376', 'Tio Riswanto', 100, 100, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1378', 'Rivaldi Novian', 80, 80, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1386', 'Ridwan Dwi Permana', 85, 85, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1392', 'Febriani Safitri', 80, 80, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1395', 'Hanif Hesya Ghifari', 80, 80, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1398', 'Ahmad Febyansyah', 100, 100, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1401', 'Mega Oktavia', 85, 85, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1404', 'Alif Abdul Basith', 100, 100, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1410', 'Putri Nurjannah Marasabessy', 90, 90, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1411', 'Muhammad Barkah', 85, 85, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1413', 'Sony Indra Prabowo', 75, 75, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1414', 'Ade Nana Juliana', 80, 80, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1418', 'Nirwan Apriansyah', 85, 85, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1420', 'Ramadhan Firdaus', 85, 85, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1421', 'Sherly Mardilah', 90, 90, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1423', 'Ahmad Eko Hardianto', 85, 85, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1432', 'Amran Baldah Fazri', 80, 80, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1433', 'Umar Jati Alamsyah', 75, 75, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1441', 'Hery Siswandi', 75, 75, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1450', 'Rehulina Kabeakan', 80, 80, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 1453', 'Untung Angga Saputra', 75, 75, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 2242', 'Qory Ichsana Savitri', 80, 80, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 2246', 'Ridho Imam Nugroho', 75, 75, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 2252', 'Fatqur Rohim', 100, 100, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 2253', 'Bayu Novian Wiguna', 80, 80, 100, '8.Bottom Up Parser (LR(0))'),
('2015 4350 2263', 'Meikel Fiveton Situmorang', 75, 75, 100, '8.Bottom Up Parser (LR(0))');

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

--
-- Dumping data for table `pertemuan9`
--

INSERT INTO `pertemuan9` (`NPM`, `NAMA`, `NILAI`, `individu`, `ABSEN`, `Topik`) VALUES
('2015 4350 1328', 'Indra Sasmita', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1330', 'Widya Maurizka R', 85, 85, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1333', 'Andy Kurniawan', 90, 90, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1334', 'Falya Anastasya', 85, 85, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1337', 'Pupung Saepulloh', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1341', 'Andreas Prima Simorangkir', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1344', 'Hafiz Thariq Aziz', 90, 90, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1345', 'Rizal Setiawan', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1349', 'Audi Dwi Arisfiansyah', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1352', 'Bagus Maulana Akhsan', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1356', 'Novita Amelia', 85, 85, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1357', 'Asprilia Putri Utami', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1360', 'Anita Amelia', 85, 85, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1365', 'Bramantyo Lingga Febrian', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1376', 'Tio Riswanto', 90, 90, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1378', 'Rivaldi Novian', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1386', 'Ridwan Dwi Permana', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1392', 'Febriani Safitri', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1395', 'Hanif Hesya Ghifari', 0, 0, 0, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1398', 'Ahmad Febyansyah', 90, 90, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1401', 'Mega Oktavia', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1404', 'Alif Abdul Basith', 90, 90, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1410', 'Putri Nurjannah Marasabessy', 85, 85, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1411', 'Muhammad Barkah', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1413', 'Sony Indra Prabowo', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1414', 'Ade Nana Juliana', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1418', 'Nirwan Apriansyah', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1420', 'Ramadhan Firdaus', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1421', 'Sherly Mardilah', 85, 85, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1423', 'Ahmad Eko Hardianto', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1432', 'Amran Baldah Fazri', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1433', 'Umar Jati Alamsyah', 0, 0, 0, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1441', 'Hery Siswandi', 0, 0, 0, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1450', 'Rehulina Kabeakan', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 1453', 'Untung Angga Saputra', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 2242', 'Qory Ichsana Savitri', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 2246', 'Ridho Imam Nugroho', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 2252', 'Fatqur Rohim', 90, 90, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 2253', 'Bayu Novian Wiguna', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan'),
('2015 4350 2263', 'Meikel Fiveton Situmorang', 80, 80, 100, '9.,Bottom Up Parser (LR(0)) Lanjutan');

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

--
-- Dumping data for table `pertemuan10`
--

INSERT INTO `pertemuan10` (`NPM`, `NAMA`, `NILAI`, `individu`, `ABSEN`, `Topik`) VALUES
('2015 4350 1328', 'Indra Sasmita', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1330', 'Widya Maurizka R', 90, 90, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1333', 'Andy Kurniawan', 100, 100, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1334', 'Falya Anastasya', 90, 90, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1337', 'Pupung Saepulloh', 70, 70, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1341', 'Andreas Prima Simorangkir', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1344', 'Hafiz Thariq Aziz', 100, 100, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1345', 'Rizal Setiawan', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1349', 'Audi Dwi Arisfiansyah', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1352', 'Bagus Maulana Akhsan', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1356', 'Novita Amelia', 90, 90, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1357', 'Asprilia Putri Utami', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1360', 'Anita Amelia', 90, 90, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1365', 'Bramantyo Lingga Febrian', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1376', 'Tio Riswanto', 100, 100, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1378', 'Rivaldi Novian', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1386', 'Ridwan Dwi Permana', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1392', 'Febriani Safitri', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1395', 'Hanif Hesya Ghifari', 0, 0, 0, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1398', 'Ahmad Febyansyah', 100, 100, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1401', 'Mega Oktavia', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1404', 'Alif Abdul Basith', 100, 100, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1410', 'Putri Nurjannah Marasabessy', 90, 90, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1411', 'Muhammad Barkah', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1413', 'Sony Indra Prabowo', 70, 70, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1414', 'Ade Nana Juliana', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1418', 'Nirwan Apriansyah', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1420', 'Ramadhan Firdaus', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1421', 'Sherly Mardilah', 90, 90, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1423', 'Ahmad Eko Hardianto', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1432', 'Amran Baldah Fazri', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1433', 'Umar Jati Alamsyah', 0, 0, 0, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1441', 'Hery Siswandi', 0, 0, 0, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1450', 'Rehulina Kabeakan', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 1453', 'Untung Angga Saputra', 70, 70, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 2242', 'Qory Ichsana Savitri', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 2246', 'Ridho Imam Nugroho', 70, 70, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 2252', 'Fatqur Rohim', 100, 100, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 2253', 'Bayu Novian Wiguna', 80, 80, 100, '10.Bottom Up Parser SLR(1)'),
('2015 4350 2263', 'Meikel Fiveton Situmorang', 70, 70, 100, '10.Bottom Up Parser SLR(1)');

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

--
-- Dumping data for table `pertemuan11`
--

INSERT INTO `pertemuan11` (`NPM`, `NAMA`, `NILAI`, `individu`, `ABSEN`, `Topik`) VALUES
('2015 4350 1328', 'Indra Sasmita', 70, 70, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1330', 'Widya Maurizka R', 75, 75, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1333', 'Andy Kurniawan', 80, 80, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1334', 'Falya Anastasya', 75, 75, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1337', 'Pupung Saepulloh', 65, 65, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1341', 'Andreas Prima Simorangkir', 60, 60, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1344', 'Hafiz Thariq Aziz', 80, 80, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1345', 'Rizal Setiawan', 60, 60, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1349', 'Audi Dwi Arisfiansyah', 70, 70, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1352', 'Bagus Maulana Akhsan', 70, 70, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1356', 'Novita Amelia', 75, 75, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1357', 'Asprilia Putri Utami', 70, 70, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1360', 'Anita Amelia', 75, 75, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1365', 'Bramantyo Lingga Febrian', 60, 60, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1376', 'Tio Riswanto', 80, 80, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1378', 'Rivaldi Novian', 60, 60, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1386', 'Ridwan Dwi Permana', 70, 70, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1392', 'Febriani Safitri', 70, 70, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1395', 'Hanif Hesya Ghifari', 0, 0, 0, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1398', 'Ahmad Febyansyah', 80, 80, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1401', 'Mega Oktavia', 70, 70, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1404', 'Alif Abdul Basith', 80, 80, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1410', 'Putri Nurjannah Marasabessy', 75, 75, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1411', 'Muhammad Barkah', 70, 70, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1413', 'Sony Indra Prabowo', 65, 65, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1414', 'Ade Nana Juliana', 60, 60, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1418', 'Nirwan Apriansyah', 70, 70, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1420', 'Ramadhan Firdaus', 70, 70, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1421', 'Sherly Mardilah', 75, 75, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1423', 'Ahmad Eko Hardianto', 70, 70, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1432', 'Amran Baldah Fazri', 60, 60, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1433', 'Umar Jati Alamsyah', 0, 0, 0, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1441', 'Hery Siswandi', 0, 0, 0, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1450', 'Rehulina Kabeakan', 70, 70, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 1453', 'Untung Angga Saputra', 65, 65, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 2242', 'Qory Ichsana Savitri', 70, 70, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 2246', 'Ridho Imam Nugroho', 65, 65, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 2252', 'Fatqur Rohim', 80, 80, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 2253', 'Bayu Novian Wiguna', 60, 60, 100, '11.Bottom Up Parser CLR(1), LALR(1)'),
('2015 4350 2263', 'Meikel Fiveton Situmorang', 65, 65, 100, '11.Bottom Up Parser CLR(1), LALR(1)');

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

--
-- Dumping data for table `pertemuan12`
--

INSERT INTO `pertemuan12` (`NPM`, `NAMA`, `NILAI`, `individu`, `ABSEN`, `Topik`) VALUES
('2015 4350 1328', 'Indra Sasmita', 75, 75, 100, '12.Analisis Semantic'),
('2015 4350 1330', 'Widya Maurizka R', 80, 80, 100, '12.Analisis Semantic'),
('2015 4350 1333', 'Andy Kurniawan', 80, 80, 100, '12.Analisis Semantic'),
('2015 4350 1334', 'Falya Anastasya', 80, 80, 100, '12.Analisis Semantic'),
('2015 4350 1337', 'Pupung Saepulloh', 70, 70, 100, '12.Analisis Semantic'),
('2015 4350 1341', 'Andreas Prima Simorangkir', 70, 70, 100, '12.Analisis Semantic'),
('2015 4350 1344', 'Hafiz Thariq Aziz', 80, 80, 100, '12.Analisis Semantic'),
('2015 4350 1345', 'Rizal Setiawan', 70, 70, 100, '12.Analisis Semantic'),
('2015 4350 1349', 'Audi Dwi Arisfiansyah', 75, 75, 100, '12.Analisis Semantic'),
('2015 4350 1352', 'Bagus Maulana Akhsan', 75, 75, 100, '12.Analisis Semantic'),
('2015 4350 1356', 'Novita Amelia', 80, 80, 100, '12.Analisis Semantic'),
('2015 4350 1357', 'Asprilia Putri Utami', 75, 75, 100, '12.Analisis Semantic'),
('2015 4350 1360', 'Anita Amelia', 80, 80, 100, '12.Analisis Semantic'),
('2015 4350 1365', 'Bramantyo Lingga Febrian', 70, 70, 100, '12.Analisis Semantic'),
('2015 4350 1376', 'Tio Riswanto', 80, 80, 100, '12.Analisis Semantic'),
('2015 4350 1378', 'Rivaldi Novian', 70, 70, 100, '12.Analisis Semantic'),
('2015 4350 1386', 'Ridwan Dwi Permana', 75, 75, 100, '12.Analisis Semantic'),
('2015 4350 1392', 'Febriani Safitri', 75, 75, 100, '12.Analisis Semantic'),
('2015 4350 1395', 'Hanif Hesya Ghifari', 0, 0, 0, '12.Analisis Semantic'),
('2015 4350 1398', 'Ahmad Febyansyah', 80, 80, 100, '12.Analisis Semantic'),
('2015 4350 1401', 'Mega Oktavia', 75, 75, 100, '12.Analisis Semantic'),
('2015 4350 1404', 'Alif Abdul Basith', 80, 80, 100, '12.Analisis Semantic'),
('2015 4350 1410', 'Putri Nurjannah Marasabessy', 80, 80, 100, '12.Analisis Semantic'),
('2015 4350 1411', 'Muhammad Barkah', 75, 75, 100, '12.Analisis Semantic'),
('2015 4350 1413', 'Sony Indra Prabowo', 70, 70, 100, '12.Analisis Semantic'),
('2015 4350 1414', 'Ade Nana Juliana', 70, 70, 100, '12.Analisis Semantic'),
('2015 4350 1418', 'Nirwan Apriansyah', 75, 75, 100, '12.Analisis Semantic'),
('2015 4350 1420', 'Ramadhan Firdaus', 75, 75, 100, '12.Analisis Semantic'),
('2015 4350 1421', 'Sherly Mardilah', 80, 80, 100, '12.Analisis Semantic'),
('2015 4350 1423', 'Ahmad Eko Hardianto', 75, 75, 100, '12.Analisis Semantic'),
('2015 4350 1432', 'Amran Baldah Fazri', 70, 70, 100, '12.Analisis Semantic'),
('2015 4350 1433', 'Umar Jati Alamsyah', 0, 0, 0, '12.Analisis Semantic'),
('2015 4350 1441', 'Hery Siswandi', 0, 0, 0, '12.Analisis Semantic'),
('2015 4350 1450', 'Rehulina Kabeakan', 75, 75, 100, '12.Analisis Semantic'),
('2015 4350 1453', 'Untung Angga Saputra', 70, 70, 100, '12.Analisis Semantic'),
('2015 4350 2242', 'Qory Ichsana Savitri', 75, 75, 100, '12.Analisis Semantic'),
('2015 4350 2246', 'Ridho Imam Nugroho', 70, 70, 100, '12.Analisis Semantic'),
('2015 4350 2252', 'Fatqur Rohim', 80, 80, 100, '12.Analisis Semantic'),
('2015 4350 2253', 'Bayu Novian Wiguna', 70, 70, 100, '12.Analisis Semantic'),
('2015 4350 2263', 'Meikel Fiveton Situmorang', 70, 70, 100, '12.Analisis Semantic');

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

--
-- Dumping data for table `pertemuan13`
--

INSERT INTO `pertemuan13` (`NPM`, `NAMA`, `NILAI`, `individu`, `ABSEN`, `Topik`) VALUES
('2015 4350 1328', 'Indra Sasmita', 75, 75, 100, '13.Intermediate Code Generator'),
('2015 4350 1330', 'Widya Maurizka R', 80, 80, 100, '13.Intermediate Code Generator'),
('2015 4350 1333', 'Andy Kurniawan', 85, 85, 100, '13.Intermediate Code Generator'),
('2015 4350 1334', 'Falya Anastasya', 80, 80, 100, '13.Intermediate Code Generator'),
('2015 4350 1337', 'Pupung Saepulloh', 70, 70, 100, '13.Intermediate Code Generator'),
('2015 4350 1341', 'Andreas Prima Simorangkir', 70, 70, 100, '13.Intermediate Code Generator'),
('2015 4350 1344', 'Hafiz Thariq Aziz', 85, 85, 100, '13.Intermediate Code Generator'),
('2015 4350 1345', 'Rizal Setiawan', 70, 70, 100, '13.Intermediate Code Generator'),
('2015 4350 1349', 'Audi Dwi Arisfiansyah', 75, 75, 100, '13.Intermediate Code Generator'),
('2015 4350 1352', 'Bagus Maulana Akhsan', 75, 75, 100, '13.Intermediate Code Generator'),
('2015 4350 1356', 'Novita Amelia', 80, 80, 100, '13.Intermediate Code Generator'),
('2015 4350 1357', 'Asprilia Putri Utami', 75, 75, 100, '13.Intermediate Code Generator'),
('2015 4350 1360', 'Anita Amelia', 80, 80, 100, '13.Intermediate Code Generator'),
('2015 4350 1365', 'Bramantyo Lingga Febrian', 70, 70, 100, '13.Intermediate Code Generator'),
('2015 4350 1376', 'Tio Riswanto', 85, 85, 100, '13.Intermediate Code Generator'),
('2015 4350 1378', 'Rivaldi Novian', 70, 70, 100, '13.Intermediate Code Generator'),
('2015 4350 1386', 'Ridwan Dwi Permana', 75, 75, 100, '13.Intermediate Code Generator'),
('2015 4350 1392', 'Febriani Safitri', 75, 75, 100, '13.Intermediate Code Generator'),
('2015 4350 1395', 'Hanif Hesya Ghifari', 0, 0, 0, '13.Intermediate Code Generator'),
('2015 4350 1398', 'Ahmad Febyansyah', 85, 85, 100, '13.Intermediate Code Generator'),
('2015 4350 1401', 'Mega Oktavia', 75, 75, 100, '13.Intermediate Code Generator'),
('2015 4350 1404', 'Alif Abdul Basith', 85, 85, 100, '13.Intermediate Code Generator'),
('2015 4350 1410', 'Putri Nurjannah Marasabessy', 80, 80, 100, '13.Intermediate Code Generator'),
('2015 4350 1411', 'Muhammad Barkah', 75, 75, 100, '13.Intermediate Code Generator'),
('2015 4350 1413', 'Sony Indra Prabowo', 70, 70, 100, '13.Intermediate Code Generator'),
('2015 4350 1414', 'Ade Nana Juliana', 70, 70, 100, '13.Intermediate Code Generator'),
('2015 4350 1418', 'Nirwan Apriansyah', 75, 75, 100, '13.Intermediate Code Generator'),
('2015 4350 1420', 'Ramadhan Firdaus', 75, 75, 100, '13.Intermediate Code Generator'),
('2015 4350 1421', 'Sherly Mardilah', 80, 80, 100, '13.Intermediate Code Generator'),
('2015 4350 1423', 'Ahmad Eko Hardianto', 75, 75, 100, '13.Intermediate Code Generator'),
('2015 4350 1432', 'Amran Baldah Fazri', 70, 70, 100, '13.Intermediate Code Generator'),
('2015 4350 1433', 'Umar Jati Alamsyah', 0, 0, 0, '13.Intermediate Code Generator'),
('2015 4350 1441', 'Hery Siswandi', 0, 0, 0, '13.Intermediate Code Generator'),
('2015 4350 1450', 'Rehulina Kabeakan', 75, 75, 100, '13.Intermediate Code Generator'),
('2015 4350 1453', 'Untung Angga Saputra', 70, 70, 100, '13.Intermediate Code Generator'),
('2015 4350 2242', 'Qory Ichsana Savitri', 75, 75, 100, '13.Intermediate Code Generator'),
('2015 4350 2246', 'Ridho Imam Nugroho', 70, 70, 100, '13.Intermediate Code Generator'),
('2015 4350 2252', 'Fatqur Rohim', 85, 85, 100, '13.Intermediate Code Generator'),
('2015 4350 2253', 'Bayu Novian Wiguna', 70, 70, 100, '13.Intermediate Code Generator'),
('2015 4350 2263', 'Meikel Fiveton Situmorang', 70, 70, 100, '13.Intermediate Code Generator');

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

--
-- Dumping data for table `pertemuan14`
--

INSERT INTO `pertemuan14` (`NPM`, `NAMA`, `NILAI`, `individu`, `ABSEN`, `Topik`) VALUES
('2015 4350 1328', 'Indra Sasmita', 90, 90, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1330', 'Widya Maurizka R', 95, 95, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1333', 'Andy Kurniawan', 100, 100, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1334', 'Falya Anastasya', 95, 95, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1337', 'Pupung Saepulloh', 85, 85, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1341', 'Andreas Prima Simorangkir', 85, 85, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1344', 'Hafiz Thariq Aziz', 100, 100, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1345', 'Rizal Setiawan', 85, 85, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1349', 'Audi Dwi Arisfiansyah', 90, 90, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1352', 'Bagus Maulana Akhsan', 90, 90, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1356', 'Novita Amelia', 95, 95, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1357', 'Asprilia Putri Utami', 90, 90, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1360', 'Anita Amelia', 95, 95, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1365', 'Bramantyo Lingga Febrian', 85, 85, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1376', 'Tio Riswanto', 100, 100, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1378', 'Rivaldi Novian', 85, 85, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1386', 'Ridwan Dwi Permana', 90, 90, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1392', 'Febriani Safitri', 90, 90, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1395', 'Hanif Hesya Ghifari', 0, 0, 0, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1398', 'Ahmad Febyansyah', 100, 100, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1401', 'Mega Oktavia', 90, 90, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1404', 'Alif Abdul Basith', 100, 100, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1410', 'Putri Nurjannah Marasabessy', 95, 95, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1411', 'Muhammad Barkah', 90, 90, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1413', 'Sony Indra Prabowo', 85, 85, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1414', 'Ade Nana Juliana', 85, 85, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1418', 'Nirwan Apriansyah', 90, 90, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1420', 'Ramadhan Firdaus', 90, 90, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1421', 'Sherly Mardilah', 95, 95, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1423', 'Ahmad Eko Hardianto', 90, 90, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1432', 'Amran Baldah Fazri', 85, 85, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1433', 'Umar Jati Alamsyah', 0, 0, 0, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1441', 'Hery Siswandi', 0, 0, 0, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1450', 'Rehulina Kabeakan', 90, 90, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 1453', 'Untung Angga Saputra', 85, 85, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 2242', 'Qory Ichsana Savitri', 90, 90, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 2246', 'Ridho Imam Nugroho', 85, 85, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 2252', 'Fatqur Rohim', 100, 100, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 2253', 'Bayu Novian Wiguna', 85, 85, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple'),
('2015 4350 2263', 'Meikel Fiveton Situmorang', 85, 85, 100, '14.Syntax Tree,Three Addresses Code,N-Tuple');

-- --------------------------------------------------------

--
-- Table structure for table `rekapnilai`
--

CREATE TABLE IF NOT EXISTS `rekapnilai` (
  `NPM` varchar(50) NOT NULL,
  `NAMA` varchar(50) NOT NULL,
  `NILAI` varchar(3) DEFAULT NULL,
  `UTS` varchar(3) DEFAULT NULL,
  `UAS` varchar(3) DEFAULT NULL,
  `skala_huruf` varchar(3) DEFAULT NULL,
  `bobot` varchar(10) DEFAULT NULL,
  `MataKuliah` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rekapnilai`
--

INSERT INTO `rekapnilai` (`NPM`, `NAMA`, `NILAI`, `UTS`, `UAS`, `skala_huruf`, `bobot`, `MataKuliah`) VALUES
('2015 4350 1328', 'Indra Sasmita', '83', '60', '65', 'C+', '2.25', 'Teknik_Kompilasi'),
('2015 4350 1330', 'Widya Maurizka R', '87', '70', '75', 'B', '3.0', 'Teknik_Kompilasi'),
('2015 4350 1333', 'Andy Kurniawan', '91', '80', '80', 'A-', '3.75', 'Teknik_Kompilasi'),
('2015 4350 1334', 'Falya Anastasya', '87', '80', '80', 'A-', '3.75', 'Teknik_Kompilasi'),
('2015 4350 1337', 'Pupung Saepulloh', '78', '70', '70', 'B-', '2.75', 'Teknik_Kompilasi'),
('2015 4350 1341', 'Andreas Prima Simorangkir', '80', '50', '50', 'C', '2.0', 'Teknik_Kompilasi'),
('2015 4350 1344', 'Hafiz Thariq Aziz', '91', '90', '90', 'A', '4.0', 'Teknik_Kompilasi'),
('2015 4350 1345', 'Rizal Setiawan', '80', '75', '70', 'B', '3.0', 'Teknik_Kompilasi'),
('2015 4350 1349', 'Audi Dwi Arisfiansyah', '82', '70', '70', 'B', '3.0', 'Teknik_Kompilasi'),
('2015 4350 1352', 'Bagus Maulana Akhsan', '82', '70', '70', 'B', '3.0', 'Teknik_Kompilasi'),
('2015 4350 1356', 'Novita Amelia', '87', '85', '80', 'A-', '3.75', 'Teknik_Kompilasi'),
('2015 4350 1357', 'Asprilia Putri Utami', '82', '70', '70', 'B', '3.0', 'Teknik_Kompilasi'),
('2015 4350 1360', 'Anita Amelia', '87', '85', '85', 'A-', '3.75', 'Teknik_Kompilasi'),
('2015 4350 1365', 'Bramantyo Lingga Febrian', '80', '70', '75', 'B', '3.0', 'Teknik_Kompilasi'),
('2015 4350 1376', 'Tio Riswanto', '91', '85', '85', 'A-', '3.75', 'Teknik_Kompilasi'),
('2015 4350 1378', 'Rivaldi Novian', '80', '70', '70', 'B', '3.0', 'Teknik_Kompilasi'),
('2015 4350 1386', 'Ridwan Dwi Permana', '83', '90', '90', 'A-', '3.75', 'Teknik_Kompilasi'),
('2015 4350 1392', 'Febriani Safitri', '82', '70', '70', 'B', '3.0', 'Teknik_Kompilasi'),
('2015 4350 1395', 'Hanif Hesya Ghifari', '0', '0', '0', 'E', '0', 'Teknik_Kompilasi'),
('2015 4350 1398', 'Ahmad Febyansyah', '91', '90', '90', 'A', '4.0', 'Teknik_Kompilasi'),
('2015 4350 1401', 'Mega Oktavia', '83', '90', '90', 'A-', '3.75', 'Teknik_Kompilasi'),
('2015 4350 1404', 'Alif Abdul Basith', '91', '85', '80', 'A-', '3.75', 'Teknik_Kompilasi'),
('2015 4350 1410', 'Putri Nurjannah Marasabessy', '87', '70', '70', 'B', '3.0', 'Teknik_Kompilasi'),
('2015 4350 1411', 'Muhammad Barkah', '83', '75', '80', 'B+', '3.25', 'Teknik_Kompilasi'),
('2015 4350 1413', 'Sony Indra Prabowo', '78', '70', '65', 'B-', '2.75', 'Teknik_Kompilasi'),
('2015 4350 1414', 'Ade Nana Juliana', '80', '65', '60', 'C+', '2.25', 'Teknik_Kompilasi'),
('2015 4350 1418', 'Nirwan Apriansyah', '83', '70', '75', 'B', '3.0', 'Teknik_Kompilasi'),
('2015 4350 1420', 'Ramadhan Firdaus', '83', '60', '60', 'C+', '2.25', 'Teknik_Kompilasi'),
('2015 4350 1421', 'Sherly Mardilah', '87', '75', '80', 'B+', '3.25', 'Teknik_Kompilasi'),
('2015 4350 1423', 'Ahmad Eko Hardianto', '83', '75', '70', 'B', '3.0', 'Teknik_Kompilasi'),
('2015 4350 1432', 'Amran Baldah Fazri', '80', '65', '60', 'C+', '2.25', 'Teknik_Kompilasi'),
('2015 4350 1433', 'Umar Jati Alamsyah', '0', '0', '0', 'E', '0', 'Teknik_Kompilasi'),
('2015 4350 1441', 'Hery Siswandi', '0', '0', '0', 'E', '0', 'Teknik_Kompilasi'),
('2015 4350 1450', 'Rehulina Kabeakan', '82', '85', '80', 'A-', '3.75', 'Teknik_Kompilasi'),
('2015 4350 1453', 'Untung Angga Saputra', '78', '70', '75', 'B', '3.0', 'Teknik_Kompilasi'),
('2015 4350 2242', 'Qory Ichsana Savitri', '82', '70', '75', 'B', '3.0', 'Teknik_Kompilasi'),
('2015 4350 2246', 'Ridho Imam Nugroho', '78', '65', '60', 'C+', '2.25', 'Teknik_Kompilasi'),
('2015 4350 2252', 'Fatqur Rohim', '91', '85', '80', 'A-', '3.75', 'Teknik_Kompilasi'),
('2015 4350 2253', 'Bayu Novian Wiguna', '80', '80', '80', 'A-', '3.75', 'Teknik_Kompilasi'),
('2015 4350 2263', 'Meikel Fiveton Situmorang', '78', '70', '70', 'B-', '2.75', 'Teknik_Kompilasi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
 ADD PRIMARY KEY (`Username`);

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
