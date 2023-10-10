package pet.shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import pet.shop.domain.*;
import pet.shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CouponDeleted extends AbstractEvent {

    private Date issueDate;

    public CouponDeleted(Coupon aggregate) {
        super(aggregate);
    }

    public CouponDeleted() {
        super();
    }
}
//>>> DDD / Domain Event
