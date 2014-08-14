package cj.testground

import org.junit.Test

import static org.junit.Assert.*


/**
 * Created by sjanota on 8/14/14.
 */
class ClosureTests {
    @Test
    void delegatePropertyMissingTest() {
        def result = execOnDelegate(new ClosureDelegateOne()){
            mama
        }

        assertEquals(result, 'mama')
    }

    @Test
    void secondDelegatePropertyMissingTest() {
        def result = execOnDelegate(new ClosureDelegateTwo()){
            act {
                mama
            }
        }

        assertEquals(result, 'mama')
    }

    @Test(expected=MissingPropertyException.class)
    void innerDelegatePropertyMissingTest() {
        execOnDelegate(new ClosureDelegateTwo()){
            run {
                mama
            }
        }
    }

    static def execOnDelegate(delegate, Closure c) {
        c.delegate = delegate
        c.resolveStrategy = Closure.DELEGATE_FIRST
        def result = c()
        result
    }
}
