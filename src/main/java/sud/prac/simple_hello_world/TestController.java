package sud.prac.simple_hello_world;

import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    @Autowired
    private  SecretService secretService;

    @GetMapping("/hello-world")
    public ResponseEntity<HelloWorldModel> getHelloWorld()
    {
        HelloWorldModel modelResp = HelloWorldModel.builder().msg("HelloWorld").build();
        System.out.println("secret: "+ secretService.getSecret("sud/test/secret"));
        return ResponseEntity.ok(modelResp);
    }

    @Data
    @Builder
    static class HelloWorldModel{
        String msg;
    }


}
