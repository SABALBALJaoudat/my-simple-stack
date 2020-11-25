package deqo.jsab.mysimplestack;

import java.util.Stack;

public class SimpleStack {
    Stack stackItem;

    public boolean isEmpty(){
        if (stackItem.empty()){
            return true;
        }else{
            return false;
        }
    }

    public int getSize(){
        return stackItem.size();
    }

    public void push(Item item){
        stackItem.push(item);
    }

}
