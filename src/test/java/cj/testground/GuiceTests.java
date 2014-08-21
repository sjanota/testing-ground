package cj.testground;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mrakr_000 on 2014-08-21.
 */
public class GuiceTests {

    @Test
    public void injectToAbstractClassTest() {
        final String testString = "testString";
        final Integer testInt = 666;

        Injector injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(String.class).toInstance(testString);
                bind(Integer.class).toInstance(testInt);
            }
        });

        ConcreteClassWithInjection o = injector.getInstance(ConcreteClassWithInjection.class);
        assertEquals(o.getText(), testString);
        assertEquals(o.getFieldInAbstract(), testInt);
    }
}
