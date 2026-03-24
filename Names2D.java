/*
 * Activity 3.3.3
*/
public class Names2D
{
  public static void main(String[] args)
  {
    String[][] names = {{"Ari", "Avery", "Ash", "Aman"},
                        {"Brynn", "Bodie", "Bo", "Barrie"},
                        {"Cris", "Carter", "Cali", "Ari"}};
    
    System.out.print("Determine if there are duplicate names:");
    boolean isDup = false;
    for (String[] arr1 : names)
    {
      for (String n1 : arr1)
      {
        for (String[] arr2 : names)
        {
          for (String n2 : arr2)
          {
            if (n1 == n2)
            {
              isDup = true;
            }
          }
        }
      }
    }
    System.out.print(" " + isDup);
    
    System.out.println("\nAccess consecutive pairs of elements in each row:");
    for (int r = 0; r < names.length; r++)
    {
      for (int c = 0; c < names[0].length; c += 2)
      {
        String first = names[r][c];
        String second = names[r][c + 1];
        System.out.println(first + ", " + second);
      }
    }
    
    System.out.println("\nReverse the order of the elements in second column:");
    String temp = "";
    for (int row1 = 0; row1 < names.length; row1++)
    {
      for (int row2 = names.length - 1; row2 > 0; row2--)
      {
        names[row2][1] = temp;
        names[row2][1] = names[row1][1];
        names[row1][1] = temp;
      }
    }
    
    System.out.println("\nShift an element in a row: Shift the first name in the first row left to the last name in the row:");
   
   
    System.out.println("\nShift an element in a column: Shift the last name in the first row down to the last row:");
   
  }
}
