package PrototypePattern;
public class Main {
    public static void main(String[] args) {
        Yamaha yamahaOriginal = new Yamaha("Yamaha R15", "150cc");
        System.out.println("Original Yamaha: " + yamahaOriginal);

        Yamaha yamahaClone = (Yamaha) yamahaOriginal.clone();
        yamahaClone.setModel("Yamaha R15 Version 2");
        System.out.println("Cloned Yamaha: " + yamahaClone);

        Honda hondaOriginal = new Honda("Honda CBR", "150cc");
        System.out.println("Original Honda: " + hondaOriginal);

        Honda hondaClone = (Honda) hondaOriginal.clone();
        hondaClone.setEngineType("200cc");
        System.out.println("Cloned Honda: " + hondaClone);
    }
}
