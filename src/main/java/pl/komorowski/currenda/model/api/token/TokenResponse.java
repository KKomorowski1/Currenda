package pl.komorowski.currenda.model.api.token;

public class TokenResponse {

    private String access_token;

    private String token_type;

    private Integer expires_in;

    private String scope;

    public TokenResponse() {
    }

    public TokenResponse(String access_token, String token_type, Integer expires_in, String scope) {
        this.access_token = access_token;
        this.token_type = token_type;
        this.expires_in = expires_in;
        this.scope = scope;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getToken_type() {
        return token_type;
    }

    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }

    public Integer getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(Integer expires_in) {
        this.expires_in = expires_in;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        return "TokenResponse{" +
                "accessToken='" + access_token + '\'' +
                ", tokenType='" + token_type + '\'' +
                ", expiresIn=" + expires_in +
                ", scope='" + scope + '\'' +
                '}';
    }
}
