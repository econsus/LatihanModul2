import java.util.LinkedList;

public class Driver
{
    public static void main(String[] args) {
        LinkedList<String> Animal = new LinkedList<String>();
        Animal.add("Sapi");
        Animal.add("Kelinci");
        Animal.add("Kambing");
        Animal.add("Unta");
        Animal.add("Domba");

        LinkedList<String> DeleteAnimal = new LinkedList<String>();
        DeleteAnimal.add("Kelinci");
        DeleteAnimal.add("Kambing");
        DeleteAnimal.add("Unta");

        Animal.remove(DeleteAnimal.get(0));
        Animal.remove(DeleteAnimal.get(1));
        Animal.remove(DeleteAnimal.get(2));

        System.out.println(Animal);
    }
}
