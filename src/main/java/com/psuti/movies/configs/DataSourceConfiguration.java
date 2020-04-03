package com.psuti.movies.configs;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {
    private static String DATABASE_DRIVER_CLASS_NAME = "com.mysql.cj.jdbc.Driver";
    private static String DATABASE_URL_ENV_VAR = "DB_URL";
    private static String DEFAULT_DATABASE_URL = "jdbc:mysql://other:password@13.13.13.239:32771/movies";

    @Bean
    public DataSource getDataSource() {
        String dataBaseUrl = System.getenv(DATABASE_URL_ENV_VAR);
        if (dataBaseUrl == null || dataBaseUrl.equals(""))
            dataBaseUrl = DEFAULT_DATABASE_URL;

        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(DATABASE_DRIVER_CLASS_NAME);
        dataSourceBuilder.url(dataBaseUrl);
        return dataSourceBuilder.build();
    }

}
