package codeCampus;

import java.util.ArrayList;
import java.util.List;

import codeCampus.business.CategoryManager;
import codeCampus.business.CourseManager;
import codeCampus.core.DataBaseLogger;
import codeCampus.core.FileLogger;
import codeCampus.core.Logger;
import codeCampus.core.MailLogger;
import codeCampus.dataAccess.HibernateDao.HibernateCourseDao;
import codeCampus.dataAccess.HibernateDao.HİbernateCategoryDao;
import codeCampus.entities.Category;
import codeCampus.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception{
		Category category = new Category(1,"İsim Kontrolünden geçti");
		Course course = new  Course(1, 68, 1, 150, "İsim ve fiyat kontrolünden geçti");
		Logger[] loggers = {new FileLogger(), new DataBaseLogger(), new MailLogger()};
		
		List<Category> categories = new ArrayList<>();
		categories.add(category);
		
		List<Course> courses = new ArrayList<>();
		courses.add(course);
		
		
		CategoryManager categoryManager = new CategoryManager(new HİbernateCategoryDao(), categories, loggers);
		categoryManager.add(category);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), courses, loggers);
		courseManager.add(course);

	}

}
