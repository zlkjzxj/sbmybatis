package com.walle.sbmybatis;

import com.walle.sbmybatis.dao.GirlDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class SbmybatisApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SbmybatisApplication.class, args);
    }

    private final GirlDao girlDao;

    public SbmybatisApplication(GirlDao girlDao) {
        this.girlDao = girlDao;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.girlDao.selectGirlById(1));
    }
}
