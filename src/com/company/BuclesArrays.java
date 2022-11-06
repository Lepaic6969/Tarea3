package com.company;

public class BuclesArrays {
    public static void main(String[] args) {
        String[] nombres={"Juan Camilo","Laura Clarivel","Martha Lucía","Servio Túlio","Myriam Zamora"};
        String usuarios="";

        for(int i=0;i<nombres.length;i++){
            //Condicional para que último usuario termine en punto y no en coma...
            if(i==nombres.length-1){
                usuarios+=nombres[i]+".";
            }else{
                usuarios+=nombres[i]+", ";
            }

        }

        System.out.println("Los usuarios registrados son: "+usuarios);
    }
}
