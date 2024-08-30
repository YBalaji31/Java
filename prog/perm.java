public void swap(int[]nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    public List<List<Integer>> check(int[]nums,int ind,List<List<Integer>>res){
        if(ind<nums.length){
            for(int i=0;i<nums.length;i++){
                System.out.print(nums[i]+" ");
            }
        System.out.println();
        }
        for(int i=ind;i<nums.length;i++){
            swap(nums,i,ind);
            check(nums,i+1,res);
            swap(nums,i,ind);
        }
        return res;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>(); 
        check(nums,0,res);
        return res;
    }