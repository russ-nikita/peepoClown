class firstUniqChar {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    chars[j] = 0;
                    flag = true;
                    }
                }
                    if (flag) {
                    chars[i] = 0;
                    }
                    if (chars[i] != 0) return i;
        }    
       return -1;
    }
}
