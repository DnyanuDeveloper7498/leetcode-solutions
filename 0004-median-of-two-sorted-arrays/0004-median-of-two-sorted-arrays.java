class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m=nums1.length;
        int n=nums2.length;
        int curr=0,prev=0;
        int i=0,j=0;

        int total=m+n;
        int mid=total/2;

        for(int k=0;k<=mid;k++)
        {
           prev=curr;
         
          if(i<m&&(j>=n||nums1[i]<=nums2[j]))
          {
            curr=nums1[i++];
          }else
          {
             curr=nums2[j++];
          }
        }

        return (total%2==1)?curr:(prev+curr)/2.0;
    }
}