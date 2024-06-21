class Solution {
    public static  int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int curr=0;
        int res=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                curr=0;
            }else{
                curr++;
                res=Math.max(res,curr);
            }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();

        }
        findMaxConsecutiveOnes(nums);

    }
}
