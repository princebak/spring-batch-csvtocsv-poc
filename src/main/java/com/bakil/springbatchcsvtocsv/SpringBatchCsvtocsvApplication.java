package com.bakil.springbatchcsvtocsv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpringBatchCsvtocsvApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBatchCsvtocsvApplication.class, args);
    }

}
