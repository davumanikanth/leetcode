class Solution {
    public String capitalizeTitle(String title) {
     title=title.toLowerCase();
     String[] word=title.split("\\s+");
     int index=0;
     String[] result=new String[word.length];
     for(String s:word)
     {
        if(s.length()>2)
        {
        result[index++]=Character.toUpperCase(s.charAt(0))+s.substring(1);
     
        }
        else
        {
            result[index++]=s;
        }
     } 

     String sent=String.join(" ",result);
     return sent;
    }
}