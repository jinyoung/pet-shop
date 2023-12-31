package pet.shop.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import pet.shop.domain.*;

@Component
public class CouponHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Coupon>> {

    @Override
    public EntityModel<Coupon> process(EntityModel<Coupon> model) {
        return model;
    }
}
