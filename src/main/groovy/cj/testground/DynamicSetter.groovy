package cj.testground

/**
 * Created by sjanota on 8/14/14.
 */
class DynamicSetter {

    private int property

    void setProperty(String n) {
        property = Integer.valueOf(n) * 2
    }

    int getProperty() {
        return property
    }
}
