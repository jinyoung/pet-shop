package pet.shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class CreateCouponCommand {

    private Date issueDate;
    private Money amount;
    private String issuer;
    private Date expiryDate;
}
