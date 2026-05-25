#include <climits>

class Solution {
public:
    int minimumRecolors(string blocks, int k) {
        int left = 0;
        int count = 0;
        int minVal = INT_MAX;

        for(int right = 0; right < blocks.size(); right++) {

            // Add current character
            if(blocks[right] == 'W')
                count++;

            // Shrink if size > k
            if(right - left + 1 > k) {
                if(blocks[left] == 'W')
                    count--;

                left++;
            }

            // Window size exactly k
            if(right - left + 1 == k) {
                minVal = min(minVal, count);
            }
        }

        return minVal;
    }
};