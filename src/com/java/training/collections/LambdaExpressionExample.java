package com.java.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

class Product{

    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class LambdaExpressionExample {

    public static void main(String[] args) {

        ArrayList<Product> productList = new ArrayList<>();

        Product p1 = new Product(1,"Samsung A5",17000f);
        productList.add(p1);

        Product p2 = new Product(3,"Iphone 6S",65000f);
        productList.add(p2);

        Product p3= new Product(2,"Sony Xperia",25000f);
        productList.add(p3);

        Product p4= new Product(4,"Nokia Lumia",15000f);
        productList.add(p4);

        Product p5 = new Product(5,"Redmi4 ",26000f);
        productList.add(p5);

        Product p6 = new Product(6,"Lenevo Vibe",19000f);
        productList.add(p6);

        List<Product> newList = new ArrayList<>();

        for(Product product: productList){
            if(product.price > 20000) {
             newList.add(product);
            }
        }

        for(Product px : newList) {
            System.out.println(px.name);
        }

        Iterator<Product> it  = productList.iterator();
        while(it.hasNext()){
            Product p = it.next();
            System.out.println("Id: "+ p.id + ", name: + "+ p.name + ", price: " + p.price);
        }

       // using lambda to filter data
        Stream<Product> filtered_data = productList.stream().filter(x -> x.price > 20000);

        // using lambda to iterate through collection
        filtered_data.forEach(
                product -> System.out.println(product.name+": "+product.price)
        );













/*
        List<Float> productPriceList2 =list.stream()
                .filter(p -> p.price > 30000)// filtering data
                .map(p->p.price)        // fetching price
                .collect(Collectors.toList()); // collecting as list
        System.out.println(productPriceList2);
*/

    }
}