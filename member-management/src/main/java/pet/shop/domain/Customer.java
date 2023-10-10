package pet.shop.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import pet.shop.MemberManagementApplication;
import pet.shop.domain.CustomerJoined;

@Entity
@Table(name = "Customer_table")
@Data
//<<< DDD / Aggregate Root
public class Customer {

    @Id
    private String customerId;

    private String name;

    private String email;

    private String password;

    @PostPersist
    public void onPostPersist() {
        CustomerJoined customerJoined = new CustomerJoined(this);
        customerJoined.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static CustomerRepository repository() {
        CustomerRepository customerRepository = MemberManagementApplication.applicationContext.getBean(
            CustomerRepository.class
        );
        return customerRepository;
    }
}
//>>> DDD / Aggregate Root
