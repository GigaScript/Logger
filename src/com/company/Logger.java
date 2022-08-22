package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    protected int num = 1;
    private static Logger logger = null;
    DateTimeFormatter timeStampFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + dataTimeStamp() + " " + num++ + "] " + msg);
    }

    private String dataTimeStamp() {
        return LocalDateTime.now().format(timeStampFormat);
    }

}
