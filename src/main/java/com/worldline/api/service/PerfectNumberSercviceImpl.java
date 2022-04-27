package com.worldline.api.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PerfectNumberSercviceImpl implements PerfectNumberService{
    @Override
    public boolean isPerfect(long number) {
        long sum=0;
        for(int i=1; i <= number/2; i++)
        {
            if(number % i == 0)
            {
                sum=sum + i;
            }
        }
        if(sum == number)
            return true;
        else
            return false;
    }

    @Override
    public List rangeOfPerfectNumber(long start, long end) {
        List<Long> perfectNumbersList=new ArrayList<>();
        for(long i=start;i<=end;i++){
            if(isPerfect(i))
                perfectNumbersList.add(i);
        }
        return perfectNumbersList;
    }
}
