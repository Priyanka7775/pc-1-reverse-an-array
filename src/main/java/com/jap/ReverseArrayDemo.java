package com.jap;

public class ReverseArrayDemo {

    public static void main(String[] args) {
        int[] array = {23,34,43,56,67,78,43,35};
        ReverseArrayDemo reverseArrayDemo= new ReverseArrayDemo();
        int [] reverseArray= reverseArrayDemo.getReverseArray(array);

    }


    //Write the logic to reverse the given array inside the below
    // method and return the reverse array.
    public int[] getReverseArray(int [] array){


        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+",");
        }

        return array;


    }
}
