-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 17-Jul-2020 às 20:30
-- Versão do servidor: 5.6.15-log
-- PHP Version: 5.4.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `dblata`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbacesso`
--

CREATE TABLE IF NOT EXISTS `tbacesso` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `sexo` varchar(10) NOT NULL,
  `dataAni` date NOT NULL,
  `celular` varchar(13) NOT NULL,
  `email` varchar(150) NOT NULL,
  `senha` varchar(64) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Extraindo dados da tabela `tbacesso`
--

INSERT INTO `tbacesso` (`id`, `nome`, `sexo`, `dataAni`, `celular`, `email`, `senha`) VALUES
(1, 'Gabriel Lopes', 'Masculino', '2004-04-05', '51980124849', 'a', 'a');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tblata`
--

CREATE TABLE IF NOT EXISTS `tblata` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `marca` varchar(80) NOT NULL,
  `volume` double NOT NULL,
  `ano` int(11) NOT NULL,
  `pais` varchar(60) NOT NULL,
  `altura` double NOT NULL,
  `diametro` double NOT NULL,
  `descricao` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Extraindo dados da tabela `tblata`
--

INSERT INTO `tblata` (`id`, `marca`, `volume`, `ano`, `pais`, `altura`, `diametro`, `descricao`) VALUES
(1, '1', 1, 1, '1', 1, 1, '1');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
