package shop.mtcoding.product.dto.user;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.product.model.user.User;

public class RequestDto {
    @Setter
    @Getter
    public static class LoginReqDto {
        private String username;
        private String password;
    }

    @Setter
    @Getter
    public static class JoinReqDto {
        private String username;
        private String password;
        private String email;
    }
}
