package pl.komorowski.currenda.controllers.spotify;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import pl.komorowski.currenda.model.api.token.TokenResponse;

public class TokenController {

    public TokenResponse postForToken(){

        final String uri = "https://accounts.spotify.com/api/token";
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();

        headers.set("Content-Type", "application/x-www-form-urlencoded");
        headers.setBasicAuth("ZTY3ZTZjODE2ZjAyNDViYmEzZDkxOGY3NTAzODRhZWI6MjhiYTc0MjBiOGNhNDczM2JjM2VmODJhZDA5OWJhNGI=");

        HttpEntity<String> entityReq= new HttpEntity<>("grant_type=client_credentials", headers);

        ResponseEntity<TokenResponse> result = restTemplate.postForEntity(uri, entityReq, TokenResponse.class);

        return result.getBody();

    }

}
