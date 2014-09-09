package cj.testground;

import cj.testground.reflection.AnnotatedClass;
import cj.testground.reflection.Interface;
import cj.testground.reflection.Module;
import com.google.common.base.Predicate;
import javax.annotation.Nullable;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.reflections.ReflectionUtils;
import org.reflections.Reflections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by mrakr_000 on 2014-09-09.
 */
public class ReflectionTests {

    private Logger log = LogManager.getLogger(this.getClass());

    @Test
    public void getClassesImplementingInterface() {
        Log4j2Logging.changeRootLogLevel(Level.ALL);
        Class<?>[] expected = {cj.testground.reflection.Class.class};

        Set<Class<? extends Interface>> classes = new Reflections().getSubTypesOf(Interface.class);

        log.info("Classes: {}", classes);
        assertArrayEquals(expected, classes.toArray());
    }

    @Test
    public void getAnnotatedClasses() {
        Log4j2Logging.changeRootLogLevel(Level.ALL);
        Class<?>[] expected = {AnnotatedClass.class};

        Set<Class<?>> classes = new Reflections().getTypesAnnotatedWith(Module.class);

        log.info("Classes: {}", classes);
        assertArrayEquals(expected, classes.toArray());
    }
}
