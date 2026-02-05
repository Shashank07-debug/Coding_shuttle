package com.example.cakeBaker;

import org.springframework.stereotype.Component;

@Component("Chocolate Forsting")
public class ChocolateForsting implements Forsting{
    public String getForstingType(){
        return "Chocolate Forsting";
    }
}
