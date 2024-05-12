import org.example.api.UserData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class RequestTest {

    private final static String url = "https://reqres.in/";
    @Test
    public void firstTest(){
        System.out.println("^_^ssssssssssssssssssssssss");
        Specifications.installSpecification(Specifications.requestSpec(url), Specifications.responseSpec());
        List<UserData> userDataList = given()
                .when()
                .get("api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);

       // userDataList.stream().forEach(x-> Assertions.assertTrue(x.getAvatar().contains(x.getId().toString())));
       // Assertions.assertTrue(userDataList.stream().allMatch(x->x.getEmail().endsWith("@reqres.in")));

        List<String> avatars = userDataList.stream().map(UserData::getAvatar).collect(Collectors.toList());
        List<String> ids = userDataList.stream().map(x->x.getId().toString()).collect(Collectors.toList());
         for(int i = 0;i < avatars.size();i++){
             Assertions.assertTrue(avatars.get(i).contains(ids.get(i)));
         }
    }
}
