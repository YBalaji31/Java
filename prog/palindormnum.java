public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp=x;
        int res=0;
        while(temp!=0){
            res*=10; 
            res+=(temp%10);
            temp/=10; 
        }
        if(x==res){
            return true;
        }
        else{
            return false;
        }
    }