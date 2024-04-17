package com.example.beerselect.provider;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getAllTypesBeer(String beer){

        List<String> brands = new ArrayList<>();

         if(beer.equals("amber")){
             brands.add("Jack Amber");
             brands.add("Red Mouse");
         } else if(beer.equals("light")){
             brands.add("Jail Pale Ale");
             brands.add("Gout Stout");
         } else if (beer.equals("dark")){
             brands.add("Porter");
             brands.add("Cream Stout");
             brands.add("Bock");
         } else {
             brands.add("Brown Ale");
         }

         return brands;

    }


}
