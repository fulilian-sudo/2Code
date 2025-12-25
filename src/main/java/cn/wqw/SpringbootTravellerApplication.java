package cn.wqw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.wqw.mapper")
@SpringBootApplication
public class SpringbootTravellerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTravellerApplication.class, args);
    }

}
