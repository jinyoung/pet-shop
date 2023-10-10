package pet.shop.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;

@Data
public class DeleteCouponCommand {

    private Date issueDate;
}
