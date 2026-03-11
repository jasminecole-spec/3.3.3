/*
 * Activity 3.3.3
*/
public class Numbers2D
{
  public static void main(String[] args)
  {
    int[][] numbers = { {1,5,3,8,-3,0,3},
                      {4,4,8,0,3,-1,1}, 
                      {0,3,8,4,-2,7, 6} };

    //SUM
    int sum = 0;
    for (int[] arr : numbers)
    {
      for (int index : arr)
      {
        sum += index;
      }
    }
    System.out.println(sum);

    //AVERAGE
    int count = 0;
    double average = 0.0;
    double sum2 = 0.0;
    for (int arr[] : numbers)
    {
    for (int index : arr)
      {
      sum2 += index;
      count++;
      }
    }
    average = (double)sum2/count;
    System.out.println(average);
  }
}
