package codingChallenges;

import java.util.ArrayList;

public class StackCustom {
    private ArrayList<Integer> collection;


    public StackCustom() {
        this.collection = new ArrayList<>();

    }
    public ArrayList<Integer> push(int value) {
        this.collection.add(value);
        return this.collection;
    }
    public int pop() {
        return this.collection.remove(this.collection.size() - 1);
    }
    public int peek() {
        return this.collection.get(this.collection.size() - 1);
    }
    public boolean isEmpty() {
        return this.collection.isEmpty();
    }

}


