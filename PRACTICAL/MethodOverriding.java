class Animal {
   public void colour() {
      System.out.println("Animal colour");
   }
}

class Dog extends Animal {
   @Override
   public void colour() {
      System.out.println("Dog : White");
   }
}

class Cow extends Animal {
   @Override
   public void colour() {
      System.out.println("Cow : Black");
   }
}

public class MethodOverriding {
   public static void main(String[] args) {
      Animal animal = new Animal();
      animal.colour();  // Output: Animal colour

      Animal dog = new Dog();
      dog.colour();  // Output: white

	   Animal cow = new Cow();
      cow.colour();  // Output: white


   }
}
