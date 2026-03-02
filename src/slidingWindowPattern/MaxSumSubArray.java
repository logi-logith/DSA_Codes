package slidingWindowPattern;

public class MaxSumSubArray {
    public static int maxSum(int[] arr,int k){
        int n=arr.length;
        int sum=0;
        int maxSum=0;

        if(n<k){
            return -1;
        }
        for(int i=0;i<k;i++){ //Calculate the First window
            sum+=arr[i];
        }
        maxSum=sum;

        for (int r=k;r<n;r++){ //Sliding the window
            sum+=arr[r]; //add a new element
            sum-=arr[r-k]; //removes a prev element
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr={2,4,1,3,5,8};
        int k=3; //size of a subarray window
        System.out.println("Maximum Array:"+maxSum(arr,k));
    }
}
