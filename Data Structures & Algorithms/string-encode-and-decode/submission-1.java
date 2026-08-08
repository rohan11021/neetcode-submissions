class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
        StringBuilder str = new StringBuilder();
        for (String string : strs) {
            str.append(string.length()+"#"+string);
        }
        return str.toString();
    }

    public List<String> decode(String str) {
        if(str.equals("")){
            return new ArrayList<String>();
        }
        List<String> strs = new ArrayList<>();
        int i = 0;
        while( i < str.length()) {
        StringBuilder len = new StringBuilder();

            while (str.charAt(i) != '#') {
                len.append(str.charAt(i));
                i++;
            }

            int length = Integer.parseInt(len.toString());
            i++;
            strs.add(str.substring(i,length+i));
            i+=length;
        }
        return strs;
    }
}
