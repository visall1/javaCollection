import java.util.*;
public class Collect1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();
        list.add("ETEC");
        list.add("IT");
        list.add("Professtional");
        list.add("Training");
        list.add("Canter");
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
}
