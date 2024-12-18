package com.learning.springdemo.mvc;

import com.learning.springdemo.mvc.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    @CourseCode(value = "TOPS", message = "Must Starts with TOPS")
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @NotNull(message="is required")
    @Min(value = 0, message = "Must be greater than or equal to 0")
    @Max(value = 10,message = "Must be less than or equal to 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 char/digits")
    private String postalCode;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
