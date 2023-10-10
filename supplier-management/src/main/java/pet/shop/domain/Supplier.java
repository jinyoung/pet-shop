package pet.shop.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import pet.shop.SupplierManagementApplication;
import pet.shop.domain.ProductSupplied;

@Entity
@Table(name = "Supplier_table")
@Data
//<<< DDD / Aggregate Root
public class Supplier {

    @Id
    private String supplierId;

    private String name;

    private List<String> productIds;

    @PostPersist
    public void onPostPersist() {
        ProductSupplied productSupplied = new ProductSupplied(this);
        productSupplied.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static SupplierRepository repository() {
        SupplierRepository supplierRepository = SupplierManagementApplication.applicationContext.getBean(
            SupplierRepository.class
        );
        return supplierRepository;
    }
}
//>>> DDD / Aggregate Root
