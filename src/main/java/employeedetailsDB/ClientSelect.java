package employeedetailsDB;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientSelect {

	
	public static void main(String[] args) {
		Configuration cfg =new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		SessionFactory factory =cfg.buildSessionFactory();
		Session session =factory.openSession();
		Employee employee = session.load(Employee.class, 2);
		System.out.println(employee);
	}
}