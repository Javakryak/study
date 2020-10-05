package com.company;

import java.util.Scanner;

public class X {
    public int x;

    public X(){
        System.out.println("New X instance created; Enter your value");
        Scanner x = new Scanner(System.in);
        this.x = x.nextInt();
    }


    public void X(){

        for (int x = 1; x < 13; x++){
            System.out.println(this.x + " times " + x + " equals " + this.x*x);
        }
    }


}
