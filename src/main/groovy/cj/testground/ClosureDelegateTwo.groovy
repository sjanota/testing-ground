package cj.testground

/**
 * Created by sjanota on 8/14/14.
 */
class ClosureDelegateTwo {
    def run(Closure c) {
        c.delegate = new InnerDelegate()
        c.resolveStrategy = Closure.DELEGATE_FIRST
        c()
    }

    def act(Closure c) {
        c.delegate = new ClosureDelegateOne()
        c.resolveStrategy = Closure.DELEGATE_FIRST
        c()
    }

    class InnerDelegate{
        def propertyMissing(String name) { name }
    }
}
