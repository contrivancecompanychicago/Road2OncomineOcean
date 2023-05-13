import org.openstreetmap.osmosis.core.domain.Node;
import org.openstreetmap.osmosis.core.domain.Relation;
import org.openstreetmap.osmosis.core.domain.Way;
import org.openstreetmap.osmosis.core.util.OsmUtils;

public class MushroomKingdom {

    public static void main(String[] args) {

        // Create the map
        Map map = new Map();

        // Create the kingdom
        Kingdom kingdom = new Kingdom(map);

        // Create the castle
        Castle castle = new Castle(kingdom);

        // Create the road to the castle
        Road roadToCastle = new Road(kingdom, castle);

        // Create the forest
        Forest forest = new Forest(kingdom);

        // Create the river
        River river = new River(kingdom);

        // Create the mountains
        Mountains mountains = new Mountains(kingdom);

        // Add the kingdom to the map
        map.add(kingdom);

        // Save the map
        map.save();

    }

}

class Map {

    private List<Node> nodes;
    private List<Way> ways;
    private List<Relation> relations;

    public Map() {
        this.nodes = new ArrayList<>();
        this.ways = new ArrayList<>();
        this.relations = new ArrayList<>();
    }

    public void add(Node node) {
        this.nodes.add(node);
    }

    public void add(Way way) {
        this.ways.add(way);
    }

    public void add(Relation relation) {
        this.relations.add(relation);
    }

    public void save() {
        // TODO: Save the map to a file.
    }

}

class Kingdom {

    private Map map;
    private String name;
    private List<Node> nodes;
    private List<Way> ways;
    private List<Relation> relations;

    public Kingdom(Map map) {
        this.map = map;
        this.name = "Mushroom Kingdom";
        this.nodes = new ArrayList<>();
        this.ways = new ArrayList<>();
        this.relations = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNode(Node node) {
        this.nodes.add(node);
    }

    public void addWay(Way way) {
        this.ways.add(way);
    }

    public void addRelation(Relation relation) {
        this.relations.add(relation);
    }

    public void save() {
        // TODO: Save the kingdom to the map.
    }

}

class Castle {

    private Kingdom kingdom;
    private String name;
    private List<Node> nodes;
    private List<Way> ways;
    private List<Relation> relations;

    public Castle(Kingdom kingdom) {
        this.kingdom = kingdom;
        this.name = "Mushroom Castle";
        this.nodes = new ArrayList<>();
        this.ways = new ArrayList<>();
        this.relations = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addNode(Node node) {
        this.nodes.add(node);
    }

    public void addWay(Way way) {
        this.ways.add(way);
    }

    public void addRelation(Relation relation) {
        this.relations.add(relation);
    }

    public void save() {
        // TODO: Save the castle to the kingdom.
    }

}

class Road {
}
    private Kingdom kingdom;
 
