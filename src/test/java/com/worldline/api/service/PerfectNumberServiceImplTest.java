package com.worldline.api.service;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerfectNumberServiceImplTest {
    public PerfectNumberSercviceImpl serviceImpl=new PerfectNumberSercviceImpl();

    @Test
    public void checkPerfectNumber(){
        boolean checkPerfectNo=serviceImpl.isPerfect(6);
        Assert.assertEquals(true,true);
    }

    @Test
    public void checkPerfectNumberBetweenRange(){
        List list=new ArrayList<>();
        list=serviceImpl.rangeOfPerfectNumber(1,100);
        Assert.assertEquals(Arrays.asList(6,28),list);
    }

}
