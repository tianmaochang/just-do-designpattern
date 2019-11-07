package com.now;

public class FileLoggerFactory extends LoggerFactory {

    public Logger createLogger() {
        Logger logger = new FileLogger();
        return logger;
    }
}
