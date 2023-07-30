import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Integer> array= new ArrayList();
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
                    //    System.out.println(pi);

            array.add(pi);
        }
        if (array.size()==0){
            System.out.println("0");
        }
        else{
            if (array.size()==1){
            System.out.println(array.get(0));
        }
        else {
             if (array.size()==2){
            System.out.println(Math.abs(array.get(0) - array.get(1)));
        }
        else {
        
        Collections.sort(array);
        int  diff = Integer.MAX_VALUE; 
        for (int i = 0; i < array.size()-1; i++) {
            int d = array.get(i+1) - array.get(i);
            diff = Math.min(d,diff) ; 
            
        }


      
        System.out.println(diff);
    }}}}
}