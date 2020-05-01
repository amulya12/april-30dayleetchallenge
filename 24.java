class Node {
    int key;
    int val;
    Node next;
    Node prev;
    
    Node (int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;
    
    DoublyLinkedList() {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }
    
    public void remove(Node n) {
        if (n != null && n.prev != null && n.next != null) {
            Node prev = n.prev;
            prev.next = n.next;
            prev.next.prev = prev;
        }
    }
    
    public Node getLastNode() {
        if (head == tail) return null;
        
        return tail.prev;
    }
    
    public void addFirst(Node n) {
        head.next.prev = n;
        n.next = head.next;
        n.prev = head;
        head.next = n;
    }
    
    public Node getFirstNode() {
        if (head == tail) return null;
        
        return head.next;
    }
}

class LRUCache {
    Map<Integer, Node> map;
    DoublyLinkedList dl;
    int capacity;
    
    public LRUCache(int capacity) {
        map = new HashMap<>();
        dl = new DoublyLinkedList();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) return -1;
        
        Node n = map.get(key);
        if (dl.getFirstNode() != null) {
            dl.remove(n);
            dl.addFirst(n);
        }
        
        return n.val;
    }
    
    public void put(int key, int value) {
        remove(key);

        if (map.size() == capacity) remove(dl.getLastNode().key);

        Node newNode = new Node(key, value);
        dl.addFirst(newNode);
        map.put(key, newNode);
    }
    
    public void remove(int key) {
        Node n = map.get(key);
        dl.remove(n);
        map.remove(key);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */