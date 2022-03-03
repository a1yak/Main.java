package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Задача 1
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Задача 1\n Введите значения 3 сторон:\na: ");
        a=sc.nextInt();
        System.out.println("b: ");
        b= sc.nextInt();;
        System.out.println("c: ");
        c=sc.nextInt();
        if (a+b<c||a+c<b||b+c<a)System.out.println("Такого треугольика не может быть");
        else System.out.println("Существующий треугольник");
        //Задача 2
        if (a>0)
            a+=1;
        else if(a==0)
            a=10;
        else a-=2;
        System.out.println("\nЗадача 2\na= "+a);
        //Задача 3
        int programmer;
        System.out.println("\nЗадача 3\nПрограммист(..)\n");
        programmer= sc.nextInt();
        switch (programmer) {
            case 1:
                System.out.println("1 программист");
break;
            case 2:
            case 3:

            case 4:
                System.out.println("2-4 программистА");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("5-10 программистОВ");
                break;
            default: System.out.println("error");
        }  //Задача 4
            int[] even = new int[10];
         int count =2;
         System.out.println("\nЗадача 4\n");
            for(int i=0;i<=9;i++)
            {
                even[i]=count;
                count+=2;
                System.out.print(even[i]+" ");
            }
            System.out.println("\n");
            for(int j=0;j<10;j++)
            {
                System.out.println(even[j]);
            }
//Задача 5
        int[] array=new int[15];
            int min=0;
            int max=99;
            int difference = max-min;
            int counteven = 0;
            System.out.println("Задача 5\n");
for(int i=0;i<15;i++)
{
    Random rd = new Random();
    array[i]= rd.nextInt(difference+1)+min;
    if(array[i]%2==0)
        counteven++;
    System.out.print(array[i]+" ");
}
System.out.println("\nКоличество четных элементов: "+counteven);
//Задача 6
        max=15;
        difference=max-min;
        array[0]=max;
        System.out.println("\nЗадача 6\n");
        int maxValue=0, index =0;
        for(int i=0;i<12;i++)
        {
            Random rd = new Random();
            array[i]= rd.nextInt(difference+1)+min;

            if(array[i]>=maxValue)
            {
                maxValue = array[i];
                index = i;
            }
            System.out.print(array[i]+" ");
        }
        System.out.println("Максимальное значение в массиве "+maxValue+" находится в массиве под индексом "+index);
    }
}
