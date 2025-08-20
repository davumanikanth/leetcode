class Solution {
    public String reformatDate(String date) {
        String[] man=date.split("\\s+");
        man[0]=man[0].replaceAll("[a-zA-Z]","");
        String value="";
        if(man[1].equals("Jan"))
        {
            value="01";
        }
        else if(man[1].equals("Feb"))
        {
            value="02";
        }
        else if(man[1].equals("Mar"))
        {
            value="03";
        }
        else if(man[1].equals("Apr"))
        {
            value="04";
        }
        else if(man[1].equals("May"))
        {
            value="05";
        }
        else if(man[1].equals("Jun"))
        {
            value="06";
        }
        else if(man[1].equals("Jul"))
        {
            value="07";
        }
        else if(man[1].equals("Aug"))
        {
            value="08";
        }
        else if(man[1].equals("Sep"))
        {
            value="09";
        }
        else if(man[1].equals("Oct"))
        {
            value="10";
        }
        else if(man[1].equals("Nov"))
        {
            value="11";
        }
        else if(man[1].equals("Dec"))
        {
            value="12";
        }
        int num=Integer.parseInt(man[0]);
        String day;

        if(num<10)
        {
            day="0"+man[0];
        }
        else
        {
           day=man[0];
        } 
        
       return man[2]+"-"+value+"-"+day; 
    }
}