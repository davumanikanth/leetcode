class Solution {
    /*
    n:- 
    y
    1 1 0 1
    ps =3
    ss=
    */
    public int bestClosingTime(String customers) {
        int len=customers.length();
        
        int ycount=0;
        int ncount=0;
        int count=0;
        int[] arr=new int[len];
        HashMap<Integer,Integer> group=new HashMap<>();
        int ps=sum(arr);
        group.put(0,ps);
        int minV=ps;
        for(int i=0;i<len;i++)
        {
            char ch=customers.charAt(i);
            if(ch=='Y')
            {
                ycount++;
                arr[i]=1;
            }
            if(ch=='N')
            {
                ncount++;
                arr[i]=0;
            }
        }
        
        
       
       //this is prifix sum;
        int sum1=0;
        int val=len+1;
        for(int i=0;i<len;i++)
        {
            if(arr[i]==1)
            {
                ps=ps-1;
                group.put(i+1,ps);
                
            }
            else
            {
                ps=ps+1;
                group.put(i+1,ps);
            
            }

           minV=Math.min(ps,minV);
            

            
        }
      
     
        for(Map.Entry<Integer,Integer> entries:group.entrySet())
        {
            if(minV==entries.getValue())
            {
                count=entries.getKey();
                break;
            }
        }

        

        if(ycount==len)
        
        {
            return len;
            
        }
        else if(ncount==len)
        {
            return 0;
        }
        else
        {
        return count;
        }
    }
    public int  sum(int[] arr1)
    {
        int sum=0;
        for(int i=0;i<arr1.length;i++)
        {
            sum+=arr1[i];
        }
        return sum;
    }
}
/*
0 0 0 1 0  0 0 =1
2 3 4 4 5 6




*/ 