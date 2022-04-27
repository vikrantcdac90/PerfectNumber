package com.worldline.api.service;

import org.springframework.stereotype.Service;

import java.util.List;


public interface PerfectNumberService {
        public boolean isPerfect(long number);
        public List rangeOfPerfectNumber(long start, long end);
}
