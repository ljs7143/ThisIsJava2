class Student {
    public int sno;
    public String name;

    public Student(int sno, String name){
        this.sno = sno;
        this.name = name;
    }

    public boolean equals(Object object){
        if(object instanceof Student){
            Student student = (Student) object;
            return (sno==student.sno) && (student.name.equals(name));

        }else{
            return false;
        }
    }



    public int hashCode(){
        return sno+name.hashCode(); //학번과 이름이 같다면 동일한 객체 
        //해시코드 값은 항상 같게 나옴
    }
    
}
