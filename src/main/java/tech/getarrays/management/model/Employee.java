package tech.getarrays.management.model;

import jakarta.persistence.*;

@Entity
// ExceptionInInitializerError issues with Lombok in some environments. Manually creating getters/setters for now.
public class Employee implements java.io.Serializable {

    /**
     * The serialVersionUID is a universal version identifier for a Serializable class.
     * Object relational mapping (JPA/Hibernate)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // generate unique id automatically
    @Column(nullable=false, updatable=false) // column cannot be null and cannot be updated!
    private Long id;

    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl; // stored on the server. Simply point to the location
    private String employeeCode; // UUID for each employee

    public Employee() {}

    public Employee(String imageUrl, String employeeCode, String phone, String jobTitle, String email, String name, Long id) {
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
        this.phone = phone;
        this.jobTitle = jobTitle;
        this.email = email;
        this.name = name;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
}

