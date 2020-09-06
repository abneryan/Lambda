package interfaces;

import data.Student;

@FunctionalInterface
public interface StudentCreater2 {
	Student creatStudent(String name, int age);
}
