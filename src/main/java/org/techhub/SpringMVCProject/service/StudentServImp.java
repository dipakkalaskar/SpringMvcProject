package org.techhub.SpringMVCProject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.SpringMVCProject.model.Student;
import org.techhub.SpringMVCProject.repo.StudentRepo;
@Service("StudentService")
public class StudentServImp implements StudentService {
	@Autowired
	StudentRepo studentRepo;

	@Override
	public boolean isAddStudent(Student s) {
		// TODO Auto-generated method stub
		boolean b=studentRepo.isAddStudent(s);
		return b;
	}
	

}
