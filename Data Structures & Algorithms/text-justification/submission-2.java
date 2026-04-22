class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> line = new ArrayList<>();
        List<String> result = new ArrayList<>();
        Integer expectedLength = 0;
        Integer i = 0;
        while(i < words.length){
            if (expectedLength + words[i].length() + line.size() <= maxWidth){
                expectedLength += words[i].length();
                line.add(words[i]);
                i++;
            }else{
                Integer extraSpace = maxWidth-expectedLength;
                int remainder = extraSpace % Math.max(1, (line.size() - 1));
                int space = extraSpace / Math.max(1, (line.size() - 1));
                for(int j = 0; j < Math.max(1, (line.size() - 1)); j++){

                    line.set(j, line.get(j)+ " ".repeat(space));
                    if(remainder > 0){
                        line.set(j, line.get(j)+ " ");
                        remainder--;
                    }
                }
                result.add(String.join("", line));
                line.clear();
                expectedLength = 0;
            }
        }
        String lastLine = String.join(" ", line);
        int trailSpace = maxWidth - lastLine.length();
        result.add(lastLine + " ".repeat(trailSpace));
        return result;
    }
    
}