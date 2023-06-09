

//   person
// worker    student
//            HighStudent
//위와 같은 관계도를 구성하고 있다는 가정

import java.util.Arrays;

public class WildCardExample {

    public static void registerCourse(Course<?> course){ //모든 타입이 될 수 있음 
        System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseStudent(Course<? extends Student> course){ //student와 highStudent가능 
        System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
    }
    public static void registerCourseWorker(Course<? super Worker> course){ //Worker과 Person이 가능  
        System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
    }
    public static void main(String[] args) {
        Course<Person> personCourse = new Course<Person>("일반인과정", 5);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("학생"));

        Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
        workerCourse.add(new Worker("직장인"));
        
     
        Course<Student> studentCourse = new Course<Student>("학생과정", 5);
        workerCourse.add(new Student("학생"));
        workerCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> HighstudentCourse = new Course<HighStudent>("고등학생과정", 5);
 
        workerCourse.add(new HighStudent("고등학생"));

        registerCourse(personCourse);
        registerCourse(WorkerCourse);
        registerCourse(StudentCourse);
        registerCourse(HighstudentCourse);
        

        System.out.println();
        
        //가정이기때문에 실제 작동X

    }
    
}