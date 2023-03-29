

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long maxSum=0;
        int endIn=0, currMax=arr[0], gblMax=arr[0];
        for(int i=1; i<n; i++) {
            currMax=Math.max(arr[i], arr[i]+currMax);
            if(currMax > gblMax) {
                gblMax=currMax;
                endIn = i;
            }
        }
        
        int startIn = endIn;
        while(startIn >= 0) {
            gblMax -= arr[startIn];
            if(gblMax == 0) {
                break;
            }
            startIn--;
            
        }
        
        for(int i=startIn;i<=endIn;i++) {
           maxSum+=arr[i];
        }
        
        return maxSum;
        
        
    }
    
}