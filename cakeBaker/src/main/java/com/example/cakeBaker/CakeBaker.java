package com.example.cakeBaker;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    private final Forsting forsting;
    private final Syrup syrup;
    public CakeBaker(@Qualifier("Strawberry Forsting")Forsting forsting, @Qualifier("Strawberry Syrup")Syrup syrup){
        this.forsting = forsting;
        this.syrup = syrup;
    }
    public void bakeCake(){
        System.out.println("Cake is made with :");
        System.out.println(forsting.getForstingType());
        System.out.println(syrup.getSyrupType());
    }
}
