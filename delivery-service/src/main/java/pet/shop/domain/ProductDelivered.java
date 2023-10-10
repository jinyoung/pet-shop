package pet.shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import pet.shop.domain.*;
import pet.shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductDelivered extends AbstractEvent {

    public ProductDelivered(Delivery aggregate) {
        super(aggregate);
    }

    public ProductDelivered() {
        super();
    }
}
//>>> DDD / Domain Event
