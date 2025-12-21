/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package w12aluciamartininheritance;

import java.util.Scanner; //we import the necesary library scanner for the program 

/**
 *
 * @author lucia
 */

class Toy { //we create our supperclass Toy that will hold 5 fields that characterize Toy objects
    private String manufacturer; //public field that stores the name of the toy's manufacturer
    private String name; //public field that stores the name of the toy
    private String ageRange; //public field that stores the toy's appropiate age range
    private double price; // public fields that stores the toy's price
    private boolean soft; //private field that stores if the toy is soft or not
   
    public Toy (String manufacturer, String name, String ageRange, double price, boolean soft){ //this is my constructor that creates a Toy object
        this.manufacturer = manufacturer; //we initialize our manufacturer field
        this.name = name; //we initialize our name field
        this.ageRange = ageRange; //we initialize our ageRange field
        this.price = price;  //we initialize our price field
        this.soft = soft;  //we initialize our soft field
    }
    public String getManufacturer(){ //this method accesses the String value of manufacturer
        return manufacturer; //it returns its String value
    }
   
    public String getName(){ //this method accesses the String value of name
        return name; //it returns its String value
    }
    
    public String getAgeRange(){ //this method accesses the String value of ageRange
        return ageRange; //it returns its String value
    }
    
    public double getPrice(){ //this method accesses the numeric value of getPrice
        return price; //it returns its double value
    }
    
    public boolean getSoft(){ //this method accesses the boolean value of soft
        return soft; //it returns its boolean value
    }
    
    public void setManufacturer(String newManufacturer) { //this is the mutator method for our manufacturer field
        this.manufacturer = newManufacturer; //we change the field's current value for the new one gotten as the method's argument
    }
    
    public void setName(String newName) { //this is the mutator method for our name field
        this.name = newName; //we change the field's current value for the new one gotten as the method's argument
    }
    
     public void setAgeRange(String newAgeRange) { //this is the mutator method for our ageRange field
         this.ageRange = newAgeRange; //we change the field's current value for the new one gotten as the method's argument
     }
    
     public void setPrice(double newPrice) { //this is the mutator method for our price field
         this.price = newPrice; //we change the field's current value for the new one gotten as the method's argument
     }
    
     public void setSoft (boolean newSoft){ //this is the mutator method for our soft field
         this.soft = newSoft; //we change the field's current value for the new one gotten as the method's argument
     }
     
    public void printToyInfo() { //Method to display toy info (can be overridden)
        System.out.println("Toy: " + getName()); //We print out the toy's name using its accessor method
        System.out.println("Manufacturer: " + getManufacturer()); //We print out the toy's manufacturer using its accessor method
        System.out.println("Age Range: " + getAgeRange()); //We print out the toy's age range using its accessor method
        System.out.println("Price: " + getPrice() + "$" ); //We print out the toy's price using its accessor method
        System.out.println("The toy is soft: " + getSoft()); //We print out if the toy is soft or not using its accessor method
    }
}

class TeddyBear extends Toy{ //we create a subclass that extends from the Toy class and its for the toys that are teddy bears
    private String color; //private field that holds the teddy bear's color
    private String size; //private field that holds the teddy bear's size
    private boolean clothes; //private field that defines if our teddy bear object has clothes or not
    
     //the following line is my constructor that creates a teddyBear object
    public TeddyBear(String manufacturer, String name, String ageRange, double price, boolean soft, String color, String size, boolean clothes) {
        super(manufacturer, name, ageRange, price, soft); //we use inheritance to get the 5 fields from the superclass Toy's constructors
        this.color = color; //we initialize our color field
        this.size = size; //we initialize our size field
        this.clothes = clothes; //we initialize our clothes field
    }
    
    public String getColor(){//this method accesses the String value of color
        return color; //it returns its String value
    }
    
    public void setColor(String newColor) { //this is the mutator method for our color field
        this.color = newColor; //we change the field's current value for the new one gotten as the method's argument
    }
    
    public String getSize(){ //this method accesses the String value of size
        return size; //it returns its String value
    }
    
    public void setSize(String newSize) { //this is the mutator method for our size field
        this.size = newSize; //we change the field's current value for the new one gotten as the method's argument
    }
    
    public boolean getClothes(){ //this method accesses the boolean value of clothes
        return clothes; //it returns its boolean value
    }
    
