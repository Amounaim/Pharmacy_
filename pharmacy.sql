-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 21, 2019 at 05:22 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 5.6.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pharmacy`
--

-- --------------------------------------------------------

--
-- Table structure for table `mainusers`
--

CREATE TABLE `mainusers` (
  `user_id` int(11) NOT NULL,
  `login_name` varchar(20) NOT NULL,
  `login_pass` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mainusers`
--

INSERT INTO `mainusers` (`user_id`, `login_name`, `login_pass`) VALUES
(1, 'souhail', '123');

-- --------------------------------------------------------

--
-- Table structure for table `meds`
--

CREATE TABLE `meds` (
  `med_id` int(7) NOT NULL,
  `med_name` varchar(20) NOT NULL,
  `med_number` int(7) NOT NULL,
  `med_man` date NOT NULL,
  `med_exp` date NOT NULL,
  `med_qt` int(20) NOT NULL,
  `med_price` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `meds`
--

INSERT INTO `meds` (`med_id`, `med_name`, `med_number`, `med_man`, `med_exp`, `med_qt`, `med_price`) VALUES
(1, 'Doliprane', 1, '2016-10-10', '2019-06-06', 10, 40),
(2, 'Voltarene', 2, '2014-05-16', '2019-05-23', 15, 60),
(3, 'Aspegic', 3, '2017-05-18', '2019-05-30', 25, 35),
(4, 'Aspro', 4, '2013-05-08', '2016-05-11', 40, 15);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(7) NOT NULL,
  `name` varchar(20) NOT NULL,
  `user_birth` date NOT NULL,
  `user_mail` varchar(20) NOT NULL,
  `user_name` varchar(20) NOT NULL,
  `user_pass` varchar(20) NOT NULL,
  `user_role` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `name`, `user_birth`, `user_mail`, `user_name`, `user_pass`, `user_role`) VALUES
(1, 'SOUHAIL', '1996-11-24', 'souhaildq@gmail.com', 'souhaildq', '123', 'Administrator'),
(3, 'abd', '2019-05-09', 'abd@gmail.com', 'abz', '123', 'Administrator'),
(4, 'ssss', '2019-05-15', 'sghjkjkjkjjhjh', 'hgjhgjhgjhg', '123', 'Administrator');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mainusers`
--
ALTER TABLE `mainusers`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `meds`
--
ALTER TABLE `meds`
  ADD PRIMARY KEY (`med_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `mainusers`
--
ALTER TABLE `mainusers`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
