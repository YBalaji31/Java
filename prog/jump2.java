 public int jump(int[] nums) {
        int i=0;
        int n=nums.length;
        int left=0;
        int right=0;
        int count=0;
        while(right<n-1){
            int max=0;
            for(int k=left;k<=right;k++){
                if(max<k+nums[k]){
                    max=k+nums[k];
                }
            }
            left=right+1;
            right=max;
            i+=1;
            count+=1;
        }
        return count;
    }