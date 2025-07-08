# Hands-on 4: Difference Between JPA, Hibernate, and Spring Data JPA

## 🟡 Java Persistence API (JPA)
- JPA is a **specification** (JSR 338) used for **storing, retrieving, and managing data** from Java objects to a database.
- It only defines how persistence should work — it **does not provide actual implementation**.
- Common JPA providers (implementations) are **Hibernate, EclipseLink, OpenJPA**, etc.
- It uses annotations like `@Entity`, `@Id`, `@Table`, etc.

---

## 🟡 Hibernate
- Hibernate is an **Object-Relational Mapping (ORM)** tool and the **most popular implementation** of JPA.
- It provides full JPA support plus **extra features** like caching, lazy/eager loading, etc.
- With Hibernate, we manage session, transaction manually.

### 🔧 Example Code using Hibernate:
```java
public Integer addEmployee(Employee employee) {
    Session session = factory.openSession();
    Transaction tx = null;
    Integer employeeID = null;

    try {
        tx = session.beginTransaction();
        employeeID = (Integer) session.save(employee);
        tx.commit();
    } catch (HibernateException e) {
        if (tx != null) tx.rollback();
        e.printStackTrace();
    } finally {
        session.close();
    }
    return employeeID;
}

Example Code using Spring Data JPA:
// Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {}

// Service
@Autowired
private EmployeeRepository employeeRepository;

@Transactional
public void addEmployee(Employee employee) {
    employeeRepository.save(employee);
}
