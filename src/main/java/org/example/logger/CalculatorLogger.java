package org.example.logger;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CalculatorLogger implements Logging {
    private Logger logger;

    public CalculatorLogger(Class<?> clazz) {
        logger = Logger.getLogger(clazz.getName());
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.ALL);
    }

    @Override
    public void logInfo(String message) {
        logger.info(message);
    }

    public void logError(String message) {
        logger.severe(message);
    }
}
