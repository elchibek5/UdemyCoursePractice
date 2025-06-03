package record_project;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("E9909" + i,
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

        Student pojoStudent = new Student("S234234", "Misha",
                "18/10/2004", "Java Masterclass ?");
        LPAStudent recordStudent = new LPAStudent("A12321", "Den",
                "10/10/2004", "Python Masterclass ?");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                pojoStudent.getClassList());
    }

}
