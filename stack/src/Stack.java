import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stack {
    private String[] storage = new String[1000];
    public List<String> storageList = new ArrayList<String>(Arrays.asList(storage));

    public Stack() {
        this.storage = storage;
        this.storageList = storageList;
    }

    public void pop() {
        if(getNumOfItems() > 0) {
           storageList.set(getNumOfItems() - 1, null);
        }
    }

    public int getNumOfItems() {
        for (int i = 0; i < storageList.size() - 1; i++) {
            if(storageList.get(i) == null) {
                    return i;
            }
        }
       return 0;
    }

    public void reportNumOfItems() {
        if(getNumOfItems() == 0) {
            System.out.println("There are no items in your Stack");
        } else {
            System.out.println(getNumOfItems());
        }
    }

    public void push(String item) {
        int lastAvailableSlot = getNumOfItems();
        if (getNumOfItems() < 1000) {
            storageList.set(lastAvailableSlot, item);
        } else {
            System.out.println("The stack is full");
        }
    }

    public void printStack() {
        List<String> result = new ArrayList<String>();
        storageList.forEach(s -> {
            if(s != null) {
                result.add(s);
            }
        });
        System.out.println(result);
    }
}
