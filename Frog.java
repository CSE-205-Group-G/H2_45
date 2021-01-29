//******************************************************************************
// CLASS: Insect (Insect.java)
// Group: Group G
// AUTHOR 1: Addison Corey, tjcorey, //addison.corey@asu.edu
// AUTHOR 2: Keatyn Garton, kgarton, //kgarton@asu.edu
// AUTHOR 3: Jonathan Kilgore, jpkilgor, //jpkilgor@asu.edu
//******************************************************************************
 /**
 * Frog is a specific type of Amphibian so Frog inherits from Amphibian. Amphibian and Frog
 * are related using a generalization (or inheritance) relationship.
 *Frog implements the makeSound method and then prints out "Ribbet"
 */

public class Frog extends Amphibian {
  @Override
  public void makeSound() { 
		System.out.println("Ribbet");
  }
}