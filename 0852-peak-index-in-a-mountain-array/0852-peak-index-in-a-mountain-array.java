class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=1;
        int hi=arr.length-1;
        while(l<=hi) {
            int mid=(hi-l)/2+l;
            
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
                return mid;
            }
            else if(arr[mid]<arr[mid+1]) {
                l=mid+1;
            }
            else {
                hi=mid-1;
            }
        }
        return -1;
        
    }
}