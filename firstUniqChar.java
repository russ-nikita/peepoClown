class firstUniqChar {
    public static int firstUniqCharHashMap(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int index = 0; index < s.length(); index++) {
            hashMap.put(s.charAt(index), hashMap.getOrDefault(s.charAt(index), 0) + 1);
        }
        for (int index = 0; index < s.length(); index++) {
            if (hashMap.get(s.charAt(index)) == 1)
                return index;
        }
        return -1;
    }
}
