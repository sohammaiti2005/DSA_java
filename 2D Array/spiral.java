public class spiral {
    public static void spiralmat(int matrix[][]){
        int strow=0,endrow=matrix.length-1,stcol=0,endcol=matrix[0].length-1;
        while(strow<=endrow && stcol<=endcol){
            //top part
            for(int j=stcol;j<=endcol;j++){
                System.out.print(matrix[strow][j]);
            }
            //right part
             for(int i=strow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]);
            }
            //bottom part
             for(int j=endcol-1;j>=stcol;j--){
                if(strow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]);
            }
            //leftpart
             for(int i=endrow-1;i>=strow+1;i--){
                if(stcol==endcol){
                    break;
                }
                System.out.print(matrix[i][stcol]);
            }
            strow++;
            stcol++;
            endrow--;
            endcol--;

        }
        System.out.println();
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        spiralmat(matrix);                 

    }
}