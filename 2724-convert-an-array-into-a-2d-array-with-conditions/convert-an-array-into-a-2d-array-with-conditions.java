class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] newArr = new int[nums.length+1];

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList());

        for(int i = 0; i < nums.length; i++){
            if(list.size() <= newArr[nums[i]]){
                list.add(new ArrayList());
            }
            list.get(newArr[nums[i]]).add(nums[i]);
            newArr[nums[i]]++;
        }
        return list;
    }
}