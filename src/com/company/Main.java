package com.company;

public class Main {

    public static void main(String[] args) {



           for(int i=2; i<=100; i++ ){
               boolean control =true;
                        for(int j=2; j<i; j++){
                                    if(i % j ==0){
                                    control=false;
                                    break;
                                    }

                            }
                        if(control){
                        System.out.println(i);
                        }
               }


           }


        }


