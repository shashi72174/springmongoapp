package com.springmongoapp.springmongoapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "department")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    @Id
    private String id;
    private String departmentName;
    private String departmentDesc;

}
