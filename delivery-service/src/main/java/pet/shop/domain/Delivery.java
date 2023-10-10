package pet.shop.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import pet.shop.DeliveryServiceApplication;
import pet.shop.domain.ProductDelivered;

@Entity
@Table(name = "Delivery_table")
@Data
//<<< DDD / Aggregate Root
public class Delivery {

    @Id
    private String orderId;

    private String status;

    private statusType statusType;

    @PostPersist
    public void onPostPersist() {
        ProductDelivered productDelivered = new ProductDelivered(this);
        productDelivered.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = DeliveryServiceApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }
}
//>>> DDD / Aggregate Root
