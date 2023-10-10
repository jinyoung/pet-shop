package pet.shop.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import pet.shop.OrderProcessingApplication;
import pet.shop.domain.OrderPlaced;
import pet.shop.domain.ProductDelivered;

@Entity
@Table(name = "Order_table")
@Data
//<<< DDD / Aggregate Root
public class Order {

    @Id
    private String orderId;

    private String customerId;

    private String productId;

    private Address deliveryAddress;

    private String paymentMethod;

    private paymentMethodType paymentMethodType;

    @PostPersist
    public void onPostPersist() {
        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

        ProductDelivered productDelivered = new ProductDelivered(this);
        productDelivered.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrderProcessingApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }
}
//>>> DDD / Aggregate Root
