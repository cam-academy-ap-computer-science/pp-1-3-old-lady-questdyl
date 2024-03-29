/***
 * Grading comments:
 * Overall, very good.   You got the concept of reducing typing
 * by using methods, and you nested methods - which gets rid of
 * duplication.
 *  Compiles/runs: 15/15
 *  Desired output: 6/6
 *  Consistency: 2/2
 *  Efficiency:  1/2 -  You could have done even more here by a method that
 *   has "There was an old lady who swallowed a"  method.
 *  Very good effort though.
 *  24/25
 */
public class OldLady {

	public static void main(String[] args) {
		// Old Lady Rhyme
		System.out.println("There was an old lady who swallowed a fly.");
		fly();
		System.out.println("\nThere was an old lady who swallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		spider();
		System.out.println("\nThere was an old lady who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		bird();
		System.out.println("\nThere was an old lady who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
		cat();
		System.out.println("\nThere was an old lady who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
		dog();
		System.out.println("\nThere was an old lady who swallowed a horse,");
		System.out.println("She died of course!");
	}
	public static void fly() {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.");
	}
	public static void spider() {
		System.out.println("She swallowed the spider to catch the fly,");
		fly();
	}
	public static void bird() {
		System.out.println("She swallowed the bird to catch the spider,");
		spider();
	}
	public static void cat() {
		System.out.println("She swallowed the cat to catch the bird,");
		bird();
	}
	public static void dog() {
		System.out.println("She swallowed the dog to catch the cat,");
		cat();
	}
}
