package org.unibl.etf.pisio.conference.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Date;

public class Logging {

    public static void logException (Throwable exception, Log log) {
        StringBuilder builder = new StringBuilder();
        builder.append(exception);
        builder.append(" - ");
        builder.append(new Date());
        builder.append(System.lineSeparator());

        for (StackTraceElement element: exception.getStackTrace()) {
            builder.append(element);
            builder.append(System.lineSeparator());
        }
        log.error(builder);
    }

    public static <T> void logException(Throwable exception, Class<T> tClass) {
        logException(exception, LogFactory.getLog(tClass));
    }
}