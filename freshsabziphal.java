package freshsabziphal;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Iterator;

public class FreshSabziPhal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        LinkedList Vegs = new LinkedList();
        LinkedList frus = new LinkedList();
        LinkedList bag = new LinkedList();
        
        int opt;
        
        System.out.println("Welcome to the portal of fresh sabzi and Phal");
        while(true){
            System.out.println("\nSelect any number:\n\n1-\t Sabzi\n2-\t Phal\n3-\t Total items in bag\n4-\t Quit");
            System.out.print("Here_");
            opt = sc.nextInt();
            if(opt == 1){
                System.out.print("\nPlease add your favorite sabzi here: ");
                String sabz = sc.next();
                Vegs.add(sabz);
                
            }else if(opt == 2){
                System.out.print("\nPlease add your favorite phal here: ");
                String phal = sc.next();
                frus.add(phal);
                
            }else if(opt == 3){
                bag.addAll(Vegs);
                bag.addAll(frus);
                if(bag.isEmpty()){
                System.out.println("\nThere is no item added in a bag.\n");
                }else {
                    System.out.println("\nFollowing item you have added in a bag:");
                    Iterator it = bag.iterator();
                    while(it.hasNext()){
                        for(int i=1; i<=bag.size() ;i++){
                        System.out.println("\t"+ i + "-" +it.next()+"\n");
                        }
                    }
                }
            }else{
                System.out.print("\nAre you sure you want to quit? Y/N _");
                String ans = sc.next();
                if(ans.equals("Y")){
                    break;
                }
            }
        }

    }
    
}
