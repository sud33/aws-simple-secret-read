package sud.prac.simple_hello_world;

import org.springframework.stereotype.Service;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;
@Service
public class SecretService {
    private final SecretsManagerClient client;

    public SecretService() {
        // Region can also come from env/config; hardcoding here for clarity
        this.client = SecretsManagerClient.builder()
                .region(Region.of(System.getenv().getOrDefault("AWS_REGION", "us-east-1")))
                .build();
    }

    public String getSecret(String secretId) {
        var req = GetSecretValueRequest.builder().secretId(secretId).build();
        var resp = client.getSecretValue(req);
        return resp.secretString(); // If it's JSON, parse as needed
    }
}
