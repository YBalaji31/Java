public int rob(int[] nums) {
       if(nums.length==1){
        return nums[0];
       }
       if(nums.length==2){
        return Math.max(nums[0],nums[1]);
       }
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        int take=0;
        int notake=0;
        for(int i=1;i<nums.length;i++){
            take=nums[i];
            notake=0+dp[i-1];
            if(i>1){
                take+=dp[i-2];
            }
            System.out.println(take+"   "+notake);
           dp[i]=Math.max(take,notake);
        }
        for(int j=0;j<nums.length;j++){
            System.out.print(dp[j]+" ");
        }
         return Math.max(dp[nums.length-1],dp[nums.length-2]);
    }