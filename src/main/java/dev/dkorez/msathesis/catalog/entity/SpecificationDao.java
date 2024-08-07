package dev.dkorez.msathesis.catalog.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "SPECIFICATION")
@Data
public class SpecificationDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "value")
    String value;

    @ManyToOne
    @JoinColumn(name = "product_id")
    @JsonManagedReference
    @JsonIgnore
    ProductDao product;
}
