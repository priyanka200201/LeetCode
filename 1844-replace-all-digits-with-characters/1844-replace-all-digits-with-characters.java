class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(i%2==0) ans.append(arr[i]);
            if(i%2!=0) ans.append(shift(arr[i-1], arr[i]-'0'));
        }
        return String.valueOf(ans);
    }
    private char shift(char c, int x){
            int ans = c+x;
            char a = (char) ans;
            return a;
    }
}