import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
import java.util.concurrent.locks.*;

/******************************************************
 *  Name:           Hiebert
 *  Class:          CS40S
 * 
 *  Assignment:     Assignment 5: The Factory
 * 
 *  Description:    The Factory
 * 
 ******************************************************/

public class Factory {
    public static void main(String[] args){
        // ***** variables *****
        String banner = "";
        String nl = System.lineSeparator();
    
        // ***** objects *****
        ProgramInfo programinfo = new ProgramInfo();
        Random random = new Random();
        ArrayList<Integer> shelf = new ArrayList<Integer>();
        Lock lock = new ReentrantLock();
        
        Producer producer = new Producer();
        Consumer consumer1 = new Consumer();
        Consumer consumer2 = new Consumer();
        Consumer consumer3 = new Consumer();
    
        // ***** print banners *****
        // System.out.println(programinfo.getBanner("Hiebert", "A5: The Factory"));

        // ***** Main Processing *****
        Runnable producerRun = () -> {
            synchronized(producer) {
                // lock the shelf
                lock.lock();
                try {
                    producer.stockShelf(shelf, random);
                } catch (Exception e) {
                    System.out.println(Thread.currentThread().getName() + " couldn't access the shelf.");
                } finally {
                    lock.unlock();
                }// end try finally   
            }
        };// end producerRun
        
        Runnable consumer1Run = () -> {
            double n = 0;
            double item = 0;
            boolean access = true;
            
            synchronized(consumer1) {
                try {
                    // lock the shelf
                    lock.lock();
                    try {
                        item = consumer1.takeItem(shelf);
                    } catch (Exception e) {
                        System.out.println(Thread.currentThread().getName() + " couldn't access the shelf.");
                        access = false;
                    } finally {
                        lock.unlock();
                    }// end try finally
                    
                    // print and compute
                    if (access == true) {
                        n = Math.pow(2, item);
                        System.out.println(Thread.currentThread().getName() + " took 1 item and calculated: 2^" + item + " = " + n + ". There are " + shelf.size() + " items left.");
                    }// end if
                    
                    // sleep
                    Thread.sleep(50);
                }
                catch (InterruptedException e) {}   
            }
        };// end consumer1Run
        
        Runnable consumer2Run = () -> {
            int a = 0;
            int b = 0;
            boolean access = true;
            
            synchronized(consumer2) {
                try {
                    // lock the shelf
                    lock.lock();
                    try {
                        a = consumer2.takeItem(shelf);
                        b = consumer2.takeItem(shelf);
                    } catch (Exception e) {
                        System.out.println(Thread.currentThread().getName() + " couldn't access the shelf.");
                        access = false;
                    } finally {
                        lock.unlock();
                    }// end try finally
                    
                    // print and compute
                    if (access == true) {
                        System.out.println(Thread.currentThread().getName() + " took 2 items and calculated: " + a + " + " + b + " = " + (a+b) + ". There are " + shelf.size() + " items left.");
                    }// end if
                    
                    // sleep
                    Thread.sleep(75);
                }
                catch (InterruptedException e) {}   
            }
        };// end consumer2Run
        
        Runnable consumer3Run = () -> {
            int a = 0;
            boolean access = true;
            synchronized(consumer3) {
                try {
                    // lock the shelf
                    lock.lock();
                    try {
                        a = consumer3.takeItem(shelf);
                    } catch (Exception e) {
                        System.out.println(Thread.currentThread().getName() + " couldn't access the shelf.");
                        access = false;
                    } finally {
                        lock.unlock();
                    }// end try finally
                    
                    // print and compute
                    if (access == true) {
                        System.out.println(Thread.currentThread().getName() + " took 1 items and it is: " + a + ". There are " + shelf.size() + " items left.");
                    }// end if
                    
                    // sleep
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {}   
            }
        };// end consumer3Run
        
        
        for (int i = 0; i < 50; i++) {
            Thread producerThread = new Thread(producerRun, "Producer");
            Thread consumer1Thread = new Thread(consumer1Run, "Consumer 1");
            Thread consumer2Thread = new Thread(consumer2Run, "Consumer 2");
            Thread consumer3Thread = new Thread(consumer3Run, "Consumer 3");
            producerThread.start();
            consumer1Thread.start();
            consumer2Thread.start();
            consumer3Thread.start();
        }// end for
    
        // ***** Closing Message *****
        // System.out.println();
        // System.out.println(programinfo.getClosingMessage());
        
    } // end main
} // end Factory
