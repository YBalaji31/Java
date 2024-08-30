private void generate(List<String> res, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            res.add(current);
            return;
        }
        
        // Add an open parenthesis if we haven't used all of them
        if (open < max) {
            generate(res, current + '(', open + 1, close, max);
        }
        
        // Add a close parenthesis if it doesn't exceed the number of open ones
        if (close < open) {
            generate(res, current + ')', open, close + 1, max);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res, "", 0, 0, n);
        return res;
    }