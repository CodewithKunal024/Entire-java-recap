package equals;

public class equalsandHascodeTest {
public static void main(String[] args) {
    Person person = new Person("Kunal",18,"2441");
    Person person2 = new Person("Kunal",18,"2441");// 2 names are stored in the heap hence different referrences
if (person.equals(person2)){
    System.out.println("Equal");
}else{
    System.out.println("Not Equal");
}
}
}
