package com.spring.myweb.command;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
CREATE TABLE freereply(
	rno INT PRIMARY KEY AUTO_INCREMENT,
    bno INT,
    
    FOREIGN KEY (bno)
    REFERENCES freeboard(bno)
    ON DELETE CASCADE,
    
    reply VARCHAR(1000),
    reply_id VARCHAR(50),
    reply_pw VARCHAR(50),
    reply_date DATETIME DEFAULT CURRENT_TIMESTAMP,
    update_date DATETIME DEFAULT NULL
    );


*/

@Getter
@Setter
@ToString
public class ReplyVO {

	private int rno;
	private int bno;
	
	private String reply;
	private String replyId;
	private String replyPw;
	private LocalDateTime replyDate;
	private LocalDateTime updateDate;
}

















