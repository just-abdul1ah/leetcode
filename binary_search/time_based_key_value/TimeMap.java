import java.util.*;

public class TimeMap {
    Map<String, List<Node>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key))
            map.put(key, new ArrayList<>());
        map.get(key).add(new Node(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        List<Node> ls = map.get(key);
        if (ls == null) return "";
        int start = 0;
        int end = ls.size() - 1;
        String answ = "";
        while (start <= end) {
            int mid = (start + end) / 2;
            if (ls.get(mid).getT() > timestamp) { end = mid - 1; }
            else {
                answ = ls.get(mid).getV();
                start = mid + 1;
            }
        }
        return answ;
    }
}

class Node {
    int time;
    String value;

    Node(int t, String v) {
        time = t;
        value = v;
    }

    int getT() { return time; }
    String getV() { return value; }
}