    public void setClothes(boolean newClothes) { //this is the mutator method for our clothes field
        this.clothes = newClothes; //we change the field's current value for the new one gotten as the method's argument
    }
    @Override
    public void printToyInfo() { //Method to display toy info (overriddes the one from superclass Toy)
        System.out.println("Toy: teddy bear"); //We print out the type of toy according to our object
        System.out.println("Teddy bear: " + getName()); //We print out the toy's name using its accessor method
        System.out.println("Color: " + getColor()); //We print out the toy's color using its accessor method
        System.out.println("Size: " + getSize()); //We print out the toy's size using its accessor method
        System.out.println("The teddy bear has clothes: " + getClothes()); //We print out if the toy has clothes or not using its accessor method
        System.out.println("Manufacturer: " + getManufacturer()); //We print out the toy's manufacturer using its accessor method
        System.out.println("Age Range: " + getAgeRange() ); //We print out the toy's age range using its accessor method
        System.out.println("Price: " + getPrice() + "$" ); //We print out the toy's price using its accessor method
        System.out.println("The teddy bear is soft: " + getSoft()); //We print out if the toy is soft using its accessor method
        System.out.println("");//we print out an empty line for better structure and order in the output
        
    } 
}
    
class VideoGame extends Toy{ //we create a subclass that extends from the Toy class and its for the toys that are videogames
    private String console; //private field that holds in which console can the videogame be played
    private int year; //private field that holds the videogame's year of release
    private boolean needsInternet; //private field that defines if our videogame object needs internet to be able to play or not
    
    //the following line is my constructor that creates a videoGame object
    public VideoGame(String manufacturer, String name, String ageRange, double price, boolean soft, String console, int year, boolean needsInternet) {
        super(manufacturer, name, ageRange, price, soft); //we use inheritance to get the 5 fields from the superclass Toy's constructors
        this.console = console; //we initialize our console field
        this.year = year; //we initialize our year field
        this.needsInternet = needsInternet; //we initialize our needsInternet field
    }
    
    public String getConsole(){ //this method accesses the String value of console
        return console; //it returns its String value
    }
    
    public void setConsole(String newConsole) { //this is the mutator method for our console field
        this.console = newConsole; //we change the field's current value for the new one gotten as the method's argument
    }
    
    public int getYear(){ //this method accesses the String value of year
        return year; //it returns its String value
    }
    
    public void setYear(int newYear) { //this is the mutator method for our year field
        this.year = newYear; //we change the field's current value for the new one gotten as the method's argument
    }
    
    public boolean getNeedsInternet(){ //this method accesses the boolean value of needsInternet
        return needsInternet; //it returns its boolean value
    }
    
    public void setNeedsInternet(boolean newNeedsInternet) { //this is the mutator method for our needsInternet field
        this.needsInternet = newNeedsInternet; //we change the field's current value for the new one gotten as the method's argument
    }
    @Override
    public void printToyInfo() { //Method to display toy info (overriddes the one from superclass Toy)
        System.out.println("Toy: videogame"); //We print out the type of toy according to our object
        System.out.println("Videogame: " + getName()); //We print out the toy's name using its accessor method
        System.out.println("In which console you can play it: " + getConsole()); //We print out in which console you can play this game using its accessor method
        System.out.println("Year of launch: " + getYear()); //We print out the toy's year of launch using its accessor method
        System.out.println("The videogame needs internet conectivity to play: " + getNeedsInternet()); //We print out if the game needs internet to work using its accessor method
        System.out.println("Manufacturer: " + getManufacturer()); //We print out the toy's manufacturer using its accessor method
        System.out.println("Age Range: " + getAgeRange()); //We print out the toy's age range using its accessor method
        System.out.println("Price: " + getPrice() + "$" ); //We print out the toy's price using its accessor method
        System.out.println(""); //we print out an empty line for better structure and order in the output
        
    } 
}

class Ball extends Toy{ //we create a subclass that extends from the Toy class and its for the toys that are balls
    private String sport; //private field that holds which sport you can play with the ball
    private String quality; //private field that holds the ball's quality
    private boolean needsMore; //private field that defines if we need more equipment to be able to play with the ball or not
    
    //the following line is my constructor that creates a ball object
    public Ball(String manufacturer, String name, String ageRange, double price, boolean soft, String sport, String quality, boolean needsMore) {
        super(manufacturer, name, ageRange, price, soft); //we use inheritance to get the 5 fields from the superclass Toy's constructors
        this.sport = sport; //we initialize our sport field
        this.quality = quality; //we initialize our quality field
        this.needsMore = needsMore; //we initialize our needsMore field
    }
    
