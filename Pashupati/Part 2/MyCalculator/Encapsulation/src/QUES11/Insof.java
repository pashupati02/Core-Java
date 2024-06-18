package QUES11;

	class Animal {}

	class Dog extends Animal {
	    static void performDowncasting(Animal animal) {
	        if (animal instanceof Dog) {
	            Dog dog = (Dog) animal; // Downcasting
	            System.out.println("Downcasting performed successfully"+dog);
	        }
	    }

	    public static void main(String[] args) {
	        Animal animal = new Dog();
	        performDowncasting(animal);
	    }
	}


