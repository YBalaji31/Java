public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        res[0]=1;
        for(int i=1;i<n;i++){
            res[i]=nums[i-1]*res[i-1];
        }
        int right=1;
        for(int i=n-1;i>=0;i--){
            res[i]=right*res[i];
            right*=nums[i];
        }
        return res;

        /*right[n-1]=1;
        for(int j=n-2;j>=0;j--){
            right[j]=right[j+1]*nums[j+1];
        }
        for(int k=0;k<n;k++){
            res[k]=left[k]*right[k];
        }
        return res;*/

    }