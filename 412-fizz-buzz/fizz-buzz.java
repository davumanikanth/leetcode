class Solution {
    public List<String> fizzBuzz(int n) {
     List<String> group=new ArrayList<>();
          for(int i=1;i<=n;i++)
     {
        if(i%3==0 && i%5==0)
        {
            group.add("FizzBuzz");
        }
        else if(i%3==0)
        {
            group.add("Fizz");
        }
        else if(i%5==0)
        {
            group.add("Buzz");
        }
        else
        {
            group.add(Integer.toString(i));
        }


     }
     return group;   
    }
}