## 剑指offer

### 1、二维数组的查找问题：
    在一个二维数组中，每一行都按照从左往右递增，每一列都按照从上往下递增。请完成这样一个函数，使得输入这样一个矩阵和一个整数，判断数组中是否包含这个整数。
代码如下：

     public static boolean findFixedNumber(int matrix[][], int number){
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
          }

### 2、字符串空格替换问题以及合并两个数组的问题：先确定新字符串的长度，从而从后往前替换，保证每个字符值移动复制一次。提高效率

### 3、旋转数组的最小值问题：
    将一个有序数组的前面若干元素移动到数组的末尾，这样的数组称之为一个旋转数组，给定一个这样的旋转数组，查找其最小值。
    思路：使用二分查找法确定最小值位于旋转数组的那一段
代码如下：





