class Solution {
    public boolean hasAllCodes(String s, int k) {
        //brute force
    //     int n=1<<k;
    //     for(int i=0;i<n;i++)
    //     {
    //         String binary=Integer.toBinaryString(i);
    //         while(binary.length()<k)
    //         {
    //             binary='0'+binary;

    //         }
    //         if(!s.contains(binary))
    //         {
    //             return false;
    //         }
    //     }

    //    return true; 

    //optimal
    Set<String> set=new HashSet<>();
    for(int i=0;i<=s.length()-k;i++)
    {
        set.add(s.substring(i,i+k));
    }
    int n=1<<k;
    if(set.size()==n)
    {
        return true;
    }
    return false;
    }
}