package pet.shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import pet.shop.domain.*;
import pet.shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CustomerJoined extends AbstractEvent {

    public CustomerJoined(Customer aggregate) {
        super(aggregate);
    }

    public CustomerJoined() {
        super();
    }
}
//>>> DDD / Domain Event
