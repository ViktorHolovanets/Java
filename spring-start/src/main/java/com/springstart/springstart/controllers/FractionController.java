package com.springstart.springstart.controllers;

import com.springstart.springstart.models.Fraction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class FractionController {

    @PostMapping("/add")
    public ResponseEntity<Fraction> addFractions(@RequestBody List<Fraction> fractionList) {

        var t=fractionList.get(0).add(fractionList.get(1)).Reduce();
        return new ResponseEntity<>(t, HttpStatus.OK);
    }
    @PostMapping("/subtract")
    public ResponseEntity<Fraction> subtractFractions(@RequestBody List<Fraction> fractionList) {

        var t=fractionList.get(0).subtract(fractionList.get(1)).Reduce();
        return new ResponseEntity<>(t, HttpStatus.OK);
    }
    @PostMapping("/multiply")
    public ResponseEntity<Fraction> multiplyFractions(@RequestBody List<Fraction> fractionList) {

        var t=fractionList.get(0).multiply(fractionList.get(1)).Reduce();
        return new ResponseEntity<>(t, HttpStatus.OK);
    }
    @PostMapping("/divide")
    public ResponseEntity<Fraction> divideFractions(@RequestBody List<Fraction> fractionList) {

        var t=fractionList.get(0).divide(fractionList.get(1)).Reduce();
        return new ResponseEntity<>(t, HttpStatus.OK);
    }

}
