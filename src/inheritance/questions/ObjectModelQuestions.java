package inheritance.questions;

import inheritance.animals.Animal;
import inheritance.animals.mammals.Mammal;
import inheritance.animals.mammals.Monkey;
import inheritance.animals.mammals.Whale;
import inheritance.animals.reptiles.Lizard;
import inheritance.animals.reptiles.Reptile;
import inheritance.animals.reptiles.Snakes;

public class ObjectModelQuestions {
	
	public static void main(String[] args) {
		//For which classes can Animal be used for as a reference?
		Animal a1 = new Animal();
		Animal ma1 = new Mammal();
		Animal w1 = new Whale();
		Animal mo1 = new Monkey();
		Animal r1 = new Reptile();
		Animal s1 = new Snakes();
		Animal l1 = new Lizard();
		//all subclasses of Animal can use animal as a reference
		
		//For which classes can Mammal be used for as a reference?
		/*
		Mammal a2 = new Animal(); 
		Mammal ma2 = new Mammal();
		Mammal w2 = new Whale();
		Mammal mo2 = new Monkey();
		Mammal r2 = new Reptile();
		Mammal s2 = new Snakes();
		Mammal l2 = new Lizard();
		/*
		 * Mammal can only be used as a reference for its subclasses and its self Mammal, Whale, Monkey
		 * Mammal can not be used as a reference for Animal
		 * Mammal can not be used as a reference for Reptile, Snake, Lizard
		 */
		
		/*
		Reptile a3 = new Animal(); 
		Reptile ma3 = new Mammal();
		Reptile w3 = new Whale();
		Reptile mo3 = new Monkey();
		Reptile r3 = new Reptile();
		Reptile s3 = new Snakes();
		Reptile l3 = new Lizard();
		*/
		/*
		 * Reptile can only be used as a reference for its subclasses and its self Reptile, Snake, Lizard
		 * Reptile can not be used as a reference for Animal
		 * Reptile can not be used as a reference for Mammal, Whale, Monkey
		 */
		 
		Mammal w4 = (Mammal)new Whale();
		Mammal mo4 = (Mammal)new Monkey();
		/*
		 * Whale and Monkey class can be cast to Mammal
		 */
		
		Reptile s5 = (Reptile)new Snakes();
		Reptile l5 = (Reptile)new Lizard();
		/*
		 * Snake and lizard can be cast to Reptile
		 */
		
		//Methods
		/*
		 * Animal m6 = new Mammal();
		 * m6.eat();
		 * m6.areWarmBlooded();
		 * Mammal is a subtype of animal therefore it call eat and its own areWarmBlooded
		 */
		
		/*
		 * Animal r6 = new Reptile();
		 * r6.eat();
		 * r6.areColdBlooded();
		 * Reptile is a subtype of animal therefore it call eat and its own areColdBlooded
		 */
		
		/*
		 * Animal w6 = new Whale();
		 * w6.eat();
		 * w6.areWarmBlooded();
		 * w6.swim()
		 * Whale is a subtype of animal and mammal therefore it call eat, areColdBlooded and its own swim method
		 */
		
		/*
		 * Animal m6 = new Monkey();
		 * m6.eat();
		 * m6.areWarmBlooded();
		 * m6.climb()
		 * Monkey is a subtype of animal and mammal therefore it call eat, areColdBlooded and its own climb method
		 */
		
		/*
		 * Animal s6 = new Snake();
		 * s6.eat();
		 * ws.areColdBlooded();
		 * s6.hiss()
		 * Snake is a subtype of animal and reptile therefore it call eat, areColdBlooded and its own hiss method
		 */
		
		/*
		 * Animal l6 = new Lizard();
		 * l6.eat();
		 * l6.areColdBlooded();
		 * l6.detachTail()
		 * Lizard is a subtype of animal and reptile therefore it call eat, areColdBlooded and its own detachTail method
		 */
	}
}
