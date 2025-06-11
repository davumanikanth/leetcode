class Solution {

    public int maxDifference(String s, int k) {
        int n = s.length();
        int ans = Integer.MIN_VALUE;
        for (char a = '0'; a <= '4'; ++a) {
            for (char b = '0'; b <= '4'; ++b) {
                if (a == b) {
                    continue;
                }
                int[] best = new int[4];
                Arrays.fill(best, Integer.MAX_VALUE);
                int cnt_a = 0, cnt_b = 0;
                int prev_a = 0, prev_b = 0;
                int left = -1;

                for (int right = 0; right < n; ++right) {
                    cnt_a += (s.charAt(right) == a) ? 1 : 0;
                    cnt_b += (s.charAt(right) == b) ? 1 : 0;

                    while (right - left >= k && cnt_b - prev_b >= 2) {
                        int left_status = getStatus(prev_a, prev_b);
                        best[left_status] = Math.min(
                            best[left_status],
                            prev_a - prev_b
                        );
                        ++left;
                        prev_a += (s.charAt(left) == a) ? 1 : 0;
                        prev_b += (s.charAt(left) == b) ? 1 : 0;
                    }

                    int right_status = getStatus(cnt_a, cnt_b);
                    if (best[right_status ^ 0b10] != Integer.MAX_VALUE) {
                        ans = Math.max(
                            ans,
                            cnt_a - cnt_b - best[right_status ^ 0b10]
                        );
                    }
                }
            }
        }
        return ans;
    }

    private int getStatus(int cnt_a, int cnt_b) {
        return ((cnt_a & 1) << 1) | (cnt_b & 1);
    }
}
//brute force method
// class Solution {
//     public int maxDifference(String s, int k) {
//         int number=Integer.parseInt(s);
//         HashMap<Integer,Integer> group=new HashMap<>();
//         int n=s.length();
//         for(int i=0;i<n;i++)
//         {
//            int ch=s.charAt(i)-'0';
//             if(group.containsKey(ch))
//             {
//                 int count=group.get(ch);
//                 group.put(ch,count+1);
//             }
//             else
//             {
//                 group.put(ch,1);
//             }
//         }
//         int maxfeq=Integer.MIN_VALUE;
//         int minfeq=Integer.MAX_VALUE;
//         boolean foundatleastone=false;
//         for(int num: group.values())
//         {
//            if(num>=k){
//             foundatleastone=true;
//                 maxfeq=Math.max(maxfeq,num);
           
//                 minfeq=Math.min(minfeq,num);
//            }
            
//         }
//         if(!foundatleastone|| maxfeq==minfeq)
//         {
//             return -1;
//         }
//         return maxfeq-minfeq;

//     }
// }