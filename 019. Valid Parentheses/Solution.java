class Solution {
    public boolean isValid(String s) {
		HashMap<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Stack<Character> stack = new Stack();

        for (int i=0;i<s.length();i++){
            char curr = s.charAt(i);

            if (map.keySet().contains(curr)){
                stack.push(curr);
            }
            else {
                //如果栈不为空，并且栈顶元素在 map 中的 value 与 curr 相等，则弹出栈顶元素
                if (!stack.empty() && map.get(stack.peek()) == curr){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}