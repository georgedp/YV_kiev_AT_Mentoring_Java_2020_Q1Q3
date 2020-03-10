public class HW_M02_07 {
//    7. By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in
//    ascending/descending
//      {206,430,73,30,293,322,42,36,447,229}
public static void main(String[] args) {
            int a[] = {206,430,73,30,293,322,42,36,447,229};

            for(int j = 0; j<a.length; j++)
            {
                //initially swapped is false
                boolean swapped = false;
                int i = 0;
                while(i<a.length-1)
                {
                    //comparing the adjacent elements
                    if (a[i] > a[i+1])
                    {
                        //swapping
                        int temp = a[i];
                        a[i] = a[i+1];
                        a[i+1] = temp;
                        //Changing the value of swapped
                        swapped = true;
                    }
                    i++;
                }
                //if swapped is false then the array is sorted. we can stop the loop
                if (!swapped)
                    break;
            }

            for(int x : a)
            {
                System.out.println(x);
            }

        }

}
