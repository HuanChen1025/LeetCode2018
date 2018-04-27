class Solution {
    public List<String> fizzBuzz(int n) {
                List<String> results = new ArrayList<>();

        for (int i=1;i<=n;){
            if (i%15==0){
                results.add("FizzBuzz");
                i++;

            }
            else if (i%5 == 0){
                results.add("Buzz");
                i++;

            }
            else if (i%3==0){
                results.add("Fizz");
                i++;

            }
            else if (i%3!=0 && i %5 !=0){
                results.add(String.valueOf(i));
                i++;
            }
        }
        return results;
    }
}