class Solution {
   public int[] productExceptSelf(int[] nums) {
    int dpl[]=new int[nums.length];
  
  int dpr[]=new int[nums.length];
    dpl[0]=nums[0];
  
  dpr[nums.length-1]=nums[nums.length-1];
    for(int i=1;i<nums.length;i++){
   
  
  
  dpl[i]=dpl[i-1]*nums[i];
    }
   
   for(int i=nums.length-2;i>=0;i--){
        dpr[i]=dpr[i+1]*nums[i];
   
   }
   
   nums[0]=dpr[1];
   
   nums[nums.length-1]=dpl[nums.length-2];
   
   for(int i=1;i<nums.length-1;i++){
        
        nums[i]=dpr[i+1]*dpl[i-1];
    }
    
    
    return nums;
}
}