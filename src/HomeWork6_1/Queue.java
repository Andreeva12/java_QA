package HomeWork6_1;

public class Queue {
    // these members are now private
    private char q[]; // this array holds the queue
    private int putloc, getloc; // the put and get indices

    Queue(int size) {
        q = new char[size+1]; // allocate memory for queue
        putloc = getloc = 0;
    }

    public Queue(char[] name) {
        q = new char[name.length + 1]; // allocate memory for queue
        putloc = 0;
        getloc = 0;
        for (char ch : name) {
            put(ch);
        }
    }

    // Construct queue from another queue.
    public Queue(Queue ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];

        // Copy elements
        for (int i = getloc + 1; i <= putloc; i++) {
            q[i] = ob.q[i];
        }
    }

    // Put a characer into the queue.
    void put(char ch) {
        if(putloc==q.length-1) {
            System.out.println(" -- Queue is full.");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    // Get a character from the queue.
    char get() {
        if(getloc == putloc) {
            System.out.println(" -- Queue is empty.");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}

