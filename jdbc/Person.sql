
CREATE TABLE IF NOT EXISTS `Person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;


INSERT INTO `Person` (`id`, `name`) VALUES
(1, 'charles'),
(2, 'rob');


