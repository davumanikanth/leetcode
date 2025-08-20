class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character,String> map=new HashMap<>();
        map.put('a',".-");
        map.put('b',"-...");
        map.put('c',"-.-.");
        map.put('d',"-..");
        map.put('e',".");
        map.put('f',"..-.");
        map.put('g',"--.");
        map.put('h',"....");
        map.put('i',"..");
        map.put('j',".---");
        map.put('k',"-.-");
        map.put('l',".-..");
        map.put('m',"--");
        map.put('n',"-.");
        map.put('o',"---");
        map.put('p',".--.");
        map.put('q',"--.-");
        map.put('r',".-.");
        map.put('s',"...");
        map.put('t',"-");
        map.put('u',"..-");
        map.put('v',"...-");
        map.put('w',".--");
        map.put('x',"-..-");
        map.put('y',"-.--");
        map.put('z',"--..");
        HashSet<String > result=new HashSet<>();
        for(int i=0;i<words.length;i++)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<words[i].length();j++)
            
            {
                char ch=words[i].charAt(j);
                sb.append(map.get(ch));
            }
            result.add(sb.toString());
        }
        return result.size();
    }
}