import java.util.Stack;

public class UseStack {

    public static void main(String[] args) {


        Stack<String> fruits=new Stack<>();
        fruits.push("Mango");
        fruits.push("Orange");
        fruits.push("grape");

       // System.out.println(fruits.peek());
        //System.out.println(fruits.pop());
      /*  if(fruits.peek().equalsIgnoreCase("grape")){
            System.out.println(fruits.pop());
        }*/
        while (!fruits.empty()){
            System.out.println(fruits.pop());
        }

    }
}
