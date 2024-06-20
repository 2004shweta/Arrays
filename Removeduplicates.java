class Solution {
    public static int removeDuplicates(int[] nums) {
        // int n=nums.length;
        // int res=1;
        // if(n==0)return 0;
        // for(int i=1;i<n;i++){
        //     if(nums[res-1]!=nums[i])
        //     nums[res]=nums[i];
        //     res++;
        // }
        // return res;
         if (nums.length == 0) return 0;
        
        int uniqueIndex = 0;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        
        return uniqueIndex + 1;

        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=removeDuplicates(nums);
        for(int i=0;i<k;i++){
            System.out.println(nums[i]+" ");
        }

    }
}
