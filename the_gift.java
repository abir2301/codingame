import java.util.*;
import java.io.*;
import java.math.*;


class Solution {
    public static  int sumArray(ArrayList<Integer> array) {
        int  sum = 0;
        for (int i = 0; i < array.size(); i++)
            sum += array.get(i);
        return sum;
       
    }
    
    public static int notNul(ArrayList<Integer> array) {
        int i = 0; 
        for (int element : array) {
            if (element != 0){
                i++;
            }
        }
        return  i ;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int C = in.nextInt();
        int total = C ;
        ArrayList<Integer> budgets = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int B = in.nextInt();
            budgets.add(B);

        }
        if (sumArray(budgets) < C) {
            System.out.println("IMPOSSIBLE");
        }
        else {
        ArrayList<Integer> budgetscp = budgets;
         Collections.sort(budgetscp);
        ArrayList<Integer> paiments = new ArrayList<Integer>(0);
         for (int  i = 0 ; i<  budgetscp.size()-1 ; i++) {
            double  avg = C/notNul(budgetscp);
            if (budgetscp.get(i) < avg) {
                paiments.add(budgetscp.get(i));
                C-= budgetscp.get(i);
            }
            else {
                paiments.add( (int)(avg));
                 C-= (int)(avg);

            }
            budgetscp.set(i,0);
            
         }
         paiments.add (total - sumArray(paiments) );
         for (int paiment : paiments  ){
            System.out.println(paiment);
         }
        }


        
    }
}