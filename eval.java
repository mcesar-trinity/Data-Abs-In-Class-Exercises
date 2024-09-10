import java.util.Stack;

public class eval {
    
    public static double evaluatePostfix(String expr) {

        String[] parts = expr.split(" ");
        Stack<Double> stank = new Stack<>();

        for(String p : parts) {
            case "+" :
                stank.push(stank.pop() + stank.pop());
                break;

            case "-" :
                Double secondOp = stank.pop();
                stank.push(stank.pop() - secondOp);
                break;

            case "*" :
                stank.push(stank.pop() * stank.pop());
                break;
            case "/" :
                stank.push(stank.pop() / stank.pop());
                break;
            default:
                stank.push(Double.parseDouble(p));
                break;

        }


        return stank.pop();
    }

}
