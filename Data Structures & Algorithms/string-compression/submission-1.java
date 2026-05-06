class Solution {
    public int compress(char[] chars) {
        int k = 0;
        String s = "";
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (s.isEmpty()) {
                s = s.concat("" + chars[i]);
                count++;
            } else if (s.equals("" + chars[i])) {
                count++;
            } else if (count > 1){
                s = s.concat("" + count);
                for (char c : s.toCharArray()) {
                    chars[k] = c;
                    k++;
                }
                s = ""+chars[i];
                count = 1;
            } else {
                chars[k] = s.toCharArray()[0];
                s = ""+chars[i];
                k++;
                count = 1;
            }
        }
        if(count > 1){
            s = s.concat("" + count);
            for (char c : s.toCharArray()) {
                chars[k] = c;
                k++;
            }
        } else if (count == 1){
            chars[k] = s.toCharArray()[0];
            k++;
        }
        return k;
    }
}