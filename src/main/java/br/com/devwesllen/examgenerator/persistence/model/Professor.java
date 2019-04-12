package br.com.devwesllen.examgenerator.persistence.model;

import net.bytebuddy.implementation.bind.annotation.Empty;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Professor extends AbstractEntity {
    @NotEmpty(message = "This field name cannot be empty")
    private String name;
    @Email(message = "This email is not valid")
    @NotEmpty(message = "This email name cannot be empty")
    @Column(unique = true)
    private String email;

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
}
