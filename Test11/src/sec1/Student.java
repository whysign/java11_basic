package sec1;

public class Student {  //extends Object 구절이 생량되어 있다.

	private int sno;	// 그러므로 모든클래스는 object 클래스를 시조 class 라고한다
	String name;
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
		
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//객체 복제시에는 반드시 clone()오버라이딩해야함.
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student clone = new Student(); //해당 객체 생성
		clone.name = this.name;	 	   //새로 생성된 객체에 모든 필드 값을 넘기기
		clone.sno =this.sno;
		return clone;				
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student su1 = (Student) obj;
			if(su1.name == this.name && su1.sno == this.sno) {
				 return true;
			}else {
				 return false;
			}
		} else {
			  return false;
		}
		
	}
	
	
	
}
