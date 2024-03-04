package sec1;

public class GenericExam {

	public static void main(String[] args) {
		Generic1<Student> s =new Generic1();
		Student a= new Student("장원영" ,22 );
		s.setField1(a);
		Generic1<Teacher> t =new Generic1<>();
		t.setField1(b);
		Generic1<Integer> i =new Generic1<>();
		i.setField1(1004);
		Generic1 str =new Generic1<>();
		str.setField1("박은성");

	}

}
