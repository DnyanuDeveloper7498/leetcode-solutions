class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

       for(int i=0;i<nums1.length;i++)
       {
            int j=0;

            while(nums2[j]!=nums1[i])
            {
                j++;
            }
             
            j++;

         while(j<nums2.length && nums2[j]<=nums1[i])
         {
            j++;
         }

         if(j<nums2.length)
         {
            nums1[i]=nums2[j];
         }
         else
         {
            nums1[i]=-1;
         }

       }
     return nums1;

    }

}