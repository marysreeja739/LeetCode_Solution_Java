class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1) return nums.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums) set.add(i);
        int res=1;
        for(int i:set){
            int temp=1;
            if(!set.contains(i-1)){
                int j=i;
                while(set.contains(j+1)){
                    j+=1;
                    temp++;
                }
            }
            res=Math.max(res,temp);
        }
        return res;
    }
}
