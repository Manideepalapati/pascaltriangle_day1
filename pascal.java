import java.util.ArrayList;
import java.util.Scanner;


class pascal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();

        printpascal(r);
        sc.close();
    }
    public static void printpascal(int n){
        ArrayList<Integer> present=new ArrayList<Integer>(); 
        ArrayList<Integer> prev=new ArrayList<Integer>(); 
        prev.add(1);
        //prev.add(1);
        if(n==1){
            System.out.println(1);
            return;
        }
        else{
            System.out.println(1);
            for(int i=1;i<n;i++){
                present.add(1);
                for(int j=0;j<i-1;j++){
                    present.add(prev.get(j)+prev.get(j+1));
                }
                present.add(1);
                for(int num:present){
                    System.out.print(num+" ");
                }
                System.out.println();
                prev.clear();
                prev.addAll(present);
                present.clear();
            }
        }
        return;
    }
}
