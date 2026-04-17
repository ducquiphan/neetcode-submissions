class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String result = new String();
        char[] arrC1 = strs[0].toCharArray();
        char[] arrC2 = strs[strs.length-1].toCharArray();
        int len = arrC1.length > arrC2.length ? arrC2.length : arrC1.length;
        for (int i =0 ; i< len; i++){
            if (arrC1[i]==arrC2[i]){
                result = result.concat(arrC1[i]+"");
            }else{
                return result;
            }
        }
        return result;
    }
}