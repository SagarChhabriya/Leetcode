class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        //Each element will be taken and compared to all other elements
        for(int i=0; i<nums.length; i++)
            for(int j=i+1; j<nums.length; j++)
                if(nums[i]+nums[j]==target)
                    return new int[]{i,j};        //if the sum of elements on indices i and j = target then return those indices
   	 return new int[]{};  //otherwise return an new empty array
    }
}
