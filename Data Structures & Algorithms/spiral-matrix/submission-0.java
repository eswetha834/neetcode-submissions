class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       /*    collow  colup
                   0 1 2    
rowlow       0    [1,2,3],
             1    [4,5,6]
 rowup       2    [7,8,9]]*/
 int rowlow=0;
 int collow=0;
 int rowup=matrix.length-1;
 List<Integer> lst=new ArrayList<>();
 int colup=matrix[0].length-1;
 while(rowlow<=rowup && collow<=colup){
 for(int i=collow;i<=colup;i++){
    lst.add(matrix[rowlow][i]);
 }
 rowlow++;
 for(int i=rowlow;i<=rowup;i++){
    lst.add(matrix[i][colup]);
 }
 colup--;
 if(colup<collow || rowup<rowlow){
    break;
 }
 for(int i=colup;i>=collow;i--){
    lst.add(matrix[rowup][i]);
 }
 rowup--;
 for(int i=rowup;i>=rowlow;i--){
    lst.add(matrix[i][collow]);
 }
 collow++;
    }
    return lst;
}
}