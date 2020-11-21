package fr.umontpellier.fds.m2.bean;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Registration {

    @NotNull
    @NotEmpty
    @Size(min=3,max=50,message = "Name must be between 3 and 50 chars")
    private String name;

    @NotNull
    @NotEmpty
    @Size(min=3,max=50,message = "Firstname must be between 3 and 50 chars")
    private String firstname;

    @NotNull
    @NotEmpty
    @Email(message = "Email should be valid. Example : alexy.lefevre@gmail.com")
    private String email;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
