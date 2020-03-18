package DataAccess;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Program {
	
	private static SessionFactory factory;

	public static void OpenConnection() {
		// TODO Auto-generated method stub

			try
			{
				factory = new Configuration().configure().buildSessionFactory();
				/*Configuration configuration = new Configuration().addClass(DataAccess.Colours.class).addClass(
						DataAccess.Customers.class).addClass(DataAccess.OrderItems.class).addClass(DataAccess.Orders.class).addClass(DataAccess.Products.class);
				configuration.configure();
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
						configuration.getProperties()).build();
				factory = configuration.buildSessionFactory(serviceRegistry);*/
			}
			catch (Throwable ex)
			{
				System.err.println("Failed to create sessionFactory object." + ex);
				throw new ExceptionInInitializerError(ex);
			}
	}
	public static List<Customers> listCustomers() throws SQLException 
	{
		Session session = factory.openSession();
		
		try
		{
			List<Customers> customers = session.createQuery("FROM Customers").list();
			return customers;
		}
		catch (Exception exception)
		{
			System.out.println(exception.getMessage());
			throw exception;
		}	
	}
	public static Customers GetCustomer(int customerNumber)
	{
		Session session = factory.openSession();
		
		try
		{
			Customers customer = (Customers)session.get(Customers.class, customerNumber);
			return customer;
		}
		catch (Exception exception)
		{
			System.out.println(exception.getMessage());
			throw exception;
		}	
	}
	public static List<Products> listProducts() throws SQLException 
	{
		Session session = factory.openSession();
		
		try
		{
			System.out.println("carrot");
			List<Products> products = session.createQuery("FROM Products").list();
			return products;
			
		}
		catch (Exception exception)
		{
			System.out.println(exception.getMessage());
			throw exception;
		}	
	}

}
