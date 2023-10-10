package pet.shop.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import pet.shop.CouponApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CouponApplication.class })
public class CucumberSpingConfiguration {}
