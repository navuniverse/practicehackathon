DROP SCHEMA IF EXISTS `hackathon`;
CREATE SCHEMA IF NOT EXISTS `hackathon`;

CREATE TABLE IF NOT EXISTS hackathon.`user` (
	`username` VARCHAR(128) NOT NULL,
	`password` VARCHAR(128) NOT NULL,
	`email` VARCHAR(128) NOT NULL,
	`full_name` VARCHAR(128) NOT NULL,
	PRIMARY KEY (`username`),
	UNIQUE KEY usernameemail(`username`,`email`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS hackathon.`social_media_config` (
	`type` VARCHAR(128) NOT NULL,
	`username` VARCHAR(128) NOT NULL,
	`password` VARCHAR(128) NOT NULL,
	`token` VARCHAR(512) NOT NULL,
	PRIMARY KEY (`username`),
	UNIQUE KEY usernametype(`username`,`type`)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

CREATE TABLE IF NOT EXISTS hackathon.`twitter_messages` (
	`tweet_id` VARCHAR(128) NOT NULL,
	`lead_id` VARCHAR(128) NOT NULL,
	`message` TEXT NOT NULL,
	`status` VARCHAR(128) NOT NULL,
	`username` VARCHAR(128) NOT NULL,
	PRIMARY KEY (`tweet_id`),
	CONSTRAINT `FK_twitter_messages_username` FOREIGN KEY (`username`) REFERENCES `user` (`username`) ON DELETE CASCADE
) ENGINE=INNODB DEFAULT CHARSET=latin1;