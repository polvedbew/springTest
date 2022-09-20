package com.norden.secnor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ----------------------*    Norden Communication    *-------------------------
 * Created on ${DAY}/${MONTH}/${YEAR}
 * R&D SCK
 * -----------------------------------------------------------------------------
 **/
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("starting server");



        SpringApplication.run(Main.class, args);
    }
}