import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class Producer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Producer
{
    /**
     * Constructor for objects of class Producer
     */
    public Producer() {}

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void stockShelf(ArrayList<Integer> shelf, Random random) {
        if (shelf.size() != 5) {
            shelf.add(random.nextInt(10));
            System.out.println(Thread.currentThread().getName() + " has added an item to the shelf. There are " + shelf.size() + " items on the shelf.");
        } else {
            System.out.println("The shelf is full!"); 
        }// end else if
    }// end stockShelf
}// end Producer
