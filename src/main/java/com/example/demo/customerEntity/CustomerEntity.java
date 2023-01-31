package com.example.demo.customerEntity;


import javax.persistence.*;

@Entity
@Table(name = "customer_tbl")
public class CustomerEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;


    public CustomerEntity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public CustomerEntity() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
