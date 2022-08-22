package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public enum Logger {
    LOGGER;
    protected int num = 1;
    DateTimeFormatter timeStampFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public static Logger getInstance() {
        return LOGGER;
    }

    public void log(String msg) {
        System.out.println("[" + dataTimeStamp() + " " + num++ + "] " + msg);
    }

    private String dataTimeStamp() {
        return LocalDateTime.now().format(timeStampFormat);
    }
}
