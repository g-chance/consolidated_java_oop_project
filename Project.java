public class Project {
    private String name;
    private String description;
    private double initialCost;

    public Project() {
        Portfolio.addToPortfolio(this);
    };
    public Project(String name) {
        this.name = name;
        Portfolio.addToPortfolio(this);
    }
    public Project(String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.initialCost = cost;
        Portfolio.addToPortfolio(this);
    }

    public double getInitialCost() {
        return initialCost;
    }
    public void setInitialCost(double initialCost) {
        this.initialCost = initialCost;
    }

    public String getName() {
        return name;
    }
    public String setName(String name) {
        this.name = name;
        return this.name;
    }

    public String getDescription() {
        return description;
    }
    public String setDescription(String description) {
        this.description = description;
        return this.description;
    }


    public String elevatorPitch() {
        return name+"("+initialCost+") : "+description;
    }
}