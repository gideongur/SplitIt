import com.split.pojo.InStoreOrder;
import com.split.pojo.User;
import org.apache.http.HttpResponse;
import org.junit.Test;
import org.junit.jupiter.api.RepeatedTest;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class SplitSmockTest extends  TestBase{

    @Test
    public void createNewPayment() throws IOException {
        User tom = new User();
        tom.setUserName("test_vpos");
        tom.setPassword("Test123!");
        HttpResponse response = getBusinessAPI().CreateNewPayment(tom);
        assertEquals(response.getStatusLine().getStatusCode(),200);
    }

    @Test
    @RepeatedTest(20)
    public void CreateInStoreOrder()throws IOException{

        InStoreOrder inStoreOrder  = new InStoreOrder();
        inStoreOrder.setAmount(Integer.toString(getFaker().number().numberBetween(100,2000)));
        inStoreOrder.setCurrency("GBP");
        inStoreOrder.setOrderId("tom");
        inStoreOrder.setInstallmentOptions("PhoneOrder");
        inStoreOrder.setNumberOfInstallments("6");
        inStoreOrder.setCardnumber("4111-1111-1111-1111");
        inStoreOrder.setExpirationDate("02/22");
        inStoreOrder.setEmail(getFaker().bothify("????##@gmail.com"));
        inStoreOrder.setPhone(getFaker().phoneNumber().cellPhone());

        HttpResponse response = getBusinessAPI().CreateInStoreOrder(inStoreOrder);
    }

}
