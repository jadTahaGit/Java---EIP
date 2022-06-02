import java.io.IOException;

public class exceptions {
//    Superklasse Exception
//    Kindklassen: RuntimeException, IOException
//
//    Superklasse RuntimeException
//    Kindklassen: IllegalArgumentException, ArithmeticException


//    Vervollständigen Sie den folgenden Code, so dass eine IllegalArgumentException ausgelöst wird wenn eine null-Referenz gefunden wird.
public static void main(String[] args) {
    String argument2022= "asfdsa";
    check(argument2022);

}


    public static void check (String argument){
        if(argument == null ){ // 1
            System.out.println("done");
            throw new IllegalArgumentException(); // 2
        }
    }
}

// ___ //1
// throw IllegalArgumentException



 try{... //1
 }
 catch( IllegalArgumentException e2) { //2,3
 System.out.println("IllegalArgumentException ist aufgetreten");
 }
 catch ( RuntimeException e1) { //4,5
     System.out.println("RuntimeException ist aufgetreten");
 }
 finally{ //6
    o.aufraeumen();
 }



// 11
// nein
// ja
// nein
//synchronied

//Also ich hab's gerade geprüft: Der Code bei der 11c)
// läuft ohne Probleme durch. D.h. ein ungestarteter Thread gilt als terminated
// bzgl join()

// kein Deadlock
// Kein RaceCondition
// Beenden -> ja
// nein thread 2 nicht