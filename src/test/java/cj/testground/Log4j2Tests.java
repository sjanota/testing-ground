package cj.testground;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by sjanota on 8/14/14.
 */
public class Log4j2Tests {

    @Test
    public void changeLogLevelTest() {
        Logger l = LogManager.getLogger();

        assertNotEquals(Level.DEBUG, l.getLevel());

        Log4j2Logging.changeRootLogLevel(Level.DEBUG);

        assertEquals(Level.DEBUG, l.getLevel());
    }
}
