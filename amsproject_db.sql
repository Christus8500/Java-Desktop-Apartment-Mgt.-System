-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 30, 2023 at 09:55 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `amsproject_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `apartment`
--

CREATE TABLE `apartment` (
  `apartmentNumber` int(20) NOT NULL,
  `size` varchar(20) NOT NULL,
  `aptType` varchar(50) NOT NULL,
  `rentalFee` varchar(50) NOT NULL,
  `buildingName` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `apartment`
--

INSERT INTO `apartment` (`apartmentNumber`, `size`, `aptType`, `rentalFee`, `buildingName`) VALUES
(1, '250x270', 'Family House', '$200', 'Storey'),
(2, '200x300', 'Office', '$500', 'Bungalow'),
(3, '2500x2000', 'Family House', '$2,000', 'Duplex'),
(4, '250x280', 'Family House', '$300', 'Duplex'),
(5, '250x270', 'Family Relaxation House', '$200', 'Thatched House');

-- --------------------------------------------------------

--
-- Table structure for table `apartmentchange`
--

CREATE TABLE `apartmentchange` (
  `apartmentChangeID` int(10) NOT NULL,
  `tenantID` int(10) NOT NULL,
  `apartmentNumber` int(20) NOT NULL,
  `newAptNumber` int(20) NOT NULL,
  `changeDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `apartmentchange`
--

INSERT INTO `apartmentchange` (`apartmentChangeID`, `tenantID`, `apartmentNumber`, `newAptNumber`, `changeDate`) VALUES
(1, 1, 1, 2, '2023-10-03');

-- --------------------------------------------------------

--
-- Table structure for table `apt_change_apply`
--

