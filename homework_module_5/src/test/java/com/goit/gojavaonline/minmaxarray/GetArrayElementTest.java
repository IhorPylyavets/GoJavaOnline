package com.goit.gojavaonline.minmaxarray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetArrayElementTest {

    @Test
    public void testGetMaxArrayElement() throws Exception {
        int[] arr = {2, 5, 8, 0, 12, -5, 1};
        int resultMax = GetArrayElement.getMaxArrayElement(arr);

        Assert.assertEquals(12, resultMax);
    }

    @Test
    public void testGetMinArrayElement() throws Exception {
        int[] arr = {2, 5, 8, 0, 12, -5, 1};
        int resultMin = GetArrayElement.getMinArrayElement(arr);

        Assert.assertEquals(-5, resultMin);
    }
}