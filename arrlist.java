import java.util.*;
class arrlist{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("*****************************ARRAYLIST OPERATIONS*****************************");
        System.out.println("1.Add Elements to Array List");
        System.out.println("2.Insert to at given index in Array List");
        System.out.println("3.Update the elements at a given index in Array List");
        System.out.println("4.Delete the elements at a given index in Array List");
        System.out.println("5.Get the size of Array List");
        System.out.println("6.Sort the Array List");
        System.out.println("******************************************************************************");
        
        String s = "y";
        
        while (s != "n") {
            System.out.print("Choose an operation: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("value :");
                    list.add(sc.nextInt());
                    System.out.println(list);
                    break;
                
                case 2:
                    System.out.print("index, ");
                    System.out.print("value:");
                    list.add(sc.nextInt(), sc.nextInt());
                    System.out.println(list);

                    break;
    
                case 3:
                    System.out.print("index, ");
                    System.out.print("value:");
                    list.set(sc.nextInt(), sc.nextInt());
                    System.out.println(list);

                    break;
                    
                case 4:
                    System.out.print("index: ");
                    // System.out.print("value:");
                    list.remove(sc.nextInt());
                    System.out.println(list);
                    break;
    
                case 5:
                    System.out.println(list.size());
                    break;
    
                case 6:
                    Collections.sort(list);
                    System.out.println(list);
                    break;
    
                default:
                    break;
            }

            System.out.print("Continue(y/n): ");
            s = sc.next();
            // choice = sc.nextInt();
        }
        
    }
}