public class Member {
    public String name;
    public int age;

    public Member(String name, int age){
        this.name = name;
        this.age = age;
    }

//instanceOf는 객체의 타입 확인 


    @Override
    public boolean equals(Object object){
        if(object instanceof Member){
            Member member = (Member) object;
            return member.name.equals(name)&& (member.age == age);
        }else{
            return false;
        }
    }

    @Override
    public int hashCode(){
        return name.hashCode() + age;   
    }
}
