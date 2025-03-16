public class Student {
   int Age;
   String Name;
   String rollnumber;
   String house;

public Student(String name,int age,String rollNumber,String house){
   this.Age=age;
   this.Name=name;
   this.rollnumber=rollNumber;
   this.house=house;
}
@Override
   public String toString() {
   return "Student [Age=" + Age + ", Name=" + Name+ ", rollnumber=" + rollnumber + ", house=" + house + "]";
}

   public static void main(String[] args) {
      Student stu = new Student("kunal",22,"a24","bt road");
   System.out.println(stu);
}
   }
