package cj.testground

import org.junit.Test

import static org.junit.Assert.*

/**
 * Created by sjanota on 8/14/14.
 */
class DynamicSetterTests {

    @Test
    void setPropertyBySetterType() {
        def o = new DynamicSetter()
        o.property = "1"

        assertEquals(2, o.property)
    }

    @Test
    void setPropertyByPropertyType() {
        def o = new DynamicSetter()
        o.property = 1

        assertEquals(2, o.property)
    }

    @Test
    void setPropertyByConvertibleType() {
        def o = new DynamicSetter()
        o.property = 1l

        assertEquals(2, o.property)
    }

    @Test(expected=NumberFormatException.class)
    void setPropertyByInconvertibleType() {
        def o = new DynamicSetter()
        o.property = 1f

    }
}
