class Solution {
    public String sortSentence(String s) {
      String[] word=s.split("\\s+");
    String [] letter= new String[word.length];
    int[] number=new int[word.length];
    for(int i=0;i<word.length;i++)
    {
        int len=word[i].length();
        letter[i]=word[i].substring(0,len-1);
        number[i]=word[i].charAt(len-1)-'0';
    }  
    Map<Integer,String> group=new TreeMap<>();
    for(int i=0;i<number.length;i++)
    {
        group.put(number[i],letter[i]);
    }
    String[] result=new String[letter.length];
    int index=0;
    for(Map.Entry<Integer,String> entry:group.entrySet())
    {
        result[index++]=entry.getValue();
         

    }
    String sent=String.join(" ",result);
    return sent;
    }
}