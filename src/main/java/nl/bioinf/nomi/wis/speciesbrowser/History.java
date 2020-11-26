package nl.bioinf.nomi.wis.speciesbrowser;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class History {
    private static final int MAX_SIZE = 5;
    private Queue<String> historyItems = new LinkedList();


    public void addItem(String resource) {
        if (historyItems.size() == MAX_SIZE) {
            historyItems.poll();
        }
        historyItems.offer(resource);
    }

    public List<String> getHistory() {
        //return history
        return (List)this.historyItems;
    }
}
