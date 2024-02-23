/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Chhom Vannak
 */
public class C4 {
    public static void main(String[] args) {
        ArrayList<Float> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int n = 0, i, op = 0;
        float num = 0;
        do {
            System.out.println("=================Menu===================");
            System.out.println("\t1.Input");
            System.out.println("\t2.Output");
            System.out.println("\t3.Search");
            System.out.println("\t4.Remove");
            System.out.println("\t5.Sort");
            System.out.println("\t6.Update");
            System.out.println("========================================");
            System.out.println("Please Choose One = ");
            op = input.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Input N = ");
                    n = input.nextInt();
                    for (i = 0; i < n; i++) {
                        System.out.println("Input number of array list = ");
                        num = input.nextFloat();
                        list.add(num);
                    }
                }
                break;
                case 2: {
                    System.out.println("Number = " + list);
                }
                break;
                case 3: {
                    System.out.print("Enter for seach: ");
                    float s = input.nextFloat();
                    System.out.println("find number = " + list.contains(s));
                }
                break;
                case 4: {
                    System.out.println("Input Number = ");
                    num = input.nextFloat();
                    list.remove(num);
                }
                break;
                case 5: {
                    Collections.sort(list);
                    System.out.println("Sort = " + list);
                }
                break;
                case 6: {
                    System.out.println("Please Input The value for update: ");
                    int sdata = input.nextInt();
                    for (i = 0; i < list.size(); i++) {
                        if (sdata == list.get(i)) {
                            System.out.println("Please Input new value: ");
                            float ndata = input.nextFloat();
                            list.set(i, ndata);
                        }
                    }
                }
                break;
            }
        } while (op != 0);
    }
}