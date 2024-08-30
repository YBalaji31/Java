 public boolean canJump(int[] nums) {
     int ind=0;
     for(int i=0;i<nums.length;i++){
         if(i>ind){
            return false;
        }
        if(nums[i]+i>ind){
            ind=nums[i]+i;
        }
       
     }   
     return true;
    }