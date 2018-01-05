package com.walle.sbmybatis;

import com.walle.sbmybatis.bean.Girl;
import com.walle.sbmybatis.dao.GirlDao;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
@SpringBootApplication
@MapperScan("com.walle.sbmybatis.dao")//这个扫描的是dao连接mapper
public class SbmybatisApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(SbmybatisApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SbmybatisApplication.class, args);
    }

    @Resource
    private GirlDao girlDao;

    @Override
    public void run(String... args) throws Exception {
        Girl girl = girlDao.selectGirlById(1);
        System.out.println(girl.getName());
        logger.info("程序启动啦！！！");
    }
}
