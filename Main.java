package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayDS arrayDS = new ArrayDS(5);
        arrayDS.insert(0);
        arrayDS.insert(23);
        arrayDS.insert(200);
        arrayDS.insert(30);
        arrayDS.insert(13);

        arrayDS.prime();
        //arrayDS.print();
        //arrayDS.swap(3,1);
        //arrayDS.replace(3,7);
        //arrayDS.minimum(arrayDS.items);
        //arrayDS.odd();
        //arrayDS.even();
        //arrayDS.average();
        //arrayDS.product();
        //arrayDS.maximum(arrayDS.items);
        //arrayDS.indexOf();
        //arrayDS.capacity();
        //arrayDS.printRev();

        /*
        System.out.print("Which index would you like to delete: ");
        int position = input.nextInt();
        arrayDS.delete(position);
        arrayDS.print();*/

        /*
        System.out.print("What number are you looking for: ");
        int target = input.nextInt();
        arrayDS.find(target);
        */

    }
}
