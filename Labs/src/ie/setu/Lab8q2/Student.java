package ie.setu.Lab8q2;

public class Student extends Person {
	//attributes
		private String course;

		public Student(String name, String course) {
			super(name);
			this.course = course;
		}

		@Override
		public String getDiscription() {
			return "A student studying " + course;
			
		}
}
