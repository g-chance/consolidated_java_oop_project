public class ProjectTest {
    public static void main(String[] args) {
        Project project1 = new Project();
        Project project2 = new Project("Eat", "Hihi", 7.4);
        Project project3 = new Project("Sleep", "Sleep for 8 hours", 8.1);

        System.out.println(project1.elevatorPitch());
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());

        System.out.println(project1.getName());
        System.out.println(project1.setName("Cry"));
        System.out.println(project1.setDescription("Cry alot"));
        project1.setInitialCost(5.5);
        System.out.println(project1.elevatorPitch());
        project2.setInitialCost(4.7);

        Portfolio.getProjects();
        System.out.println(Portfolio.getTotalCost());
    }
}