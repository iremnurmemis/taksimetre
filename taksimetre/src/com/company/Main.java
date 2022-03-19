package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  int acilis_ucreti=10,gidilen_km;
      double kmbasi=2.20,total;
      Scanner inp=new Scanner(System.in);

      System.out.print("gidilen km:");
      gidilen_km= inp.nextInt();

      total=kmbasi*gidilen_km;

      total=(total<20)?20:total;

      System.out.print("ödenen ücret"+total);


    }
}
