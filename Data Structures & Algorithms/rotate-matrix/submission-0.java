class Solution {
    public void rotate(int[][] matrix) {
       int arr[][]=new int[matrix.length][matrix[0].length];
       int a=0,b=0;
       for(int i=0;i<matrix.length;i++){
        b=0;
        for(int j=matrix[0].length-1;j>=0;j--){
            arr[a][b++]=matrix[j][i];
        }
        a++;
       } 
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            matrix[i][j]=arr[i][j];
        }
       }
    }
}
