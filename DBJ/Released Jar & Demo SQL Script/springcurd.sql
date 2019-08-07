-- phpMyAdmin SQL Dump
-- version 4.8.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 07, 2019 at 05:05 PM
-- Server version: 10.1.33-MariaDB
-- PHP Version: 7.1.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `springcurd`
--

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `first_name`, `last_name`, `email`) VALUES
(1, 'David', 'Adams', 'david@luv2code.com'),
(2, 'John', 'Doe', 'john@luv2code.com'),
(3, 'Ajay', 'Rao', 'ajay@luv2code.com'),
(4, 'Mary', 'Public', 'mary@luv2code.com'),
(5, 'Maxwell', 'Dixon', 'max@luv2code.com'),
(6, 'Soumyadip', 'Chowdhury', 'soumyadip.note@gmail.com'),
(7, 'Max', 'Wane', 'eric.market_09@yahoo.com11'),
(8, 'Soumya', 'Dip', 'david@spring.com'),
(9, 'Soumya', 'Di[', 'david@spring.com'),
(10, 'Soumya', 'Chowdhury', 'soumya@note.com'),
(11, 'Mary', 'Public', 'mary@luv2code.com'),
(12, 'David', 'Adams', 'david@luv2code.com'),
(29, 'Soumyadip', 'Choudhury', 'x@gmail.com'),
(30, 'Soumyadip', 'Choudhury', 'x@gmail.com'),
(31, 'first_name', 'last_name', 'email'),
(32, 'Soumyadip', 'Choudhury', 'x@gmail.com'),
(33, 'Soumyadip', 'Choudhury', 'x@gmail.com'),
(34, 'Soumyadip', 'Choudhury', 'x@gmail.com'),
(35, 'Soumyadip', 'Choudhury', 'x@gmail.com'),
(36, 'Soumyadip', 'Chowdhury', 'x@gmail.com'),
(37, 'Soumyadip', 'Chowdhury', 'gdg@gmail.com'),
(38, 'Soumyadip', 'Chowdhury', 'gdg@gmail.com'),
(39, 'Soumyadip', 'Chowdhury', 'gdg@gmail.com'),
(40, 'Soumyadip', 'Chowdhury', 'gdg@gmail.com'),
(41, 'Soumyadip', 'Chowdhury', 'gdg@gmail.com'),
(42, 'Soumyadip', 'Chowdhury', 'gdgDevfest@gmail.com'),
(43, 'Soumyadip', 'Chowdhury', 'gdgDevfest@gmail.com'),
(44, 'Soumyadip', 'Chowdhury', 'gdgDevfest@gmail.com'),
(45, 'Soumyadip', 'Chowdhury', 'gdgDevfest@gmail.com'),
(46, 'Soumyadip', 'Chowdhury', 'gdgDevfest@gmail.com'),
(47, 'Soumyadip', 'Chowdhury', 'gdgDevfest@gmail.com'),
(48, 'Soumyadip', 'Chowdhury', 'gdgDevfest@gmail.com'),
(49, 'Soumyadip', 'Chowdhury', 'gdgDevfest@gmail.com'),
(50, 'Soumyadip', 'Chowdhury', 'gdgDevfest@gmail.com'),
(51, 'Soumyadip', 'Chowdhury', 'gdgDevfest@gmail.com'),
(52, 'Soumyadip', 'Chowdhury', 'gdgDevfest@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
