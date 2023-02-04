class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total=nums1.length+nums2.length;
        int[] merged=new int[total];
        int i=0;
        int j=0;
        int k=0;
        double result=0.0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]>nums2[j])
            {
                merged[k]=nums2[j];
                j++;
            }
            else 
            {
                merged[k]=nums1[i];
                i++;
            }
           
            k++;
        }
        while(i<nums1.length)
        {
            merged[k]=nums1[i];
            i++;
            k++;
        }
        while(j<nums2.length)
        {
            merged[k]=nums2[j];
            j++;
            k++;
        }
        if(total%2==0)
        {
           result=((merged[total/2]+merged[total/2-1])/2.0);
        }
        else
        {
            result=merged[total/2];
        }
        return result;
        
    }
}