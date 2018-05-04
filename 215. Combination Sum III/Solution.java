class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
                List<List<Integer>> res = new ArrayList<>(); //返回结果
        combinations(res,new ArrayList<>(),k,n,1);

        return res;
    }
        private void combinations(List<List<Integer>> result,List<Integer> temp,int k, int n, int index){
        //满足边界条件，记录结果
        if (temp.size() == k && n==0){
            result.add(new ArrayList<>(temp));
            return;
        }

        
        for (int i=index;i<=9 && k>0 && n>0 ;i++){
            temp.add(i);
            combinations(result,temp,k,n-i,i+1);
            temp.remove(temp.size()-1);//means we need to change the element here
        }
    }
}