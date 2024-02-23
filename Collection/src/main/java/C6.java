import java.util.*;
public class C6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       ArrayList<String> list = new ArrayList<>();
       list.add("Etec");
       list.add("It");
       list.add("Progmming");
       list.add("Training");
       String svalue;
       int b=0;
       System.out.println("Input Value to Delete = ");
       svalue=sc.next();
       for(int i=0;i<list.size();i++)
       {
           if(svalue.equals(list.get(i)))
           {
               System.out.println(list.get(i)+"\n");
               list.remove(i);
               System.out.println(svalue + "Remove Completed");
               b=1;
               break;
           }
       }
       if(b==0)
       {
           System.out.println("Error Remove....!");
       }
    }
    
}
