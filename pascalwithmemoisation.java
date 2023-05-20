import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class pascalwithmemoisation {
    private static HashMap<Integer,ArrayList<Integer>> cache=new HashMap<Integer,ArrayList<Integer>>();
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int r=sc.nextInt();
       printpascal(r);
       sc.close();

    }
    
    public static void printpascal(int num) {
        for(int i=1;i<=num;i++){
            for(int a:pascalrow(i)){
                System.out.print(a+" ");
            }
            System.out.println();
        }
        
    }
    public static  ArrayList<Integer> pascalrow(int n){
        ArrayList<Integer> present=new ArrayList<Integer>();
        ArrayList<Integer> prev=new ArrayList<Integer>();
        if(n==1){
            present.add(1);
            return present;
        }
        if(cache.containsKey(n)){
            return cache.get(n);

        }
        else{
            present.add(1);
            prev.addAll(pascalrow(n-1));
            for(int i=0;i<(prev.size()-1);i++){
                present.add(prev.get(i)+prev.get(i+1));
            }
            present.add(1);
            cache.put(n,present);
            return present; 
        }
    }


   
    
}
