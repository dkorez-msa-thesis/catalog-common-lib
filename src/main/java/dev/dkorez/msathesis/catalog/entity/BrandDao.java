package dev.dkorez.msathesis.catalog.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "BRAND")
@Data
public class BrandDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @OneToOne(mappedBy = "brand")
    private ProductDao product;
}
