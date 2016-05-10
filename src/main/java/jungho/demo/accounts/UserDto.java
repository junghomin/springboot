package jungho.demo.accounts;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;
import javax.validation.constraints.Size;

/**
 * Created by Jungho on 2016-05-10.
 */
public class UserDto {

    @Data
    public static class Create {
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        @NotBlank
        @Size(min = 4)
        private String username;

        @NotBlank
        @Size(min = 4)
        private String password;
    }

    @Data
    public static class Response {
        private Long id;
        private String username;
        private String fullName;
        private Date joined;
        private Date updated;
    }

    @Data
    public static class Update {
        private String password;
        private String fullName;
    }
}
