class TreeNode
{
    TreeNode[] children=new TreeNode[10];
    boolean isEnd;
}
class Trie
{
    TreeNode root=new TreeNode();
    public void insert(int num)
    {
        TreeNode node=root;
        String n=Integer.toString(num);
        for(int i=0;i<n.length();i++)
        {
            int idx=n.charAt(i)-'0';
            if(node.children[idx]==null)
            {
                node.children[idx]=new TreeNode();
            }
            node=node.children[idx];
            

        }
    }
    public int search(int num)
    {
        TreeNode node=root;
        int len=0;
        String n=Integer.toString(num);
        for(int i=0;i<n.length();i++)
        {
            int idx=n.charAt(i)-'0';
            if(node.children[idx]!=null)
            {
                len++;
                node=node.children[idx];
                


            }else
            {
                break;
            }
        }
        return len;
        
    }
    

}

class Solution {
    

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Trie t=new Trie();
        for(int i=0;i<arr2.length;i++)
        {
            t.insert(arr2[i]);
        }
        
        int max=0;
        for(int i=0;i<arr1.length;i++)
        {
            max=Math.max(max,t.search(arr1[i]));
        }
        return max;
    }
}