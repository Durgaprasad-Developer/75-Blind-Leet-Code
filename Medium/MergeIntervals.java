// https://leetcode.com/problems/merge-intervals/description/
class Solution {
    public int[][] merge(int[][] A) {
        Arrays.sort(A,(a,b)->{
            if(a[0]>b[0]) return 1;
            if(a[0]<b[0]) return -1;
            if(a[1]>b[1]) return 1;
            if(a[1]<b[1]) return -1;
            return 0;
        });
        ArrayList<int[]> r = new ArrayList<>();
        for(int i=0;i<A.length;i++){
            int start = A[i][0];
            int end = A[i][1];
            if(r.size() != 0 && end<=r.get(r.size()-1)[1]) {
                continue;
            }
            for(int j=i+1;j<A.length;j++){
                if(end>=A[j][0]){
                    end = Math.max(end,A[j][1]);
                }else{
                    break;
                }
            }
            int[] arr = new int[2];
            arr[0] = start;
            arr[1] = end;
            r.add(arr);
        }
        
        int[][] result = new int[r.size()][2];
        for(int i=0;i<r.size();i++){
            result[i][0] = r.get(i)[0];
            result[i][1] = r.get(i)[1];
        }   
        return result;
    }
}