package com.example.cakeBaker;

import org.springframework.stereotype.Component;

@Component("Strawberry Syrup")
public class StrawberrySyrup implements Syrup{
    public String getSyrupType(){
        return "Strawberry Syrup";
    }
}