import java.util.*;
public class C5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Float> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        float i,n;
        float num;
        int op=0;
        do{
            System.out.println("1| Input ");
            System.out.println("2| Output ");
            System.out.println("3| Search ");
            System.out.println("4| Sort ");
            System.out.println("5| Remove ");
            System.out.println("6| Update ");
            System.out.println("Choose one option= ");
            op=sc.nextInt();
            switch(op)
            {
                case 1:
                {
                    System.out.println("Input N");
                    n=sc.nextFloat();
                    for(i=0;i<n;i++)
                    {
                        System.out.println("Input Number =");
                        num=sc.nextFloat();
                        list.add(num);
                    }
                }break;
                case 2:
                {
                    for(i=0;i<list.size();i++)
                    {
                        System.out.println("Value is = "+ list.get((int) i));
                    }
                    
                }break;
                case 3:
                {
                    System.out.println("Input number to search =");
                    float sv=sc.nextFloat();
                    System.out.println("Value = "+ list.contains(sv));
                }break;
                case 4:
                {
                    Collections.sort(list);
                    System.out.println("Value = "+ list);
                }break;
                case 5:
                {
                    System.out.println("Input Number to remove =");
                    num = sc.nextFloat();
                    list.remove(num);
                    System.out.println("remove success...!");
                }break;
                case 6:
                {
                    System.out.println("Input Number to Update = ");
                    float update=sc.nextFloat();
                    for(i=0;i<list.size();i++)
                    {
                        if(update == list.get((int) i))
                        {
                            System.out.println("Input New Value = ");
                            num=sc.nextFloat();
                            list.set((int) i, num);
                        }
                    }
                }break;
                case 7:
                {
                    
                }break;
            }
            
        }while(op != 0);
        
    }
    
}
