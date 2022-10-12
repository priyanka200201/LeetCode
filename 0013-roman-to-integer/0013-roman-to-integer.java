class Solution {
    public int romanToInt(String s) {
        int len = s.length();
        int a = 0;
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            int b = getValue(ch);
            if (i < len - 1 && b < getValue(s.charAt(i + 1))) {
                a -= b;
            } else {
                a += b;
            }
        }
        return a;
    }
    private int getValue(char ch) {
        int a = 0;
        switch (ch) {
            case 'I':
                a = 1;
                break;
            case 'V':
                a = 5;
                break;
            case 'X':
                a = 10;
                break;
            case 'L':
                a = 50;
                break;
            case 'C':
                a = 100;
                break;
            case 'D':
                a = 500;
                break;
            case 'M':
                a = 1000;
                break;
            default:
                break;
        }
        return a;
    }
}