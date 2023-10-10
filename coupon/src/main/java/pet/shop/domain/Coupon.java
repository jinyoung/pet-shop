package pet.shop.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import pet.shop.CouponApplication;
import pet.shop.domain.CouponCreated;
import pet.shop.domain.CouponDeleted;

@Entity
@Table(name = "Coupon_table")
@Data
//<<< DDD / Aggregate Root
public class Coupon {

    @Id
    private Date issueDate;

    private Money amount;

    private String issuer;

    private Date expiryDate;

    @PostPersist
    public void onPostPersist() {
        CouponCreated couponCreated = new CouponCreated(this);
        couponCreated.publishAfterCommit();

        CouponDeleted couponDeleted = new CouponDeleted(this);
        couponDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static CouponRepository repository() {
        CouponRepository couponRepository = CouponApplication.applicationContext.getBean(
            CouponRepository.class
        );
        return couponRepository;
    }
}
//>>> DDD / Aggregate Root
