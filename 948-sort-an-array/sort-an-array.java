class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
        
    }
    public void mergesort(int[] arr,int low,int high)
    {
        if(low==high) return;
        int mid=(low+high)/2;

        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
    public void merge(int[] arr,int low,int mid,int high)
    {
        int[] b=new int[high-low+1];
        int index=0;
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                b[index++]=arr[left++];
            }
            else
            {
                b[index++]=arr[right++];
            }
        }
        while(left<=mid)
        {
            b[index++]=arr[left++];
        }
        while(right<=high)
        {
            b[index++]=arr[right++];
        }
        for(int j=low;j<=high;j++)
        {
            arr[j]=b[j-low];
        }
    }
}