package cj.testground;

import javax.inject.Inject;

/**
 * Created by mrakr_000 on 2014-08-21.
 */
public class AbstractClassWithInjection {

    @Inject
    private Integer fieldInAbstract;

    public Integer getFieldInAbstract() {
        return fieldInAbstract;
    }
}
