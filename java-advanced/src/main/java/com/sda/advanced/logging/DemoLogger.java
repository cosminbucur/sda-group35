package com.sda.advanced.logging;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * SEVERE (highest)
 * WARNING
 * INFO
 * CONFIG
 * FINE
 * FINER
 * FINEST
 */
public class DemoLogger {

    // singleton object = a single instance
    static String className = DemoLogger.class.getName();
    private static final Logger LOGGER = Logger.getLogger(className);

    public static void main(String[] args) {
        LOGGER.severe("some sever message / error");
        LOGGER.warning("some warning");
        LOGGER.info("some info");

        List<String> names = List.of("ana", "paul");
        names.forEach(name -> LOGGER.fine(name));

        // string interpolation
        LOGGER.log(Level.INFO, "the size is {0} elements", names.size());

        for (int i = 0; i < names.size(); i++) {
            LOGGER.log(Level.INFO, "processing {0} -> {1}", new Object[]{i, names.get(i)});
        }
    }
}
