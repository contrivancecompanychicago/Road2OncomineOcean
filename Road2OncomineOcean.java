import java.util.Scanner;

public class Road2OncomineOcean {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the player's name.
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        // Create a new player object.
        Player player = new Player(name);

        // Get the player's starting location.
        System.out.println("Where do you want to start?");
        String location = scanner.nextLine();

        // Create a new map object.
        Map map = new Map(location);

        // Start the game loop.
        while (true) {
            // Display the current map.
            map.display();

            // Get the player's input.
            System.out.println("What do you want to do?");
            String input = scanner.nextLine();

            // Handle the player's input.
            switch (input) {
                case "move":
                    // Move the player.
                    player.move(map);
                    break;
                case "interact":
                    // Interact with an object.
                    player.interact(map);
                    break;
                case "quit":
                    // Quit the game.
                    System.exit(0);
                    break;
            }
        }
    }
}

class Player {

    private String name;
    private Location location;

    public Player(String name) {
        this.name = name;
        this.location = new Location();
    }

    public void move(Map map) {
        // Get the player's input.
        System.out.println("Where do you want to move?");
        String input = scanner.nextLine();

        // Move the player to the specified location.
        this.location = map.get(input);
    }

    public void interact(Map map) {
        // Get the player's input.
        System.out.println("What do you want to interact with?");
        String input = scanner.nextLine();

        // Interact with the specified object.
        map.get(input).interact(this);
    }
}

class Location {

    private String name;

    public Location() {
        this.name = "";
    }

    public Location(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Map {

    private Location[] locations;

    public Map(String location) {
        this.locations = new Location[10];
        this.locations[0] = new Location("Oncomine Ocean");
        this.locations[1] = new Location("Oncomine Island");
        this.locations[2] = new Location("Oncomine Lab");
        this.locations[3] = new Location("Oncomine City");
        this.locations[4] = new Location("Oncomine Forest");
        this.locations[5] = new Location("Oncomine Mountain");
        this.locations[6] = new Location("Oncomine Desert");
        this.locations[7] = new Location("Oncomine Swamp");
        this.locations[8] = new Location("Oncomine Cave");
        this.locations[9] = new Location("Oncomine Ruins");
    }

    public Location get(String name) {
        for (Location location : this.locations) {
            if (location.getName().equals(name)) {
                return location;
            }
        }
        return null;
    }
}
