package com.example.restservice.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@EnableScheduling
public class ScheduledTasks {

    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private Jedis jedis = new Jedis("127.0.0.1",6379);

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        log.info("现在的时间是{}", dateFormat.format(new Date()));
    }

    //使用redis
    @Scheduled(fixedRate = 10000)
    public void redis() {
        log.info("jedis开始{}", dateFormat.format(new Date()));
        jedis.set("ceshi","我来测试一下这样行不行");
        log.info("redis测试结束，定时执行完毕");
    }
}
