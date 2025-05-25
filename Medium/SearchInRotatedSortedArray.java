// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
class Solution {
    public int search(int[] A, int B) {
        int low = 0;
        int high = A.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(A[mid] == B){
                return mid;
            }else if(A[mid]>=A[low]){
                if(A[low]<=B && A[mid]>B){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(A[high]>=B && A[mid]<B){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}