    public String getSport(){  //this method accesses the String value of sport
        return sport; //it returns its String value
    }
    
    public void setSport(String newSport) {//this is the mutator method for our sport field
        this.sport = newSport; //we change the field's current value for the new one gotten as the method's argument
    }
    
    public String getQuality(){ //this method accesses the String value of quality
        return quality; //it returns its String value
    }
    
    public void setQuality(String newQuality) { //this is the mutator method for our quality field
        this.quality = newQuality; //we change the field's current value for the new one gotten as the method's argument
    }
    
    public boolean getNeedsMore(){ //this method accesses the boolean value of needsMore
        return needsMore; //it returns its boolean value
    }
    
    public void setNeedsMore(boolean newNeedsMore) { //this is the mutator method for our needsMore field
        this.needsMore = newNeedsMore; //we change the field's current value for the new one gotten as the method's argument
    }
    @Override
    public void printToyInfo() { //Method to display toy info (overriddes the one from superclass Toy)
        System.out.println("Toy: ball"); //We print out the type of toy according to our object
        System.out.println("Ball: " + getName()); //We print out the toy's name using its accessor method
        System.out.println("The main sport you can play with it: " + getSport()); //We print out the sport you can play with the ball using its accessor method
        System.out.println("Quality of the ball: " + getQuality()); //We print out the toy's quality using its accessor method
        System.out.println("You need more equipment to be able to play with this ball: " + getNeedsMore()); //We print out if you need more equipment to be able to play with the ball using its accessor method
        System.out.println("Manufacturer: " + getManufacturer()); //We print out the toy's manufacturer using its accessor method
        System.out.println("Age Range: " + getAgeRange()); //We print out the toy's age range using its accessor method
        System.out.println("Price: " + getPrice() + "$" ); //We print out the toy's price using its accessor method
        System.out.println(""); //we print out an empty line for better structure and order in the output
        
    } 
}

