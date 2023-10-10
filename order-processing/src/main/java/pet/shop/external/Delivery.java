package pet.shop.external;

import java.util.Date;
import lombok.Data;

@Data
public class Delivery {

    private String orderId;
    private String status;
    private Object statusType;
}
