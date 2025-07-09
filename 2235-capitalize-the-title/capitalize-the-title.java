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
        result[index++]=s.substring(0,1).toUpperCase()+s.substring(1);
     
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