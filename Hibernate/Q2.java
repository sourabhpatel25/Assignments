//resources-META-INF
//Persistence.XML
<?xml version="1.0" encoding="UTF-8"?>
<persistence version="3.1" xmlns="https://jakarta.ee/xml/ns/persistence">

  <!-- persistence-unit name must match the one used in your Java code -->
  <persistence-unit name="my-persistence-unit" transaction-type="RESOURCE_LOCAL">

    <!-- JPA provider (Hibernate 6 as JPA implementation) -->
    <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>

    <!-- List all your entity classes -->
    <class>com.info.jpaapp.entity.User</class>
    <class>com.info.jpaapp.entity.StudentCourse</class> 
    <properties>
      <!-- JDBC connection properties -->
      <property name="jakarta.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
      <property name="jakarta.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/testjpadb"/>
      <property name="jakarta.persistence.jdbc.user" value="root"/>
      <property name="jakarta.persistence.jdbc.password" value="root"/>
      
      <!-- Hibernate-specific properties -->
      <property name="hibernate.dialect" value="org.hibernate.dialect.MySQLDialect"/>
      <property name="hibernate.hbm2ddl.auto" value="update"/>
      <property name="hibernate.show_sql" value="true"/>
      <property name="hibernate.format_sql" value="true"/>
      
      <!-- Enabling second level cache -->
      <property name="cache.use_second_level_cache" value="false"/>
      <property name="hibernate.cache.use_query_cache" value="false"/>
      <property name="cache.region.factory_class" value="org.hibernate.cache.jcache.internal.JCacheRegionFactory"/>
      <property name="hibernate.javax.cache.provider" value="org.ehcache.jsr107.EhcacheCachingProvider"/>
    </properties>
  </persistence-unit>
</persistence>


//Dependency
<dependency>
 <groupId>org.hibernate.orm</groupId>
 <artifactId>hibernate-core</artifactId>
 <version>6.6.8.Final</version>
</dependency>

<dependency>
 <groupId>mysql</groupId>
 <artifactId>mysql-connector-java</artifactId>
 <version>8.0.22</version>
</dependency>
<!-- https://mvnrepository.com/artifact/org.springframework.security/spring-security-crypto -->
<dependency>
    <groupId>org.springframework.security</groupId>
    <artifactId>spring-security-crypto</artifactId>
    <version>5.7.1</version>
</dependency>
<!-- Ehcache 3 (works without classifier on Jakarta too) -->
		<dependency>
			<groupId>org.ehcache</groupId>
			<artifactId>ehcache</artifactId>
			<version>3.9.9</version>
		</dependency>

//JPAUtil.java

package Util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
   private static EntityManagerFactory factory = null;
   public static EntityManagerFactory getFactory() {
	   try {
		   if(factory == null)
			   factory = Persistence.createEntityManagerFactory("my-persistence-unit");
		   return factory;
	   }
	   catch(Exception e) {
		   e.printStackTrace();
		   throw new RuntimeException(e.getMessage());
	   }
   }
}