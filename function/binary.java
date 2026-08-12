public class binary {
    public static void bintodec(int n){
       int num=n;
        int deci=0;
        int pow=0;
        while(n>0){
            int lastdigit=n%10;
            deci=deci+lastdigit*(int)Math.pow(2,pow);
            n/=10;
            pow++;
        }
        System.out.println("deci of "+num+" is "+deci);

    }
    public static void dectobin(int n){
        int b=n;
        int bin=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
            bin=bin+rem*(int)Math.pow(10,pow);
            n/=2;
            pow++; 
        }
        System.out.println("bin value of "+b+" is "+bin);

    }
    public static void main(String args[]){
        bintodec(101);
        dectobin(5);

    
    }
    
}
