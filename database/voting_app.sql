-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2024 at 06:44 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

CREATE DATABASE voting_app;
use voting_app;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `voting_app`
--

-- --------------------------------------------------------

--
-- Table structure for table `party_lists`
--

CREATE TABLE `party_lists` (
  `id` int AUTO_INCREMENT PRIMARY KEY,
  `party_lists` varchar(255) NOT NULL,
  `president` varchar(255) NOT NULL,
  `vice president` varchar(255) NOT NULL,
  `secretary` varchar(255) NOT NULL,
  `treasurer` varchar(255) NOT NULL,
  `auditor` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `party_lists`
--

INSERT INTO `party_lists` (`id`, `party_lists`, `president`, `vice president`, `secretary`, `treasurer`, `auditor`) VALUES
(1, 'ONE PIECE PARTYLIST', 'Monkey D. Luffy', 'Roronoa Zoro', 'Vinsmoke Sanji', 'Sogeking Usopp', 'Nico Robin'),
(2, 'DRAGON BALL Z PARTYLIST', 'Son Goku', 'Prince Vegeta', 'Trunks Brief', 'Tenshin Han', 'Videl Satan');

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`id`, `name`, `description`) VALUES
(1, 'admin', 'Administrator'),
(2, 'user', 'Student Account');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `student_id` varchar(255) NOT NULL,
  `student_name` varchar(255) NOT NULL,
  `phone_num` bigint(255) NOT NULL,
  `course` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role_id` int(11) NOT NULL,
  `status` enum('active','inactive') NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `updated_at` datetime DEFAULT NULL,
  `deleted_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `user` (`id`, `student_id`, `student_name`, `phone_num`, `course`, `password`, `role_id`, `status`, `created_at`, `updated_at`, `deleted_at`) VALUES ('1', 'admin', 'admin', '1', 'admin', 'admin', '1', 'active', current_timestamp(), NULL, NULL);
INSERT INTO `user` (`id`, `student_id`, `student_name`, `phone_num`, `course`, `password`, `role_id`, `status`, `created_at`, `updated_at`, `deleted_at`) VALUES ('2', 'juan123', 'juan123', '0999123123', 'IT', 'password123', '2', 'active', current_timestamp(), NULL, NULL);
--
-- Indexes for dumped tables
--

--
-- Indexes for table `party_lists`
--


--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `user` (`role_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `party_lists`
--
ALTER TABLE `party_lists`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
