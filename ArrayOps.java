import java.util.Arrays;
public class ArrayOps {
  public static int sum(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      count += arr[i];
    }
    return count;
  }

  public static int largest(int[] arr) {
    int result = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > result) {
        result = arr[i];
      }
    }
    return result;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] result = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
        result[i] += sum(matrix[i]);
  }
    return result;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] result = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
        result[i] += largest(matrix[i]);
  }
    return result;
  }

  public static int sum(int[][] matrix) {
    int result = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j <= matrix.length; j++)
        result += matrix[i][j];
  }
    return result;
  }

  public static int[] sumCols(int[][] matrix) {
    int[] result = new int[matrix[0].length];
    int cols = matrix[0].length;
    int rows = matrix.length;
    int tempsum = 0;

    for (int i = 0; i < cols; i++) {
      for (int j = 0; j < rows; j++) {
        tempsum += matrix[j][i];
      }
      result[i] = tempsum;
      tempsum = 0;
    }

    return result;
  }

  public static boolean isRowMagic(int[][] matrix) {
    int comparer = sum(matrix[0]);

    for (int i = 0; i < matrix.length; i++) {
      if (sum(matrix[i]) != comparer) {
        return false;
      }
    }
    return true;
  }

  public static boolean isColMagic(int[][] matrix) {
    int[] comparer = sumCols(matrix);
    int colsum = comparer[0];

    for (int i = 0; i < comparer.length; i++) {
      if (colsum != comparer[i]) {
        return false;
      }
    }
    return true;
  }

}
