## 剑指offer

* 二维数组的查找问题：
    ` 在一个二维数组中，每一行都按照从左往右递增，每一列都按照从上往下递增。
    请完成这样一个函数，使得输入这样一个矩阵和一个整数，判断数组中是否包含这个整数。`
    代码如下：

    ` public static boolean findFixedNumber(int matrix[][], int number){
              boolean found = false;
              if (matrix != null){
                  int rows = matrix.length;
                  int colums = matrix[0].length;
                  int row = 0;
                  int colum = colums - 1;
                  while (row < rows && colum >= 0){
                      if (matrix[row][colum] == number){
                          found = true;
                          break;
                      }else if(matrix[row][colum] < number){
                          row++;
                      }else{
                          colum --;
                      }
                  }
              }
              return found;
          }`