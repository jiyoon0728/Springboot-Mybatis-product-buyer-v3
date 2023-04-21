package shop.mtcoding.product.dto.user;

import lombok.Getter;
import lombok.Setter;

public class RequestDto {
    @Setter
    @Getter
    public static class LoginReqDto {
        private String username;
        private String password;
    }
}
