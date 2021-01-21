package com.jg.rediscache;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class Student implements Serializable {

    private static final long serialVersionUID = 7171094704159801975L;

    private UUID id = UUID.randomUUID();
    private String name;
    private String lastName;
    private int age;

}
