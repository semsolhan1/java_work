package com.spring.myweb.command;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 # SNS 게시판
CREATE TABLE snsboard (
	bno INT PRIMARY KEY AUTO_INCREMENT,
    writer VARCHAR(50) NOT NULL,
    upload_path VARCHAR(100) NOT NULL,
    file_loca VARCHAR(100) NOT NULL,
    file_name VARCHAR(50) NOT NULL,
    file_real_name VARCHAR(50) NOT NULL,
    content VARCHAR(2000),
	reg_Date DATETIME DEFAULT CURRENT_TIMESTAMP
);
 */
@Getter @Setter @ToString
@NoArgsConstructor @AllArgsConstructor
public class SnsBoardVO {

	private int bno;
	private String writer;
	private String uploadPath;
	private String fileLoca;
	private String fileName;
	private String fileRealName;
	private String content;
	private LocalDateTime regDate;
	
}



















