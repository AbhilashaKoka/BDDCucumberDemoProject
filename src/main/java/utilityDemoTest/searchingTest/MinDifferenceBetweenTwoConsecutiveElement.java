package utilityDemoTest.searchingTest;
public class MinDifferenceBetweenTwoConsecutiveElement {
  public static void main(String[] args)
        {
            int[] arr={13,5,7,10,1};
            for(int i=0;i<arr.length-1;i++)
            {
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length - 1; i++)
            {
                int diff = arr[i + 1] - arr[i];
                if (diff < minDiff)
                {
                    minDiff = diff;
                }
            }
            System.out.println("Minimum difference: " + minDiff);
        }
    }













