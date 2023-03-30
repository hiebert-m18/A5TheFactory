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
        // ***** constants *******
    
        // ***** variables *****
    
        String banner = "";
        String nl = System.lineSeparator();
    
        // ***** objects *****
        
        ProgramInfo programinfo = new ProgramInfo();
    
        // ***** print banners *****
        
        System.out.println(programinfo.getBanner("Hiebert", "A5: The Factory"));
    
        // ***** Get Input *****
    
        // ***** Main Processing *****
    
        // ***** Print Formatted Output *****
    
        // ***** Closing Message *****
    
        System.out.println();
        System.out.println(programinfo.getClosingMessage());
        
    } // end main
} // end Factory
