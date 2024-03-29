package HomeWork5_1;

public class Queue {
    char q[]; // this array holds the queue
    int putloc, getloc; // the put and get indices

    Queue(int size) {
        q = new char[size+1]; // allocate memory for queue
        putloc = getloc = 0;
    }

    // put a characer into the queue
    void put(char ch) {
        if(putloc==q.length-1) {
            System.out.println(" -- Queue is full.");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    // get a character from the queue
    char get() {
        if(getloc == putloc) {
            System.out.println(" -- Queue is empty.");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}