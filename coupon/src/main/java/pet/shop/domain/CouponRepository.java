package pet.shop.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pet.shop.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "coupons", path = "coupons")
public interface CouponRepository
    extends PagingAndSortingRepository<Coupon, Date> {}
