import java.util.ArrayList;
import java.util.Random;

/******************************************************
 *  Name:           Hiebert
 *  Class:          CS40S
 * 
 *  Assignment:     Assignment 5: The Factory
 * 
 *  Description:    The Factory
 * 
 ******************************************************/

public class Producer
{
    public Producer() {}

    /**
     * A method to add an item to the shelf.
     *
     * @param       the shelf, random number generator
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
