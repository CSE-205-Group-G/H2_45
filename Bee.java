//******************************************************************************
// CLASS: Insect (Insect.java)
// Group: Group G
// AUTHOR 1: Addison Corey, tjcorey, //addison.corey@asu.edu
// AUTHOR 2: Keatyn Garton, kgarton, //kgarton@asu.edu
// AUTHOR 3: Jonathan Kilgore, jpkilgor, //jpkilgor@asu.edu
//******************************************************************************

 /**
 * Bee is a specific type of Insect so Frog inherits from Insect. Insect and Bee
 * are related using a generalization (or inheritance) relationship.
 *Bee implements the makeSound method and then prints out "Buzz"
 */


public class Bee extends Insect{
  @Override
  public void makeSound() { 
		System.out.println("Buzz");
  }
}