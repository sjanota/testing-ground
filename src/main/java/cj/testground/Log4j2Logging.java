package cj.testground;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;

/**
 * Created by sjanota on 8/14/14.
 */
public class Log4j2Logging {

    public static void changeRootLogLevel(Level lvl){
        LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
        Configuration config = ctx.getConfiguration();
        config.getLoggerConfig(LogManager.ROOT_LOGGER_NAME).setLevel(lvl);
        ctx.updateLoggers();
    }
}
