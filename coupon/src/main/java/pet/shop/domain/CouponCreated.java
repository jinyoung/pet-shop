package pet.shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import pet.shop.domain.*;
import pet.shop.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class CouponCreated extends AbstractEvent {

    private Date issueDate;
    private Money amount;
    private String issuer;
    private Date expiryDate;

    public CouponCreated(Coupon aggregate) {
        super(aggregate);
    }

    public CouponCreated() {
        super();
    }
}
//>>> DDD / Domain Event
