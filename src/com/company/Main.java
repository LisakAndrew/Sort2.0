package com.company;

public class Main {

    public static void main(String[] args) {
        int mass[]={12,3,2,4,6,12,67,4,24,4,3,2,4,6,7};
        for (int i=mass.length-1; i>=2; i-- ){
            boolean sorted = true;
            for (int j =0; j<i; j++){
                if (mass[j] > mass[j+1]) {
                    int temp = mass[j];
                    mass[j] = mass[j+1];
                    mass[j+1] = temp;
                    sorted = false;
                }
            }
            if(sorted) {
                break;
            }
        }
        for(int j=0; j<=mass.length; j++){
            System.out.println(mass[j]);

        }
    }
}
