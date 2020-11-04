import com.github.javafaker.Faker;
import com.split.Infra.BusinessAPI;

public class TestBase {

    private Faker faker;

    private BusinessAPI businessAPI;

    public TestBase(){
        businessAPI = new BusinessAPI();
        faker = new Faker();
    }

    protected BusinessAPI getBusinessAPI() {
        return businessAPI;
    }

    protected  Faker getFaker(){
        return faker;
    }
}
