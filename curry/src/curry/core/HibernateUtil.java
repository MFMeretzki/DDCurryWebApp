package curry.core;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    
    /*
    private static void CreateSessionFactory()
    {
        try
        {
            Configuration cfg=new Configuration().configure("/hibernate.cfg.xml");
            StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(
                        cfg.getProperties());
            sessionFactory= cfg.buildSessionFactory(builder.build());
        }
        catch (HibernateException e)
        {
            System.err.println("Error creating Session: " + e);
            throw new ExceptionInInitializerError(e);
        }
    }
    */
    
    private static void setUp() {
    	// A SessionFactory is set up once for an application!
    	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
    			.configure() // configures settings from hibernate.cfg.xml
    			.build();
    	try {
    		sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
    	}
    	catch (Exception e) {
    		// The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
    		// so destroy it manually.
    		StandardServiceRegistryBuilder.destroy( registry );
    		throw(e);
    	}
    }

    public static SessionFactory getSessionFactory()
    {
    	if (sessionFactory == null) {
    		//CreateSessionFactory();
    		setUp();
    	}
        return sessionFactory;
    } 

}
