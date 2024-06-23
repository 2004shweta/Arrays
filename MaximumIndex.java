
class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int arr[], int n) { 
         
         if(n<=1) return 0;
        
       int lmin []=new int[n];
        lmin[0]=arr[0];
       for(int i=1;i<n;i++){
           lmin[i]=Math.min(arr[i],lmin[i-1]);
           
       }
       int rmax[]=new int[n];
       rmax[n-1]=arr[n-1];
       for(int j=n-2; j>=0;j--){
           rmax[j]=Math.max(arr[j],rmax[j+1]);
       }
       int i=0,j=0,maxdiff=-1;
       while(i<n && j<n){
           if(lmin[i]<=rmax[j]){
               maxdiff=Math.max(maxdiff,j-i);
               j++;
           }else{
               i++;
           }
       }
       return maxdiff;
    }
}
