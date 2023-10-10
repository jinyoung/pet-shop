package pet.shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import pet.shop.domain.*;
import pet.shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductSearched extends AbstractEvent {

    public ProductSearched(Product aggregate) {
        super(aggregate);
    }

    public ProductSearched() {
        super();
    }
}
//>>> DDD / Domain Event
