import java.util.Arrays;
public class Tester{
  public static void main(String[] args) {
    int[] myNums = {0, 20, 3 , 1, 2};
    int[] blank = {};
    int[][] twodee = { {0, 1, 3, 4},  {1, 2, 1, 2, 1} , {3, 4, 5, 6}};

    System.out.println(ArrayOps.sum(myNums));
    System.out.println(ArrayOps.sum(blank));
    System.out.println(ArrayOps.largest(myNums));
    System.out.println(Arrays.toString(ArrayOps.sumRows(twodee)).replace("], ","],\n"));
    System.out.println(Arrays.toString(ArrayOps.largestInRows(twodee)).replace("], ","],\n"));

  }

}
