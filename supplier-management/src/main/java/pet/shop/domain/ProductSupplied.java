package pet.shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import pet.shop.domain.*;
import pet.shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductSupplied extends AbstractEvent {

    public ProductSupplied(Supplier aggregate) {
        super(aggregate);
    }

    public ProductSupplied() {
        super();
    }
}
//>>> DDD / Domain Event
