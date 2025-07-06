class Solution {
    public int finalValueAfterOperations(String[] operations) {
      int[] value=new int[operations.length];
      int index=0;
      for(int i=0;i<operations.length;i++)
      {
        if(operations[i].equals("--X")|| operations[i].equals("X--"))
        {
            value[index++]=-1;
        }
        else
        {
            value[index++]=1;
        }
      }  
      int sum=0;
      for(int i=0;i<value.length;i++)
      {
        sum=sum+value[i];
      }
      return sum;

    }
}