package com.example.MSGpsUtil;

import gpsUtil.GpsUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MsGpsUtilModule {

    @Bean
    public GpsUtil getGpsUtil() {
        return new GpsUtil();
    }

}
