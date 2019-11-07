package com.now;

public abstract class LoggerFactory {
    public abstract Logger createLogger();

    public void writeLog(){
        Logger logger = this.createLogger();
        logger.writeLogger();
    }
}
