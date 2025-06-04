class Solution {
    public String lastSubstring(String s) {
        int n=s.length();
        int i=0,j=1,k=0;
        while(j+k<n)
        {
            if(s.charAt(i+k)==s.charAt(j+k))
            {
                k++;
            }
            else if(s.charAt(i+k)<s.charAt(j+k))
            {
                i=Math.max(i+k+1,j);
                j=i+1;
                k=0;
            }
            else
            {
                j=j+k+1;
                k=0;

            }

        }
        return s.substring(i);
    }
}
//BRUTE FORCE METHOD
// class Solution {
//     public String lastSubstring(String ward) {
//         int n=ward.length();
//         List<String> substrings=new ArrayList<>();

//         for(int start=0;start<n;start++)
//         {
//             for(int end=start+1;end<=n;end++)
//             {
//                 substrings.add(ward.substring(start,end));

//             }
//         }
//         String[] words=new String[substrings.size()];
//         words=substrings.toArray(words);

//         String max=words[0];
//         for(int i=1;i<words.length;i++)
//         {
//             if(words[i].compareTo(max)>0)
//             {
//                 max=words[i];
//             }
//         }
//         return max;
//     }
// }