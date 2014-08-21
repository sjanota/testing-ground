package cj.testground;

import javax.inject.Inject;

/**
 * Created by mrakr_000 on 2014-08-21.
 */
public class ConcreteClassWithInjection extends AbstractClassWithInjection {
    @Inject
    private String text;

    public String getText() {
        return text;
    }
}
