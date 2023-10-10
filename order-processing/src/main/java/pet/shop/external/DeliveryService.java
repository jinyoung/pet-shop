package pet.shop.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "delivery-service", url = "${api.url.delivery-service}")
public interface DeliveryService {
    @RequestMapping(method = RequestMethod.POST, path = "/deliveries")
    public void updateDeliveryStatus(@RequestBody Delivery delivery);
}
