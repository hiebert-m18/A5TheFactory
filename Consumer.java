import java.util.ArrayList;

/**
 * Write a description of class Consumer1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Consumer
{
    /**
     * Constructor for objects of class Consumer1
     */
    public Consumer() {}

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int takeItem(ArrayList<Integer> shelf) {
        int lastItemIndex = shelf.size() - 1;
        int n = shelf.get(lastItemIndex);
        shelf.remove(lastItemIndex);
        return n;
    }// end takeItems
}// end Consumer
