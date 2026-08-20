import java.util.*;

public class arraycc {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]+=1;
        }
    }
    public static void main(String args[]){
        // int marks[]=new int[100];
        // Scanner sc=new Scanner(System.in);
        // marks[0]=sc.nextInt();
        // marks[1]=sc.nextInt();
        // marks[2]=sc.nextInt();
        // System.out.println("phy : "+ marks[0]);
        // System.out.println("che : "+ marks[1]);
        // System.out.println("math : "+ marks[2]);
        // System.out.println(marks.length);
        // marks[2]+=2;
        // System.out.println(marks[2]);
        int marks[]={45,87,98};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }


    }


}
