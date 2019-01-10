package com.now;

public class DatabaseLoggerFactory extends LoggerFactory {
    public Logger createLogger() {
        Logger logger = new DatabaseLogger();
        return logger;
    }
}
