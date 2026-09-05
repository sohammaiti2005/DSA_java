public class practice {
    public static void brut(int array[][],int key){
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
    public static void sum(int nums[][]){
        int row=1;
        int sum=0;
        for(int j=0;j<nums[0].length;j++){
            sum+=nums[row][j];
        }
        System.out.println(sum);
    }
    public static void Transof(int matrix[][]){
        int array[][]=new int[matrix[0].length][matrix.length];
        int row=matrix[0].length;
        int col=matrix.length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array[i][j]=matrix[j][i];
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        //Print the number of 7’s that are inthe 2d array.Example :
        // int[][] array = { {4,7,8},
        //                   {8,8,7} };
        // int key=7; 
        // brut(array, key);  `
        //Print out the sum of the numbers inthe second row of the “nums” array.Example :Input - 
        // int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        // sum(nums);
        // Write a program to FindTransposeofa Matrix.What is Transpose?Transpose of a matrix is the process 
        // ofswapping therows to columns. For a 2x3 matrix.
         int Matrix[][]= {{11,12,13},
                          {21,22,23}};
        Transof(Matrix);        
                     
    }
    
}
