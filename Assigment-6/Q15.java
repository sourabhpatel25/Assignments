// Q.15
// Sub with equal 0s and 1s
// Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s. 
// Example 1:
// Input:
// n = 7
// A[] = {1,0,0,1,0,1,1}
// Output: 8
// Explanation: The index range for the 8 
// sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), 
// (4, 5) ,(2, 5), (0, 5), (1, 6)
// Example 2:
// Input:
// n = 5
// A[] = {1,1,1,1,0}
// Output: 1
// Explanation: The index range for the 
// subarray is (3,4).
class Test{
    public static void main(String args[])
    {
        int[] arr={1,0,0,1,0,1,1};
        int count=0;
    for(int i=0;i<arr.length;i++)
    {
        int onecount,zerocount;
        onecount=0;
        zerocount=0;
        
        if(arr[i]==1)
        {
            onecount++;
        }
        else
        zerocount++;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]==1)
        {
            onecount++;
        }
        else
        zerocount++;

        if(onecount==zerocount)
        {
            count++;
        }
        }

    }
    System.out.print(count);

  }
}