package cj.testground

import org.junit.Test

import static org.junit.Assert.*

/**
 * Created by sjanota on 8/14/14.
 */
class MultipleResultsTest {

    @Test
    void getAllResultsTest(){
        def result = MultipleResults.getTwoNextDoubles(1)
        assert result instanceof List
        def i, first, second
        (i, first, second) = result

        assertEquals(1, i)
        assertEquals(2, first)
        assertEquals(4, second)
    }

    @Test
    void getSingleResultTest(){
        def result = MultipleResults.getSingleDouble(1)
        assert ! (result instanceof List)

        assertEquals(2, result)
    }
}