public class W12ALuciaMartinInheritance { //start of main class

    
    public static void main(String[] args) { //start of main method
        
        Scanner scanner = new Scanner(System.in); //we create a new scanner called scanner to read our input
        
        /*in the following three lines, we will create three different objects for our 3 different subclasses with some initial values that can
        be changed by hte user later in this main method (with our mutator methods*/
        TeddyBear teddy = new TeddyBear("Build-A-Bear", "Tom", "For everyone (no age range)", 19.99 , true, "brown", "big", true);
        VideoGame videogame = new VideoGame("EA Sports", "Fifa24", "For everyone (no age range)", 69.69, false, "PlayStation or XBox", 2024, false);
        Ball ball = new Ball ("Adidas", "Basketball", "5+ years-old", 10.0, false, "basketball", "really good", false);
    
        System.out.println("Give me the information about your teddy bear toy: "); //we ask for input to change the fields of our teddyBear object
        System.out.println("Name: "); //we ask for the name
        teddy.setName(scanner.nextLine()); //we mutate our name field passing the input to its mutator method
        System.out.println("Manufacturer: "); //we ask for the manufacturer
        teddy.setManufacturer(scanner.nextLine()); //we mutate our manufacturer field passing the input to its mutator method
        System.out.println("Age range: "); //we ask for the age range
        teddy.setAgeRange(scanner.nextLine()); //we mutate our age range field passing the input to its mutator method
        System.out.println("Price (only the number with decimals): "); //we ask for the price
        teddy.setPrice(scanner.nextDouble()); //we mutate our price field passing the input to its mutator method
        scanner.nextLine(); //we scan the next empty line to avoid errors
        System.out.println("Soft (true or false): "); //we ask if its soft
        teddy.setSoft(scanner.nextBoolean()); //we mutate our soft field passing the input to its mutator method
        scanner.nextLine(); //we scan the next empty line to avoid errors
        System.out.println("Color: "); //we ask for the color
        teddy.setColor(scanner.nextLine()); //we mutate our color field passing the input to its mutator method
        System.out.println("Size: "); //we ask for the size
        teddy.setSize(scanner.nextLine()); //we mutate our size field passing the input to its mutator method
        System.out.println("Does it have clothes (true or false): "); //we ask if it has clothes
        teddy.setClothes(scanner.nextBoolean()); //we mutate our clothes field passing the input to its mutator method
        scanner.nextLine(); //we scan the next empty line to avoid errors
        System.out.println(""); //we print out an empty line for better structure and order in the output
        
        
        System.out.println("Give me the information about your videogame toy: "); //we ask for input to change the fields of our videogame object
        System.out.println("Name: "); //we ask for the name
        videogame.setName(scanner.nextLine()); //we mutate our name field passing the input to its mutator method
        System.out.println("Manufacturer: "); //we ask for the manufacturer
        videogame.setManufacturer(scanner.nextLine()); //we mutate our manufacturer field passing the input to its mutator method
        System.out.println("Age range: "); //we ask for the name
        videogame.setAgeRange(scanner.nextLine()); //we mutate our ageRange field passing the input to its mutator method
        System.out.println("Price (only the number with decimals): "); //we ask for the price
        videogame.setPrice(scanner.nextDouble()); //we mutate our price field passing the input to its mutator method
        scanner.nextLine(); //we scan the next empty line to avoid errors
        System.out.println("Soft (true or false): "); //we ask for the soft
        videogame.setSoft(scanner.nextBoolean()); //we mutate our soft field passing the input to its mutator method
        scanner.nextLine(); //we scan the next empty line to avoid errors
        System.out.println("In which console you can play it: "); //we ask for the console in which you can play with this videogame
        videogame.setConsole(scanner.nextLine()); //we mutate our console field passing the input to its mutator method
        System.out.println("Year of launch: "); //we ask for the year it launched
        videogame.setYear(scanner.nextInt()); //we mutate our year field passing the input to its mutator method
        scanner.nextLine(); //we scan the next empty line to avoid errors
        System.out.println("The videogame needs internet conectivity to play (true or false): "); //we ask if it needs internet to be able to play
        videogame.setNeedsInternet(scanner.nextBoolean()); //we mutate our needsInternet field passing the input to its mutator method
        scanner.nextLine(); //we scan the next empty line to avoid errors
        System.out.println(""); //we print out an empty line for better structure and order in the output
        
        System.out.println("Give me the information about your ball toy: "); //we ask for input to change the fields of our ball object
        System.out.println("Name: "); //we ask for the name
        ball.setName(scanner.nextLine()); //we mutate our name field passing the input to its mutator method
        System.out.println("Manufacturer: "); //we ask for the name
        ball.setManufacturer(scanner.nextLine()); //we mutate our manufacturer field passing the input to its mutator method
        System.out.println("Age range: "); //we ask for the name
        ball.setAgeRange(scanner.nextLine()); //we mutate our ageRange field passing the input to its mutator method
        System.out.println("Price (only the number with decimals): "); //we ask for the name
        ball.setPrice(scanner.nextDouble()); //we mutate our price field passing the input to its mutator method
        scanner.nextLine(); //we scan the next empty line to avoid errors
        System.out.println("Soft (true or false): "); //we ask for the name
        ball.setSoft(scanner.nextBoolean()); //we mutate our soft field passing the input to its mutator method
        scanner.nextLine(); //we scan the next empty line to avoid errors
        System.out.println("The main sport you can play with it: "); //we ask for the name
        ball.setSport(scanner.nextLine()); //we mutate our sport field passing the input to its mutator method
        System.out.println("Quality of the ball: "); //we ask for the name
        ball.setQuality(scanner.nextLine()); //we mutate our quality field passing the input to its mutator method
        System.out.println("You need more equipment to be able to play with this ball (true or false): "); //we ask for the name
        ball.setNeedsMore(scanner.nextBoolean()); //we mutate our needsMore field passing the input to its mutator method
        scanner.nextLine(); //we scan the next empty line to avoid errors
        System.out.println("");  //we print out an empty line for better structure and order in the output
        
        System.out.println(""); //we print out an empty line for better structure and order in the output
        System.out.println("This is the information about your toy "+teddy.getName()+":"); //we print information about what we are about to display in the output
        teddy.printToyInfo(); //we call the printToyInfo method for our teddy object
        System.out.println(""); //we print out an empty line for better structure and order in the output
        System.out.println("This is the information about your toy "+videogame.getName()+":"); //we print information about what we are about to display in the output
        videogame.printToyInfo(); //we call the printToyInfo method for our videogame object
        System.out.println(""); //we print out an empty line for better structure and order in the output
        System.out.println("This is the information about your toy "+ball.getName()+":"); //we print information about what we are about to display in the output
        ball.printToyInfo(); //we call the printToyInfo method for our ball object
        System.out.println(""); //we print out an empty line for better structure and order in the output
    }
    
}




