import com.powernode.pojo.Product;
import com.powernode.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class Tester {

    @Autowired
    ProductService productService;

    @Test
    public void test01() {
        Product product = new Product();
        product.setName("随便写！");
        productService.save(product);
    }

    @Test
    public void test02() {
        productService.delete("54");
    }

    @Test
    public void test03() {
        Product product = new Product();
        product.setName("星星的河流");
        product.setId("53");
        productService.update(product);
    }

    @Test
    public void test04() {
        Product product = productService.query(53);
        System.out.println(product);
    }

    @Test
    public void test05() {
        List<Product> products = productService.query();
        System.out.println(products);
    }
}
