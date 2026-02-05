package com.example.cakeBaker;

import org.springframework.stereotype.Component;

@Component("Chocolate Syrup")
public class ChocolateSyrup implements Syrup{
    public String getSyrupType(){
        return "Chocolate Syrup";
    }
}
