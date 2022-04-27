package com.worldline.api.controller;

import com.worldline.api.service.PerfectNumberService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PerfectNumberController {
    @Autowired
    PerfectNumberService perefctNumberService;

    @ApiOperation(value = "check whether number is perfect or not", response = ResponseEntity.class)
    @RequestMapping(value = "/checkperfectnumber/{number}", method = RequestMethod.GET)
    public ResponseEntity<String> checkPerfectNumber(@PathVariable("number") Long number) {
        boolean isPerfectNumber=perefctNumberService.isPerfect(number);
        return new ResponseEntity<>("Perfect Number "+isPerfectNumber, HttpStatus.OK);
    }

    @ApiOperation(value = "check all the perfect numbers between a range", response = ResponseEntity.class)
    @RequestMapping(value = "/checkperfectnumber", method = RequestMethod.GET)
    public ResponseEntity<String> checkPerfectNoBetween(@RequestParam("firstNumber") Long firstnumber,@RequestParam("secondNumber") Long secondnumber) {
        List allPerfectNumbers=perefctNumberService.rangeOfPerfectNumber(firstnumber,secondnumber);
        return new ResponseEntity<>("Perfect Numbers are "+allPerfectNumbers, HttpStatus.OK);
    }

}
