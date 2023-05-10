package memory;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataService service = new LocalMemoryService();


        while (true){
            String next = scanner.next();
            if("exit".equals(next)){
                break;
            }else if ("get" .equals(next)) {
                try {
                    System.out.println(service.get());
                }catch (NoSuchElementException e) {
                    System.out.println("NO");
                }
            }else {
                try {
                    service.add(next);
                }catch (LowMemoryException e){
                    System.out.println("Memory full");
                }

            }
        }
    }
}
//Myclass class = new Myclass();
//class.MyMethod;