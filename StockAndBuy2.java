
class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        int i=0;
        while(i<n-1){
            while(i<n-1 && A[i+1]<=A[i]){//finding the local minima
            i++;
        }
        if(i==n-1){
            break;
        }
        int buy=i++;
        while(i<n && A[i]>=A[i-1]){//find the local maxima;
            i++;
        }
        int sell=i-1;
        ArrayList<Integer> buys=new ArrayList<>();
        buys.add(buy);
        buys.add(sell);
        result.add(buys);
   
    }
    return result;
    }
