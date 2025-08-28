class Solution {
    public String largestGoodInteger(String num) {
        String str="";
        if(num.contains("999"))
        {
            str= "999";
            
        }
        else if(num.contains("888"))
        {
            str= "888";
            
        }
        else if(num.contains("777"))
        {
            str= "777";
            
        }
        else if(num.contains("666"))
        {
            str= "666";
        
        }
        else if(num.contains("555"))
        {
            str="555";
        
        }
        else if(num.contains("444"))
        {
            str= "444";
            
        }
        else if(num.contains("333"))
        {
            str="333";
            
        }
        else if(num.contains("222"))
        {
            str="222";
            
        }
        else if(num.contains("111"))
        {
            str="111";
            
        }
        else if(num.contains("000"))
        {
            str="000";
        
        }
        return str;

        
    }
}