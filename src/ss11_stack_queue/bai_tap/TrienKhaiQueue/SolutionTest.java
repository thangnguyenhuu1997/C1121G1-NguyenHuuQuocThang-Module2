package ss11_stack_queue.bai_tap.TrienKhaiQueue;

public class SolutionTest {
    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.front = null;
        myQueue.rear = null;
        Solution mySolution = new Solution();
        mySolution.enQueue(myQueue, 14);
        mySolution.enQueue(myQueue, 22);
        mySolution.enQueue(myQueue, -6);
        mySolution.displayQueue(myQueue);
        mySolution.deQueue(myQueue);
        mySolution.displayQueue(myQueue);
        mySolution.deQueue(myQueue);
        mySolution.displayQueue(myQueue);
        mySolution.enQueue(myQueue, 9);
        mySolution.displayQueue(myQueue);
        mySolution.enQueue(myQueue, 20);
        mySolution.displayQueue(myQueue);

    }

}
