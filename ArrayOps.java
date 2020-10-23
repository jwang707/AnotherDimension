public class ArrayOps {
  public static int sum(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      count += arr[i];
    }

    return count;
  }


  public static void main(String[] args) {
    int[] myNums = {0, 20, 3 , 1, 2};

    System.out.println(sum(myNums));
  }







}
