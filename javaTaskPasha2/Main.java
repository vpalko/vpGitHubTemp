import java.util. *;
import java.io. *;
public class Main {
    public static void main(String[] args) {

        MediaShop mediaStuff = new MediaShop();
        ArrayList<Product> mediaThings = mediaStuff.getProducts();

        Scanner scnr = new Scanner(System. in);
        Cart shopCart = new Cart();
        boolean run = true;
        while (run) {
            System.out.println(
                "Welcome to Ninerville's busiest Media Shop! What would you like to do?"
            );
            System.out.println("\t1. Buy movies");
            System.out.println("\t2. Buy video games");
            System.out.println("\t3. Leave");

            int choice = 0;
            int age = 0;
            choice = scnr.nextInt();
            
            if (choice !=3) {
            	age = getAge();
            }
        	
            switch (choice) {
                case 1:
                    System.out.println("Here's our selection of movies");
                    boolean selectMovie = true;
                    while (selectMovie) {
                        int index = 1;
                        for (int i = 0; i < mediaThings.size(); i++) {
                            if (mediaThings.get(i)instanceof Movie) {                            	// update
                            	
                                System.out.println(
                                    "\t" + Integer.toString(index) + ". " + mediaThings.get(i).getTitle() +" - $" + mediaThings.get(i).getPrice() + ". released in: " + mediaThings.get(i).getReleaseYear() + " Rated: " + mediaThings.get(i).getAgeRating() + ". runtime " + ((Movie) mediaThings.get(i)).getRunTime()
                                );
                                index++;
                            }
                        }
                        System.out.println("\t" + Integer.toString(index) + ". Exit");
                        int selection = scnr.nextInt();
                        if (selection == index) {
                            selectMovie = false;

                        } else {
                            index = 1;
                            
                            
                            for (int i = 0; i < mediaThings.size(); i++) {
                                if (mediaThings.get(i)instanceof Movie) {
                                    if (selection == index) {
                                    	if (matchAge(mediaThings.get(i).getAgeRating(), age) == true) {
                                            shopCart.addProduct(mediaThings.get(i));
                                    	} else {
                                    		System.out.println("xxxxxxxx");
                                    	}

                                        break;
                                    }
                                    index++;
                                }
                            }
                            System.out.println("\nTotal in cart: $" + shopCart.getTotalPrice());
                        }
                    }
                    break;
                case 2:
                System.out.println("Here's our selection of games");
                    boolean selectGame = true;
                    while (selectGame) {
                        int index = 1;
                        for (int i = 0; i < mediaThings.size(); i++) {
                            if (mediaThings.get(i)instanceof Game) {
                                System.out.println(
                                    "\t" + Integer.toString(index) + ". " + mediaThings.get(i).getTitle() +" - $" + mediaThings.get(i).getPrice() + ". released in: " + mediaThings.get(i).getReleaseYear() + " Rated: " + mediaThings.get(i).getAgeRating() + ". system: " + ((Game) mediaThings.get(i)).getSystem()
                                );
                                index++;
                            }
                        }
                        System.out.println("\t" + Integer.toString(index) + ". Exit");
                        int selection = scnr.nextInt();
                        if (selection == index) {
                            selectGame = false;

                        } else {
                            index = 1;
                            for (int i = 0; i < mediaThings.size(); i++) {
                                if (mediaThings.get(i)instanceof Game) {
                                    if (selection == index) {
                                        shopCart.addProduct(mediaThings.get(i));
                                        break;
                                    }
                                    index++;
                                }
                            }
                            System.out.println("\nTotal in cart: $" + shopCart.getTotalPrice());
                        }
                    }
                    break;
                case 3:
                	scnr.close(); // UPDATE
                    System.out.println("Have a nice day!");
                    System.exit(0);
            }
        }

    }
    
    public static int getAge() {
    	System.out.println("What is your age?");
    	Scanner scnr = new Scanner(System. in);
    	int choice = 0;
    	choice =  scnr.nextInt();
        return choice;
    }
    
	public static boolean matchAge(String movieRating, int age) {
		switch (movieRating) {
		case "R":
		case "M":
			if (age < 18) {
				return false;
			}
			break;
		case "PG-13":
		case "T":
			if (age < 13) {
				return false;
			}
			break;
		default:
			return true;
		}
		return true;
	}
}