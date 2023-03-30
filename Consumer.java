import java.util.ArrayList;

/******************************************************
 *  Name:           Hiebert
 *  Class:          CS40S
 * 
 *  Assignment:     Assignment 5: The Factory
 * 
 *  Description:    The Factory
 * 
 ******************************************************/

public class Consumer
{
    public Consumer() {}

    /**
     * A method to take an item from the shelf
     *
     * @param       the shelf
     * @return      the product that was taken from the shelf
     */
    public int takeItem(ArrayList<Integer> shelf) {
        int lastItemIndex = shelf.size() - 1;
        int n = shelf.get(lastItemIndex);
        shelf.remove(lastItemIndex);
        return n;
    }// end takeItems
}// end Consumer
