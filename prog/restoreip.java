List<String> ans = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        if(s.length()<4) return ans;
        generateIpAddress(s,0,0,new StringBuilder());
        return ans;
    }

    void generateIpAddress(String s, int idx, int segment, StringBuilder sb){
        if(idx==s.length() && segment==4){
            ans.add(sb.toString());
            return;
        }
        for(int i=idx;i<Math.min(idx+3,s.length());i++){
            String temp = s.substring(idx,i+1);
            if(isValidSegment(temp)){
                int prevlen = sb.length();
                if(segment>0) sb.append(".");
                sb.append(temp);
                generateIpAddress(s,i+1,segment+1,sb);
                sb.setLength(prevlen);
            }
        }
    }

    boolean isValidSegment(String s){
        if(s.length()>1 && s.charAt(0)=='0') return false;
        int value = 0;
        for(int i=0;i<s.length();i++){
            if(!Character.isDigit(s.charAt(i))) return false;
            value = value*10+(int)(s.charAt(i)-'0');
        }
        return value>=0 && value<=255;
    }