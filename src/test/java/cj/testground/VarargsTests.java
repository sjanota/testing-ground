package cj.testground;

import cj.testground.VarargsClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by sjanota on 8/12/14.
 */
public class VarargsTests {
    @Test
    public void arrayAsVarargTest() {
        Object[] args = {1, 2, 3};
        List<Object> result = new VarargsClass().varargsToList(args);
        assertArrayEquals(args, result.toArray());
    }

    @Test
    public void arrayAndValueAsVarargTest() {
        Object[] args = {1, 2, 3};
        Object[] expected = {args, 1};
        List<Object> result = new VarargsClass().varargsToList(args, 1);
        assertArrayEquals(expected, result.toArray());
    }
}
