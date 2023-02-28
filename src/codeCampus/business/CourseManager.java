package codeCampus.business;

import java.util.ArrayList;
import java.util.List;

import codeCampus.business.abstracts.CourseService;
import codeCampus.core.Logger;
import codeCampus.dataAccess.CourseDao;
import codeCampus.entities.Course;

public class CourseManager implements CourseService{
	
	CourseDao courseDao; 
	List<Course> categories = new ArrayList<>();
	Logger[] loggers;
	
	

	public CourseManager(CourseDao courseDao, List<Course> categories,Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.categories.add(new Course(1, 68, 1, 150,"Yazılım Geliştirici Yetiştirme kampı"));
		this.categories.add(new Course(2, 80, 1, 150,"Yazılım Geliştirici Yetiştirme kampı1"));
		this.categories.add(new Course(3, 50, 1, 150,"Yazılım Geliştirici Yetiştirme kampı2"));
		
	}

	@Override
	public void add(Course course) throws Exception {
		for (Course course1 : categories) {
			if (course.getCourseName().equalsIgnoreCase(course1.getCourseName())) {
				throw new Exception("Kurs ismi aynı olamaz");
			}
			
		}
		
		if (course.getUnitPrice()<1) {
			throw new Exception("Kurs fiyatı 0'dan küçük olamaz");
		}
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
		
		courseDao.add(course);
		
	}

	@Override
	public void delete(Course course) throws Exception {
		courseDao.delete(course);
		
	}

	@Override
	public void update(Course course) throws Exception {
		courseDao.update(course);
		
	}

}
