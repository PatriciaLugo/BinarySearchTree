import java.util.Scanner;

public class BinarySearchTree
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        BinaryST bst = new BinaryST();
        System.out.println("Test of Binary Search Tree");
        String name;
        String address;
        String number;

        while(true)
        {
            System.out.println("\n Menu:");
            System.out.println("1. Insert new student information");
            System.out.println("2. Fetch and output student information");
            System.out.println("3. Delete student information");
            System.out.println("4. Update student information");
            System.out.println("5. Output all student information in descending order");
            System.out.println("6. Exit program");

            int choice = input.nextInt();
            input.nextLine();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter following new student information");
                    System.out.println("Enter student name");
                    name = input.nextLine();

                    System.out.println("Enter student address:");
                    address = input.nextLine();

                    System.out.println("Enter student GPA:");
                    number=input.nextLine();

                    bst.insert(new Listing(name,address,number));
                    break;

                case 2:
                    System.out.println("Enter student name to search:");
                    if(!bst.search(input.nextLine()))
                    {
                        System.out.println("Student not found!");
                    }
                    break;
                case 3:
                    System.out.println("Enter student name to delete:");
                    bst.delete(input.nextLine());
                    break;

                case 4:
                    System.out.println("Enter student name to update:");
                    break;

                case 5:
                    System.out.println("Students in descending order: \n\n");
                    bst.preorder();
                    break;

                case 6:
                    break;
                default:
                    System.out.println("Invalid \n");
                    break;
            }
            if (choice==6)
                break;
        }
        System.out.println("End of Program");
    }
}
