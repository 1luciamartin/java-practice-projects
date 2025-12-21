package w12aluciamartininheritance;

import java.util.Scanner;

/*
  Inheritance Project
  Superclass: Toy
  Subclasses: TeddyBear, VideoGame, Ball
*/

class Toy {
    private String manufacturer;
    private String name;
    private String ageRange;
    private double price;
    private boolean soft;

    public Toy(String manufacturer, String name, String ageRange, double price, boolean soft) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.ageRange = ageRange;
        this.price = price;
        this.soft = soft;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public double getPrice() {
        return price;
    }

    public boolean getSoft() {
        return soft;
    }

    public void setManufacturer(String newManufacturer) {
        this.manufacturer = newManufacturer;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAgeRange(String newAgeRange) {
        this.ageRange = newAgeRange;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void setSoft(boolean newSoft) {
        this.soft = newSoft;
    }

    // This method can be overridden by subclasses
    public void printToyInfo() {
        System.out.println("Toy: " + getName());
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Age Range: " + getAgeRange());
        System.out.println("Price: " + getPrice() + "$");
        System.out.println("The toy is soft: " + getSoft());
    }
}

class TeddyBear extends Toy {
    private String color;
    private String size;
    private boolean clothes;

    public TeddyBear(String manufacturer, String name, String ageRange, double price, boolean soft,
                     String color, String size, boolean clothes) {
        super(manufacturer, name, ageRange, price, soft);
        this.color = color;
        this.size = size;
        this.clothes = clothes;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String newSize) {
        this.size = newSize;
    }

    public boolean getClothes() {
        return clothes;
    }

    public void setClothes(boolean newClothes) {
        this.clothes = newClothes;
    }

    @Override
    public void printToyInfo() {
        System.out.println("Toy: teddy bear");
        System.out.println("Teddy bear: " + getName());
        System.out.println("Color: " + getColor());
        System.out.println("Size: " + getSize());
        System.out.println("The teddy bear has clothes: " + getClothes());
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Age Range: " + getAgeRange());
        System.out.println("Price: " + getPrice() + "$");
        System.out.println("The teddy bear is soft: " + getSoft());
        System.out.println();
    }
}

class VideoGame extends Toy {
    private String console;
    private int year;
    private boolean needsInternet;

    public VideoGame(String manufacturer, String name, String ageRange, double price, boolean soft,
                     String console, int year, boolean needsInternet) {
        super(manufacturer, name, ageRange, price, soft);
        this.console = console;
        this.year = year;
        this.needsInternet = needsInternet;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String newConsole) {
        this.console = newConsole;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public boolean getNeedsInternet() {
        return needsInternet;
    }

    public void setNeedsInternet(boolean newNeedsInternet) {
        this.needsInternet = newNeedsInternet;
    }

    @Override
    public void printToyInfo() {
        System.out.println("Toy: videogame");
        System.out.println("Videogame: " + getName());
        System.out.println("In which console you can play it: " + getConsole());
        System.out.println("Year of launch: " + getYear());
        System.out.println("The videogame needs internet conectivity to play: " + getNeedsInternet());
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Age Range: " + getAgeRange());
        System.out.println("Price: " + getPrice() + "$");
        System.out.println();
    }
}

class Ball extends Toy {
    private String sport;
    private String quality;
    private boolean needsMore;

    public Ball(String manufacturer, String name, String ageRange, double price, boolean soft,
                String sport, String quality, boolean needsMore) {
        super(manufacturer, name, ageRange, price, soft);
        this.sport = sport;
        this.quality = quality;
        this.needsMore = needsMore;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String newSport) {
        this.sport = newSport;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String newQuality) {
        this.quality = newQuality;
    }

    public boolean getNeedsMore() {
        return needsMore;
    }

    public void setNeedsMore(boolean newNeedsMore) {
        this.needsMore = newNeedsMore;
    }

    @Override
    public void printToyInfo() {
        System.out.println("Toy: ball");
        System.out.println("Ball: " + getName());
        System.out.println("The main sport you can play with it: " + getSport());
        System.out.println("Quality of the ball: " + getQuality());
        System.out.println("You need more equipment to be able to play with this ball: " + getNeedsMore());
        System.out.println("Manufacturer: " + getManufacturer());
        System.out.println("Age Range: " + getAgeRange());
        System.out.println("Price: " + getPrice() + "$");
        System.out.println();
    }
}

public class W12ALuciaMartinInheritance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Starter objects (the user will overwrite the values with input)
        TeddyBear teddy = new TeddyBear("Build-A-Bear", "Tom", "For everyone (no age range)", 19.99, true,
                "brown", "big", true);
        VideoGame videogame = new VideoGame("EA Sports", "Fifa24", "For everyone (no age range)", 69.69, false,
                "PlayStation or XBox", 2024, false);
        Ball ball = new Ball("Adidas", "Basketball", "5+ years-old", 10.0, false,
                "basketball", "really good", false);

        System.out.println("Give me the information about your teddy bear toy:");
        System.out.print("Name: ");
        teddy.setName(scanner.nextLine());
        System.out.print("Manufacturer: ");
        teddy.setManufacturer(scanner.nextLine());
        System.out.print("Age range: ");
        teddy.setAgeRange(scanner.nextLine());
        System.out.print("Price (only the number with decimals): ");
        teddy.setPrice(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Soft (true or false): ");
        teddy.setSoft(scanner.nextBoolean());
        scanner.nextLine();
        System.out.print("Color: ");
        teddy.setColor(scanner.nextLine());
        System.out.print("Size: ");
        teddy.setSize(scanner.nextLine());
        System.out.print("Does it have clothes (true or false): ");
        teddy.setClothes(scanner.nextBoolean());
        scanner.nextLine();
        System.out.println();

        System.out.println("Give me the information about your videogame toy:");
        System.out.print("Name: ");
        videogame.setName(scanner.nextLine());
        System.out.print("Manufacturer: ");
        videogame.setManufacturer(scanner.nextLine());
        System.out.print("Age range: ");
        videogame.setAgeRange(scanner.nextLine());
        System.out.print("Price (only the number with decimals): ");
        videogame.setPrice(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Soft (true or false): ");
        videogame.setSoft(scanner.nextBoolean());
        scanner.nextLine();
        System.out.print("In which console you can play it: ");
        videogame.setConsole(scanner.nextLine());
        System.out.print("Year of launch: ");
        videogame.setYear(scanner.nextInt());
        scanner.nextLine();
        System.out.print("The videogame needs internet conectivity to play (true or false): ");
        videogame.setNeedsInternet(scanner.nextBoolean());
        scanner.nextLine();
        System.out.println();

        System.out.println("Give me the information about your ball toy:");
        System.out.print("Name: ");
        ball.setName(scanner.nextLine());
        System.out.print("Manufacturer: ");
        ball.setManufacturer(scanner.nextLine());
        System.out.print("Age range: ");
        ball.setAgeRange(scanner.nextLine());
        System.out.print("Price (only the number with decimals): ");
        ball.setPrice(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Soft (true or false): ");
        ball.setSoft(scanner.nextBoolean());
        scanner.nextLine();
        System.out.print("The main sport you can play with it: ");
        ball.setSport(scanner.nextLine());
        System.out.print("Quality of the ball: ");
        ball.setQuality(scanner.nextLine());
        System.out.print("You need more equipment to be able to play with this ball (true or false): ");
        ball.setNeedsMore(scanner.nextBoolean());
        scanner.nextLine();
        System.out.println();

        System.out.println("This is the information about your toy " + teddy.getName() + ":");
        teddy.printToyInfo();

        System.out.println("This is the information about your toy " + videogame.getName() + ":");
        videogame.printToyInfo();

        System.out.println("This is the information about your toy " + ball.getName() + ":");
        ball.printToyInfo();

        scanner.close();
    }
}