CREATE TABLE `apt_change_apply` (
  `applyID` int(10) NOT NULL,
  `tenantID` int(10) NOT NULL,
  `currentApt` int(10) NOT NULL,
  `newApt` int(10) NOT NULL,
  `reason` text NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `apt_change_apply`
--

INSERT INTO `apt_change_apply` (`applyID`, `tenantID`, `currentApt`, `newApt`, `reason`, `date`) VALUES
(1, 1, 1, 2, 'I want to see the ocean', '2023-10-03'),
(2, 1, 1, 2, 'The neighbours disturbs', '2023-10-04'),
(3, 1, 2, 1, 'The waters are not functioning', '2023-10-04');

-- --------------------------------------------------------

--
-- Table structure for table `building`
--

CREATE TABLE `building` (
  `landlordID` int(10) NOT NULL,
  `buildingName` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `cityStateZip` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `building`
--

INSERT INTO `building` (`landlordID`, `buildingName`, `address`, `cityStateZip`) VALUES
(1, 'Bungalow', '21 Offroad, Awka', '12345'),
(1, 'Duplex', '21 Ziks Avenue, Awka, Anambra State', '141235'),
(1, 'Storey', 'Awka, Anambra State', '435261'),
(1, 'Thatched House', 'Offroad, PortHacourt', '234154');

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `employeeID` int(10) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`employeeID`, `firstname`, `lastname`, `password`, `phone`, `email`) VALUES
(1, 'Joseph', 'Abone', 'Joseph@25', '08166149300', 'josephabone@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `landlord`
--

CREATE TABLE `landlord` (
  `landlordID` int(10) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `landlord`
--

INSERT INTO `landlord` (`landlordID`, `password`) VALUES
(1, '8500');

-- --------------------------------------------------------

--
-- Table structure for table `lease`
--

CREATE TABLE `lease` (
  `leaseID` int(10) NOT NULL,
  `tenantID` int(10) NOT NULL,
  `apartmentNumber` int(15) NOT NULL,
  `startDate` date NOT NULL,
  `endDate` date NOT NULL,
  `MonthlyRent` varchar(50) NOT NULL,
  `securityDeposit` varchar(20) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `lease`
--

INSERT INTO `lease` (`leaseID`, `tenantID`, `apartmentNumber`, `startDate`, `endDate`, `MonthlyRent`, `securityDeposit`, `status`) VALUES
(1, 1, 2, '2023-10-01', '2023-10-31', '$500', '$400', 'Active'),
(2, 3, 1, '2023-07-01', '2023-10-31', '$200', '$170', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `maintenance`
--

CREATE TABLE `maintenance` (
  `maintenanceID` int(10) NOT NULL,
  `apartmentNumber` int(10) NOT NULL,
  `maintenanceDate` date NOT NULL,
  `templateName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `maintenance`
--

INSERT INTO `maintenance` (`maintenanceID`, `apartmentNumber`, `maintenanceDate`, `templateName`) VALUES
(1, 1, '2023-10-10', 'Maintenance'),
(2, 2, '2023-10-04', 'Maintenance');

-- --------------------------------------------------------

--
-- Table structure for table `maintenance_request`
--

CREATE TABLE `maintenance_request` (
  `maintenance_requestID` int(10) NOT NULL,
  `apartmentNo` int(10) NOT NULL,
  `description` text NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `maintenance_request`
--

INSERT INTO `maintenance_request` (`maintenance_requestID`, `apartmentNo`, `description`, `date`) VALUES
(1, 1, 'Our Windows are broken', '2023-10-03'),
(2, 1, 'The shower is not running', '2023-10-11'),
(3, 2, 'Our roof is leaking', '2023-10-11');

-- --------------------------------------------------------

--
-- Table structure for table `notificationtemplate`
--

CREATE TABLE `notificationtemplate` (
  `templateName` varchar(50) NOT NULL,
  `description` text NOT NULL,
  `subject` varchar(100) NOT NULL,
  `emailAddress` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `notificationtemplate`
--

INSERT INTO `notificationtemplate` (`templateName`, `description`, `subject`, `emailAddress`) VALUES
('Maintenance', 'Maintenance Completed', 'Status', 'john23@gmail.com'),
('Rent Due', 'Pay Rent', 'Status', 'john25@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `payID` int(10) NOT NULL,
  `payDate` date NOT NULL,
  `payAmount` varchar(50) NOT NULL,
  `apartmentNumber` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`payID`, `payDate`, `payAmount`, `apartmentNumber`) VALUES
(1, '2023-10-05', '$200', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tenant`
--

CREATE TABLE `tenant` (
  `tenantID` int(10) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `currentAddress` varchar(255) NOT NULL,
  `cityStateZip` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tenant`
--

INSERT INTO `tenant` (`tenantID`, `firstname`, `lastname`, `password`, `phone`, `email`, `currentAddress`, `cityStateZip`) VALUES
(1, 'Johnson', 'Nweke', 'Johnson25', '09009090990', 'johnson23@gmail.com', 'WaterSide, Onitsha, Anambra State', '141109'),
(3, 'Joseph', 'Abone', 'Joseph25', '09009091111', 'joseph23@gmail.com', 'RiverBank, Onitsha, Anambra State', '141109');

-- --------------------------------------------------------

--
-- Table structure for table `tenant_complaint`
--

CREATE TABLE `tenant_complaint` (
  `complaintID` int(10) NOT NULL,
  `buildingName` varchar(50) NOT NULL,
  `apartmentNo` int(10) NOT NULL,
  `tenant_email` varchar(50) NOT NULL,
  `complaint` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tenant_complaint`
--

INSERT INTO `tenant_complaint` (`complaintID`, `buildingName`, `apartmentNo`, `tenant_email`, `complaint`) VALUES
(1, 'Duplex', 3, 'joseph23@gmail.com', 'We do not have steady water supply'),
(2, 'Duplex', 3, 'joseph23@gmail.com', 'Our light went off last week, and it has not been repaired'),
(3, 'Storey', 1, 'johnson23@gmail.com', 'Can you provide elevator at our building??'),
(4, 'Storey', 1, 'johnson23@gmail.com', 'We wish to see the owner'),
(5, 'Storey', 1, 'johnson23@gmail.com', 'We do not not have steady electricity'),
(6, 'Duplex', 1, 'joseph23@gmail.com', 'We have shortage of water'),
(7, 'Duplex', 1, 'joseph23@gmail.com', 'We need reduction in rent');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `apartment`
--
ALTER TABLE `apartment`
  ADD PRIMARY KEY (`apartmentNumber`),
  ADD KEY `buildingName` (`buildingName`);

--
-- Indexes for table `apartmentchange`
--
ALTER TABLE `apartmentchange`
  ADD PRIMARY KEY (`apartmentChangeID`),
  ADD KEY `apartmentNumber` (`apartmentNumber`),
  ADD KEY `tenantID` (`tenantID`);

--
-- Indexes for table `apt_change_apply`
--
ALTER TABLE `apt_change_apply`
  ADD PRIMARY KEY (`applyID`),
  ADD KEY `currentApt` (`currentApt`),
  ADD KEY `newApt` (`newApt`),
  ADD KEY `tenantID` (`tenantID`);

--
-- Indexes for table `building`
--
ALTER TABLE `building`
  ADD PRIMARY KEY (`buildingName`),
  ADD KEY `landlordID` (`landlordID`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`employeeID`);

--
-- Indexes for table `landlord`
--
ALTER TABLE `landlord`
  ADD PRIMARY KEY (`landlordID`);

--
-- Indexes for table `lease`
--
ALTER TABLE `lease`
  ADD PRIMARY KEY (`leaseID`),
  ADD KEY `tenantID` (`tenantID`),
  ADD KEY `apartmentNumber` (`apartmentNumber`);

--
-- Indexes for table `maintenance`
--
ALTER TABLE `maintenance`
  ADD PRIMARY KEY (`maintenanceID`),
  ADD KEY `apartmentNumber` (`apartmentNumber`),
  ADD KEY `templateName` (`templateName`);

--
-- Indexes for table `maintenance_request`
--
ALTER TABLE `maintenance_request`
  ADD PRIMARY KEY (`maintenance_requestID`);

--
-- Indexes for table `notificationtemplate`
--
ALTER TABLE `notificationtemplate`
  ADD PRIMARY KEY (`templateName`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`payID`),
  ADD KEY `payment_ibfk_1` (`apartmentNumber`);

--
-- Indexes for table `tenant`
--
ALTER TABLE `tenant`
  ADD PRIMARY KEY (`tenantID`);

--
-- Indexes for table `tenant_complaint`
--
ALTER TABLE `tenant_complaint`
  ADD PRIMARY KEY (`complaintID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `apartmentchange`
--
ALTER TABLE `apartmentchange`
  MODIFY `apartmentChangeID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `apt_change_apply`
--
ALTER TABLE `apt_change_apply`
  MODIFY `applyID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `employeeID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `landlord`
--
ALTER TABLE `landlord`
  MODIFY `landlordID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `lease`
--
ALTER TABLE `lease`
  MODIFY `leaseID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `maintenance`
--
ALTER TABLE `maintenance`
  MODIFY `maintenanceID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `maintenance_request`
--
ALTER TABLE `maintenance_request`
  MODIFY `maintenance_requestID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `payID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tenant`
--
ALTER TABLE `tenant`
  MODIFY `tenantID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tenant_complaint`
--
ALTER TABLE `tenant_complaint`
  MODIFY `complaintID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `apartment`
--
ALTER TABLE `apartment`
  ADD CONSTRAINT `apartment_ibfk_1` FOREIGN KEY (`buildingName`) REFERENCES `building` (`buildingName`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `apartmentchange`
--
ALTER TABLE `apartmentchange`
  ADD CONSTRAINT `apartmentchange_ibfk_1` FOREIGN KEY (`apartmentNumber`) REFERENCES `apartment` (`apartmentNumber`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `apartmentchange_ibfk_2` FOREIGN KEY (`tenantID`) REFERENCES `tenant` (`tenantID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `apt_change_apply`
--
ALTER TABLE `apt_change_apply`
  ADD CONSTRAINT `apt_change_apply_ibfk_1` FOREIGN KEY (`currentApt`) REFERENCES `apartment` (`apartmentNumber`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `apt_change_apply_ibfk_2` FOREIGN KEY (`newApt`) REFERENCES `apartment` (`apartmentNumber`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `apt_change_apply_ibfk_3` FOREIGN KEY (`tenantID`) REFERENCES `tenant` (`tenantID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `building`
--
ALTER TABLE `building`
  ADD CONSTRAINT `building_ibfk_1` FOREIGN KEY (`landlordID`) REFERENCES `landlord` (`landlordID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `lease`
--
ALTER TABLE `lease`
  ADD CONSTRAINT `lease_ibfk_1` FOREIGN KEY (`tenantID`) REFERENCES `tenant` (`tenantID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `lease_ibfk_2` FOREIGN KEY (`apartmentNumber`) REFERENCES `apartment` (`apartmentNumber`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `maintenance`
--
ALTER TABLE `maintenance`
  ADD CONSTRAINT `maintenance_ibfk_1` FOREIGN KEY (`apartmentNumber`) REFERENCES `apartment` (`apartmentNumber`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `maintenance_ibfk_2` FOREIGN KEY (`templateName`) REFERENCES `notificationtemplate` (`templateName`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `payment_ibfk_1` FOREIGN KEY (`apartmentNumber`) REFERENCES `apartment` (`apartmentNumber`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
