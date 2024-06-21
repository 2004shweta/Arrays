class Solution {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int totalSum=n*(n+1)/2;
        int arrsum=0;
        for(int i=0;i<n;i++){
            arrsum=nums[i]+arrsum;
        }
        return totalSum-arrsum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int nums[]=new int[n];
         for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
         }

         int missing=missingNumber(nums);
         System.out.println(missing);
    }
}
