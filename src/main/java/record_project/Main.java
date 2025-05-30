package record_project;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Student s = new Student("E9909" + i,
                    switch (i) {
                case 1 -> "Chico";
                case 2 -> "Rusya";
                case 3 -> "Den";
                case 4 -> "Isk";
                case 5 -> "Ilii";
                        default -> "Anonymous";
                    },
                    "01/01/2005",
                    "Java MasterClass");
            System.out.println(s);
        }
    }

}
