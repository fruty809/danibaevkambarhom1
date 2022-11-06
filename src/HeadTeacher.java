public class HeadTeacher extends Director{
    private int age;
    private String name;

    public HeadTeacher(int age, String name, Salary salary, School school){
        super();
        this.age = age;
        this.name = name;
        super.setSalary(salary);
        super.setSchool(school);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public String getInfo(){
        return "age: " + getAge() + " ; Name: "  + getName() +
                " ; Salary: " + getSalary() + " ;  School Number: " + getSchool().getNumberSchool() + " : School Name: " + getSchool().getNameSchool() + " : ";
    }

    public void mood(){
        System.out.println("Настроение хорощее");
    }
    public void mood(String mood){
        System.out.println("Настроение: " + mood);
    }
}
