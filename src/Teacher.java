public  final class Teacher extends HeadTeacher{
    private String workExperience;

    public Teacher(int age, String name, Salary salary, School school,String workExperience) {
        super(age, name, salary, school);
        this.workExperience = workExperience;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Work experience: " + workExperience;
    }
}
