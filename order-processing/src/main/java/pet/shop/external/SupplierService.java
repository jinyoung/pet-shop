package pet.shop.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
    name = "supplier-management",
    url = "${api.url.supplier-management}"
)
public interface SupplierService {
    @RequestMapping(method = RequestMethod.POST, path = "/suppliers")
    public void supplyProduct(@RequestBody Supplier supplier);
}
