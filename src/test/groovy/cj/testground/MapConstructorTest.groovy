package cj.testground

import org.codehaus.groovy.runtime.typehandling.GroovyCastException
import org.junit.Test

import static org.junit.Assert.*

/**
 * Created by sjanota on 8/13/14.
 */
class MapConstructorTest {

    @Test
    void createObjectFromMapTest() {
        def map = [name:"name", value:3]
        def object = new MapConstructor(map)

        assertEquals("name", object.name)
        assertEquals(null, object.path)
        assertEquals(3, object.value)
    }

    @Test(expected=GroovyCastException.class)
    void createObjectFromMapWithBadTypeTest() {
        def map = [name:"name", value:"3a"]
        new MapConstructor(map)
    }
}
