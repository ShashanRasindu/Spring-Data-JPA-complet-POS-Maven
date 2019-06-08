import lk.ijse.pos.dao.CustomerDAO;
import lk.ijse.pos.entity.Customer;
import lk.ijse.pos.main.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class testDataJPA {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        CustomerDAO Cdeo = ctx.getBean(CustomerDAO.class);


//        String add = Cdeo.getTopCustomerByOrderByAddressDesc();
//        System.out.println(add);

//        List<Customer> name = Cdeo.findCustomersByNameLike("i%");
//        for (Customer names:name
//             ) {
//            System.out.println(names);
//
//        }
//        List<Customer> name = Cdeo.CustomQuary("i%");
//        for (Customer names:name
//             ) {
//            System.out.println(names);
//
//        }
//
//        List<Customer> name = Cdeo.getCustomerByNameLikeAndAddressLikeOrderByIdDesc("i%");
//        for (Customer names:name
//             ) {
//            System.out.println(names);
//
//        }
//        List<Customer> name = Cdeo.CustomerQuary2("i","p");
//        for (Customer names:name
//             ) {
//            System.out.println(names);
//
//        }

    }
}
