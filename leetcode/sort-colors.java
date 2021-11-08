
class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                Integer count = map.get(num);
                map.put(num,count+1);
            }else{
                map.put(num,1);
            }

        }
        int _0Count = getCount(0,map);
        int _1Count = getCount(1,map);
        int _2Count = getCount(2,map);
        int index=0;
        while(index<nums.length && _0Count>0){
            nums[index++]=0;
            _0Count--;
        }
        while(index<nums.length && _1Count>0){
            nums[index++]=1;
            _1Count--;
        }
        while(index<nums.length && _2Count>0){
            nums[index++]=2;
            _2Count--;
        }
    }
    
    private int getCount(int digit,Map<Integer,Integer> map){
        return map.containsKey(digit) ? map.get(digit) : 0;
    }
}
