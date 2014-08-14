package cj.testground

/**
 * Created by sjanota on 8/14/14.
 */
class MultipleResults {
    static def getTwoNextDoubles(int i) {
        [i, i*2, i*4]
    }
    static def getSingleDouble(int i) {
        i*2
    }
}
