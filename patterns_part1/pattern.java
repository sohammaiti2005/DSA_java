public class pattern {
    public static void main(String args[]){
        // int n=4
        // for(int line=1;line<=n;line++){
        //     for(int star=1;star<=n-line+1;star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        int n=4;
        // for(int line=1;line<=4;line++){
        //     for(int num=1;num<=line;num++){
        //         System.out.print(num);
        //     }
        //     System.out.println();
        // }
        char ch='A';
        for(int L=1;L<=n;L++){
            for(int chars=1;chars<=L;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    
    }
    
}
