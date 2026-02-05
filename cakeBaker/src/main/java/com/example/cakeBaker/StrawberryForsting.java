package com.example.cakeBaker;

import org.springframework.stereotype.Component;

@Component("Strawberry Forsting")
public class StrawberryForsting implements Forsting{
    public String getForstingType(){
        return "Strawberry Forsting";
    }
}
