//resources-Hibernate.cfg.xml

<?xml version="1.0" encoding="UTF-8"?>
<hibernate-configuration>
  <session-factory>
    <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
    <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/mappingdb</property>
    <property name="hibernate.connection.username">root</property>
    <property name="hibernate.connection.password">root</property>
    <property name="hibernate.dialect">org.hibernate.dialect.MySQL8Dialect</property>
    <property name="show_sql">true</property>
    <property name="hibernate.hbm2ddl.auto">create</property>
    <property name="format_sql">true</property>
    <mapping class="entity.Category"/>
    <mapping class ="entity.Product"/>
  </session-factory>
</hibernate-configuration>


//Session factory-HibernateUtil.java


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory = null;
	public static SessionFactory getFactory() {
		if(sessionFactory == null) {
		try {
			
				Configuration configuration = new Configuration();
				configuration.configure();
			    sessionFactory =  configuration.buildSessionFactory();	
			
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}
		
	return sessionFactory;
}
	public static void closeFactory() {
        if (sessionFactory != null) {
            sessionFactory.close();
            System.out.println("SessionFactory closed!");
        }
    }
}
  
//PasswordHashUtil.java

//in-entity

@PrePersist
	@PreUpdate
	public void hashPasswordBeforeSave() {
	   if(password != null && !password.startsWith("$2a$"))	
	    password = PasswordHashUtil.hashPassword(password);
    }

import org.springframework.security.crypto.bcrypt.BCrypt;

public class PasswordHashUtil {
	public static String hashPassword(String plainPassword) {
		String hashedPassword = BCrypt.hashpw(plainPassword, BCrypt.gensalt(12));
		System.out.println(hashedPassword);
		return hashedPassword;
	}

	public static boolean checkPassword(String plainPassword, String hashPassword) {
		return BCrypt.checkpw(plainPassword, hashPassword);
	}
}

//DataConvetor.java


@Convert(converter = DataConvetor.class)
	private String email;
	

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import jakarta.persistence.Converter;
import jakarta.persistence.AttributeConverter;

public class DataConvetor implements AttributeConverter<String, String> {
	
	private static final String ALGORITHM = "AES";
	private static final String TRANSFORMATION = "AES/ECB/PKCS5Padding";
	private static final String SECRET_KEY = "1234567890123456"; 

	@Override
	public String convertToDatabaseColumn(String attribute) {
		try {
			if (attribute == null)
				return null;
			Cipher cipher = Cipher.getInstance(ALGORITHM);
			SecretKeySpec KeySpecification = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, KeySpecification);
			byte[] encryptedBytes = cipher.doFinal(attribute.getBytes());
			String encryptedString = Base64.getEncoder().encodeToString(encryptedBytes);
			System.out.println(encryptedString);
			return encryptedString;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}

	@Override
	public String convertToEntityAttribute(String dbData) {
		try {
			if (dbData == null)
				return null;
			Cipher cipher = Cipher.getInstance(TRANSFORMATION);
			SecretKeySpec keySpecification = new SecretKeySpec(SECRET_KEY.getBytes(), ALGORITHM);
			cipher.init(Cipher.DECRYPT_MODE, keySpecification);
			byte[] decodedBytes = Base64.getDecoder().decode(dbData);
			byte[] decryptedBytes = cipher.doFinal(decodedBytes);

			return new String(decryptedBytes);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}
}