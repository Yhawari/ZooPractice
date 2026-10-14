import java.util.Scanner;
public class Driver {

    public static void main(String[] args) {
        int r = 0;
        Scanner scan = new Scanner(System.in);
        String Animaldescription = scan.nextLine();
        Zoo zoo = new Zoo(Animaldescription);

        System.out.println(zoo.countYoung());
        System.out.println(zoo); 

       for(int i = 0;i < zoo.getAnimals().length ;i++)
       {
            if(zoo.getAnimals()[i].getColor().equals("r"))
            {
                r++;
            }
       }

       System.out.print("The number of red animals i the Zoo " + r);
    }
}