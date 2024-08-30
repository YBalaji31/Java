public int divide(int dividend, int divisor) {
        if(dividend==divisor)return 1;
        boolean sign=true;
        if(dividend>=0 && divisor<0) sign=false;
        else if (dividend<=0 && divisor>0) sign=false;
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        long quotient=0;
        while(n>=d){
            int count=0;
            while(n>=(d<<count+1))
            count+=1;
            quotient+=1<<count;
            n-=d<<count;
        }
        if(quotient==(1<<31)&&sign)return Integer.MAX_VALUE;
        else if(quotient==(1<<31)&&!sign)return Integer.MIN_VALUE;
        return (sign?(int)quotient:(int)-quotient);
    }