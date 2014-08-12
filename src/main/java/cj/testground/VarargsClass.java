package cj.testground;

import java.util.Arrays;
import java.util.List;

/**
 * Created by sjanota on 8/12/14.
 */
public class VarargsClass {
    public List<Object> varargsToList(Object... varargs) {
        return Arrays.asList(varargs);
    }
}
