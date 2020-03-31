package com.dem.server.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RecordNotFoundException extends Throwable {

    private final static Logger LOGGER = LoggerFactory.getLogger(RecordNotFoundException.class);

    public RecordNotFoundException(String s) {
        LOGGER.error(s);
    }
}
