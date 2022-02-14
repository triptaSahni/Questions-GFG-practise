// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Main {
    public static void main(String args[]) {
        // taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking total number of elements
            int n = sc.nextInt();

            // taking size of subArrays
            int k = sc.nextInt();

            // Declaring and Intializing an array of size n
            int arr[] = new int[n];

            // adding all the elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Calling the method max_of_subarrays of class solve
            // and storing the result in an ArrayList
            ArrayList<Integer> res = new Solution().max_of_subarrays(arr, n, k);

            // printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++)
                System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


class Solution {
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> al=new ArrayList<>();
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addLast(0);
        if(n==1)
        {
            al.add(arr[0]);
            return al;
        }
        if(k==1)
        {
        for(int i=0;i<n;i++)
        {
            al.add(arr[i]);
        }
        return al;
        }
        // 5 4 3 2 1
        for(int i=1;i<n;i++)
        {
            while(!dq.isEmpty() && arr[dq.getLast()]<=arr[i])
            dq.removeLast();
            
            dq.addLast(i);
            if(i-k==dq.getFirst())
            dq.removeFirst();
            if(i>=k-1)
            {
                al.add(arr[dq.getFirst()]);
            }
            
        }
        return al;
    }
}
