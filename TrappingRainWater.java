class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        if(n<=2)return 0;
        long res=0;
        int lmax[]=new int[n];
        lmax[0]=arr[0];
        for(int i=1;i<n;i++){
            lmax[i]=Math.max(arr[i],lmax[i-1]);
        }
        int rmax[]=new int[n];
        rmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i]=Math.max(arr[i],rmax[i+1]);
        }
        for(int i=1;i<n-1;i++){
            res+=Math.min(rmax[i],lmax[i])-arr[i];
            
            
        }
        return res;
       
    } 
}

