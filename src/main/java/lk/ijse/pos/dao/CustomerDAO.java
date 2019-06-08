package lk.ijse.pos.dao;


import lk.ijse.pos.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerDAO extends JpaRepository<Customer,String> {
//
//String  getTopCustomerByOrderByAddressDesc();

//List<Customer>  findCustomersByNameLike(String word);

//
//@Query(value = "SELECT c from Customer c where c.name like ?1")
//    List<Customer> CustomQuary(String word);
//
////List<Customer> getCustomerByNameLikeAndAddressLikeOrderByIdDesc(String con);
//
//
//
//@Query(value = "select c from Customer c where c.name like :#{#name + '%'} and  c.address like :#{#address + '%'}")
//List<Customer>  CustomerQuary2(@Param("name")String name,@Param("address") String address);

}
