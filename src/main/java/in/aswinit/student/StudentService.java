package in.aswinit.student;

import org.springframework.stereotype.Service;

import in.aswinit.response.Student;

@Service
public class StudentService {
		public Student getStudent()
		{
			Student student=new Student(101,"aaa","aaa@gmail.com");
			return student;	
		}
}
