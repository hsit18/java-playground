class main {
    public static void main(String a[]) {

        Student student[] = new Student[3];

        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "James";
        s1.marks = 23;
        student[0] = s1;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Rahul";
        s2.marks = 44;
        student[1] = s2;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Vella";
        s3.marks = 77;
        student[2] = s3;

        for(int i=0; i<student.length; i++) {
            System.out.println(student[i].name);
        }

        for(Student n: student) {
            System.out.println(n.name);
        }
    }
}