public List<List<Integer>> check (int[] candidates,int ind,int target,ArrayList<Integer>temp,List<List<Integer>>res){
        if(ind<0){
        if(target==0){
            res.add(new ArrayList<>(temp));
        }
        return res;
        }
        if(target>=candidates[ind]){
        temp.add(candidates[ind]);
        check(candidates,ind,target-candidates[ind],temp,res);
        temp.remove(temp.size()-1);
        }
        check(candidates,ind-1,target,temp,res);
        return res;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        check(candidates,candidates.length-1,target,temp,res);
        return res;
    }