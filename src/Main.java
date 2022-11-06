 public static void main(String[] args) {
        School school = new School(29, "SchoolLib");
        HeadTeacher headTeacher = new HeadTeacher(45, "Nyrgyz", Salary.MEDIUM, school);
        System.out.println(headTeacher.getInfo());
        headTeacher.mood();
        headTeacher.mood("отличное");
        System.out.println("----------------------");

        School school1 = new School(66, "KyrgyzSchool");
        Teacher teacher = new Teacher(27, "Altynai", Salary.SMALL, school1, "10 лет");
        System.out.println(teacher.getInfo());
        teacher.mood();
        teacher.mood("ужасное");
        System.out.println("---------------------");

        School school2 = new School(88, "Nlsit") ;
        Teacher teacher2 = new Teacher(40,"Moldokulov",Salary.BIG,school2,"9 лет");
        System.out.println(teacher2.getInfo());
        teacher2.mood();
        teacher2.mood("обычное");


    }

}
