package com.company;
import java.util.Scanner;

class ArrayDS {
    public int[] items;
    private int count;
    Scanner input = new Scanner(System.in);

    public ArrayDS(int length) {
        this.items = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public void printRev() {
        for (int i = count - 1; i >= 0; i--) {
            System.out.println(items[i]);
        }
    }

    public void insert(int item) {
        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void delete(int position) {
        items[position] = 0;
    }

    public void find(int target) {
        int found = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == target) {
                found = 1;
                System.out.println("Target is in index: " + i);
            }
        }
        if (found == 0) {
            System.out.println("-1");
        }
    }

    public void capacity() {
        System.out.println(items.length);
    }

    public void indexOf() {
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        for (int i = 0; i <= items.length; i++) {
            if (items[i] == number) {
                System.out.println("Number found at " + i);
            } else {
                System.out.println("Invalid number");
            }
        }
    }


    public void maximum(int[] items) {
        int max = 0;
        for (int i = 0; i < count; i++) {
            if (items[i] > max) {
                max = items[i];
            }
        }
        System.out.print(max);
    }

    public void minimum(int[] items) {
        int min = items[0];
        for (int i = 0; i < count; i++) {
            if (items[i] < min) {
                min = items[i];
            }
        }
        System.out.print(min);
    }

    public void product() {
        int multiply = 1;
        for (int i = 0; i < count; i++) {
            multiply = multiply * items[i];
        }
        System.out.println(multiply);
    }

    public void average() {
        int avg = 0;
        int total = 0;
        for (int i = 0; i < count; i++) {
            total = total + items[i];
        }
        avg = total / count;
        System.out.println(avg);
    }

    public void even() {
        System.out.println("Even:");
        for (int i = 0; i < count; i++) {
            if (items[i] % 2 == 0) {
                System.out.println(items[i]);
            }
        }
    }

    public void odd() {
        System.out.println("Odd:");
        for (int i = 0; i < count; i++) {
            if (items[i] % 2 != 0) {
                System.out.println(items[i]);
            }
        }
    }

    public void replace(int index, int num) {
        if (index >= 0 && index < count) {
            items[index] = num;
        } else {
            System.out.println("Invalid index");
        }
    }

    public void swap(int index1, int index2) {
        int temp = index1;
        items[index1] = items[index2];
        items[index2] = temp;

    }

    public void prime() {
        System.out.println("Prime numbers: ");
        for (int i = 0; i < count; i++) {
            if (items[i] > 3 && items[i]>=0) {
                if (items[i] % 2 != 0 && items[i] % 3 != 0) {

                    System.out.println(items[i]);
                }
            } else
                System.out.println(items[i]);
        }
    }
}


