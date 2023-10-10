package pet.shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import pet.shop.domain.*;
import pet.shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
//>>> DDD / Domain Event
