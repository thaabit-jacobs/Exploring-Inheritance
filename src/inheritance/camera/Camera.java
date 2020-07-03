package inheritance.camera;

import inheritance.animals.Animal;
import inheritance.animals.mammals.Mammal;
import inheritance.animals.mammals.Monkey;
import inheritance.animals.mammals.Whale;
import inheritance.animals.reptiles.Lizard;
import inheritance.animals.reptiles.Reptile;
import inheritance.animals.reptiles.Snakes;

public class Camera {
 
	public String takePhoto(Animal animal) {
		if(animal instanceof Mammal) {
			if(animal instanceof Monkey)
				return "Monkey";
			else if(animal instanceof Whale)
				return "Whale";
			else
				return "Mammal";
			
		} else if(animal instanceof Reptile) {
			if(animal instanceof Snakes)
				return "Snake";
			else if(animal instanceof Lizard)
				return "Lizard";
			else
				return "Reptile";
		}	
		
		return "Animal";
	}
	
	public static void main(String[] args) {
		Camera cam = new Camera();
		Animal ani1 = new Animal();
		Animal mam1 = new Mammal();
		Animal rep1 = new Reptile();
		Animal snake1 = new Snakes();
		Animal liz1 = new Lizard();
		Animal mon1 = new Monkey();
		Animal whal1 = new Whale();
		
		System.out.println(cam.takePhoto(ani1));
		System.out.println(cam.takePhoto(mam1));
		System.out.println(cam.takePhoto(rep1));
		System.out.println(cam.takePhoto(snake1));
		System.out.println(cam.takePhoto(liz1));
		System.out.println(cam.takePhoto(mon1));
		System.out.println(cam.takePhoto(whal1));
		
		System.out.println(" ");
		
		System.out.println(cam.takePhoto(ani1));
		System.out.println(cam.takePhoto((Mammal)mam1));
		System.out.println(cam.takePhoto((Reptile)rep1));
		System.out.println(cam.takePhoto((Snakes)snake1));
		System.out.println(cam.takePhoto((Lizard)liz1));
		System.out.println(cam.takePhoto((Monkey)mon1));
		System.out.println(cam.takePhoto((Whale)whal1));
	}
}
