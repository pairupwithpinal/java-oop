public class Student {
    int id;
    static String name = "Aarya";
    int grade;
    String school;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public static void name() {
        name = "Aadhya";

    }

    public void findSchoolName() {

        {
            if (name == "Aarya" && id == 35007 && grade < 4)
                school = "General wyene";
            else if (name == "Aarya" && id == 35007 && grade < 7)
                school = "5-6 Center";
            else if (name == "Aarya" && id == 35007 && grade < 9)
                school = "GVMS";
            else if (name == "Aadhya" && id == 290443 && grade < 4)
                school = "General wyene";
            else if (name == "Aadhya" && id == 290443 && grade < 7)
                school = "GVMS";
            else
                school = "GVHS";

        }

    }

    public String studentName() {


        if (id == 35007)
            name = "Aarya";
        else
            name = "Aadhya";


        return name;
    }


}






