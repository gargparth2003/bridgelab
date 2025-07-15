import java.util.Scanner;

public class id2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Roll No: ");
        String rollNo = sc.nextLine();
        
        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();
        
        System.out.println();
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);
        System.out.println("Branch : " + branch);
        
        sc.close();
    }
}
