package Practice;

import org.apache.commons.math3.stat.inference.OneWayAnova;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLearn {

    public static void main(String[] args) {
        int[] a= {2, 3,2,85};
        System.out.println(     task10array(a));
//        String[] a= new String[5]; //声明？
//        a[0]="hi";
//        a[1]="sfsdf";
//        a[2]="ttttt";
//        a[3]="mmmm";
//        a[4]="qqqq";
//
//        System.out.println(a.toString());
//        System.out.println(a);
//        System.out.println(Arrays.toString(a));


    }

    @Test
    void task2Array(){
        String[] a ={"red","yello","blue"};
        for(int i =0; i<a.length; i++){
            System.out.println(a[i]);
        }

        for(String x:a){
            System.out.println(x);
        }

    }

    @Test
    void task3Array(){
        String[] a ={"red","yello","blue"};

        System.out.println(Arrays.toString(a));
        a[0]="black my dear black";

        System.out.println(Arrays.toString(a));

    }

    @Test
    void task4Array(){
       double[] a= {2.5, 3.5,2.2,85.66};
       double count=0;

       for(double x:a){
           count+= x;
       }
        System.out.println(count);

    }

    @Test
    void task5Array() {
        double[] a = {2.5, 3.5, 2.2, 85.66};
        double  max= a[0];// 假设第一个最大

        for(double x :a){
            if( max<x){
                max=x;
            }


        }
        System.out.println(max);


    }

    @Test
    void task6Array() {
        double[] a = {2.5, 3.5, 2.2, 85.66};

        double[] b= new double[ a.length];

        for(double x: a){
            for(int i =a.length-1; i>=0; i--){
                b[i]=x;
            }
        }
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));



    }

    @Test
    void task67rray() {
        String[][] a ={{"shide","nijudene"},{"woyejude","xiaoguo"}};
        //System.out.println(Arrays.toString(a));

        //二维数组没法直接打印 通过这个arrays.toString 函数

        for( int i=0; i<a.length;i++){
            for(int j=0; j< a[0].length; j++){
                System.out.println(a[i][j]);
            }
        }

        for( String[] x: a){
            for(String sb: x){
                System.out.println(sb);
            }
        }

    }

    @Test
    void task8rray() {
        ArrayList<String> a = new ArrayList<>();
        a.add("hello");
        a.add("gun");
        System.out.println(a.toString());
        a.remove(1);
        System.out.println(a.toString());

    }

    @Test
    public static double task10array(int[] array) {

        double i=0;
        for(int x: array){
            i+=x;
        }
        return i/array.length ;


    }
}
