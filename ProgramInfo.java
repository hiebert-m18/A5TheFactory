/* **********************************************************
 * Programmer:      Hiebert
 * Class:           CS40S
 * 
 * Assignment:      program information class
 *
 * Description:     class to print banners and closing messages
 * **********************************************************/

public class ProgramInfo {

    // *********** class constants **********

    // ********** instance variable **********

    // ********** constructors ***********
    public ProgramInfo(){
        //
    }// end default constructor

    public String getBanner(String name, String a){
        String bannerOut = "";
        
        bannerOut = "*******************************************\n";
        bannerOut += "Name:         " + name + "\n";
        bannerOut += "Class:        CS40S\n";
        bannerOut += "Assignment:   " + a + "\n";
        bannerOut += "*******************************************\n\n";         
        
        return bannerOut;
    }// end getBanner
    
    public String getClosingMessage(){
        String closing = "end of processing.\n";
        
        return closing;
    }// end getClosingMessage
}// end ProgramInfo