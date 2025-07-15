class Solution {
    public int dayOfYear(String date) {
        date=date.replaceAll("[^0-9]","");
        String day=date.substring(6,8);
        String month=date.substring(4,6);
        String year=date.substring(0,4);
        int y1=Integer.parseInt(year);
        int m1=Integer.parseInt(month);
        int d1=Integer.parseInt(day);
        int value=0;
        if(m1==1)
        {
            value= d1;
        }
        else if(m1==2)
        {
            

            value=31+d1;
        }
        else if(m1==3)
        {
            if((y1%4==0 && y1%100!=0) ||y1%400==0 )
            {
                
            
            value=60+d1;
            }
            else 
            {
                value=59+d1;
            }
        }
        else if(m1==4)
        {
            if((y1%4==0 && y1%100!=0) ||y1%400==0 )
            {
                
            
            value= 91+d1;
            }
            else 
            {
                value=90+d1;
            }
        }
        else if(m1==5)
        {
            if((y1%4==0 && y1%100!=0) ||y1%400==0 )
            {
                
            
            value=121+d1;
            }
            else 
            {
                value=120+d1;
            }
        }
        else if(m1==6)
        {
            if((y1%4==0 && y1%100!=0) ||y1%400==0 )
            {
                
            
            value=152+d1;
            }
            else 
            {
                value=151+d1;
            }
        }
        else if(m1==7)
        {
            if((y1%4==0 && y1%100!=0) ||y1%400==0 )
            {
             
            value= 182+d1;
            }
            else 
            {
                value=181+d1;
            }
        }
        else if(m1==8)
        {
            if((y1%4==0 && y1%100!=0) ||y1%400==0 )
            {
            
            value= 213+d1;
            }else
            {
                value=212+d1;
            }
        }
        else if(m1==9)
        {
            if((y1%4==0 && y1%100!=0) ||y1%400==0 )
            {
                
            
            value=244+d1;
            }
            else 
            {
                value=243+d1;
            }
        }
        else if(m1==10)
        {
            if((y1%4==0 && y1%100!=0) ||y1%400==0 )
            {
                
            
            value=274+d1;
            }else
            {
                value=273+d1;

            }
        }
        else if(m1==11)
        {
            if((y1%4==0 && y1%100!=0) ||y1%400==0 )
            {
                
            
            value= 305+d1;
            }
            else 
            {
                value=304+d1;
            }
        }
        else if(m1==12)
        {
            if((y1%4==0 && y1%100!=0) ||y1%400==0 )
            {
                
            
            value=335+d1;
            }else 
            {
                value=334+d1;
            }
        }
        return value;
    }
}