package lv.activestudio.java2.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Beans SessionFactory, TransactionManager, DataSource should be defined for Hibernate db connection
 */
@Configuration
@ComponentScan(basePackages = {"lv.activestudio.java2"})
@PropertySource("classpath:database.properties")
@EnableTransactionManagement
//TODO: in the future - add security config here
public class SpringAppConfig {

    private static final String DATABASE_PROPERTIES_FILE = "database.properties";

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public static DataSource dataSource(
            @Value("${jdbc.url}") String jdbcUrl,
            @Value("${driverClass}") String driverClass,
            @Value("${database.user.name}") String userName,
            @Value("${database.user.password}") String password) {
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(jdbcUrl);
        ds.setDriverClassName(driverClass);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }

    @Bean
    public Properties hibernateProperties(
            @Value("${hibernate.dialect}") String dialect,
            @Value("${hibernate.show_sql}") boolean showSql,
            @Value("${hibernate.format_sql}") boolean formatSql,
            @Value("${hibernate.hbm2ddl.auto}") String hbm2ddl) {

        Properties properties = new Properties();
        properties.put("hibernate.dialect", dialect);
        properties.put("hibernate.show_sql", showSql);
        properties.put("hibernate.format_sql", formatSql);
        properties.put("hibernate.hbm2ddl.auto", hbm2ddl);

        return properties;
    }

    @Bean
    public SessionFactory sessionFactory(DataSource dataSource,
                                         @Value("${hibernate.packagesToScan}") String packagesToScan,
                                         @Qualifier("hibernateProperties") Properties properties) throws Exception {
        LocalSessionFactoryBean sessionFactoryBean
                = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        sessionFactoryBean.setPackagesToScan(packagesToScan);
        sessionFactoryBean.setHibernateProperties(properties);
        sessionFactoryBean.afterPropertiesSet();
        return sessionFactoryBean.getObject();
    }

    //used for transactions. needed together with @EnableTransactionManager.
    //also, add @Transactional into @Repository (DAOImpl)
    @Bean
    public PlatformTransactionManager transactionManager(SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }
}
