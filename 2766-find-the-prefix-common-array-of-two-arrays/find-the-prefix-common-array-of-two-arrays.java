class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
      HashMap<Integer,Integer> group=new HashMap<>();
      int count=0;
      for(int i=0;i<A.length;i++)
      {
        if(A[i]==B[i])
        {
            group.put(A[i],group.getOrDefault(A[i], 0) + 2);
            count++;
        }
        else
        {
        group.put(A[i],
                group.getOrDefault(A[i], 0) + 1);

                group.put(B[i],
                group.getOrDefault(B[i], 0) + 1);

                if(group.get(A[i]) == 2) {
                    count++;
                }
                if(group.get(B[i]) == 2) {
                    count++;
                }

        }

        A[i]=count;
      }  
      return A;
    }
}