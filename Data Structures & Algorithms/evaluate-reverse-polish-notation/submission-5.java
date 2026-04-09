class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            
            if("+-*/".contains(tokens[i])){
                int a=stack.pop();
                int b=stack.pop();
                switch(tokens[i]){
                     case "+": stack.push(b + a); break;
                    case "-": stack.push(b - a); break;
                    case "*": stack.push(b * a); break;
                    case "/":
                        stack.push(b / a);
                        break;
                
                }

                
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }

        }
        return stack.peek();
        
    }
}
