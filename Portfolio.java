import java.util.ArrayList;

public class Portfolio {
    private static ArrayList<Project> projArr = new ArrayList<Project>();
    private static double totalCost = 0;

    public static void addToPortfolio(Project project) {
        projArr.add(project);
        totalCost += project.getInitialCost();
    }



    public static void getProjects() {
        for(Project project  : projArr) {
            System.out.println("SKAJDHJKASHD "+project.elevatorPitch());
        }
    }
    public static double getTotalCost() {
        double totalCost = 0;
        for(Project project  : projArr) {
            totalCost += project.getInitialCost();
        }
        return totalCost;
    }
}