package com.now;

public class Client {
    public static void main(String[] args) {
//        LoggerFactory factory = new FileLoggerFactory();
//        Logger logger = factory.createLogger();
//        logger.writeLogger();

        LoggerFactory factory = new FileLoggerFactory();
        factory.writeLog();
    }
}
