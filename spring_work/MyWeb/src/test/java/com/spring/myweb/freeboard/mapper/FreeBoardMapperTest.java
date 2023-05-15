package com.spring.myweb.freeboard.mapper;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class) //테스트 환경을 만들어주는 junit5객제 로딩
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/config/db"
}
		)
public class FreeBoardMapperTest {
	
}
