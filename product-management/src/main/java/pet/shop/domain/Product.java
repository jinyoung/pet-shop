package pet.shop.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import pet.shop.ProductManagementApplication;
import pet.shop.domain.OrderPlaced;
import pet.shop.domain.ProductSearched;

@Entity
@Table(name = "Product_table")
@Data
//<<< DDD / Aggregate Root
public class Product {

    @Id
    private String productId;

    private String name;

    @Embedded
    private Money price;

    @Embedded
    private Supplier supplier;

    @PostPersist
    public void onPostPersist() {
        ProductSearched productSearched = new ProductSearched(this);
        productSearched.publishAfterCommit();

        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ProductRepository repository() {
        ProductRepository productRepository = ProductManagementApplication.applicationContext.getBean(
            ProductRepository.class
        );
        return productRepository;
    }
}
//>>> DDD / Aggregate Root
