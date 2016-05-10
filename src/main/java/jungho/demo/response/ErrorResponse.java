package jungho.demo.response;

import lombok.Data;

import java.util.List;

/**
 * Created by Jungho on 2016-05-10.
 */
@Data
public class ErrorResponse {

    private String message;

    private String code;

    private List<FieldError> errors;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    // TODO
    public static class FieldError {
        private String field;
        private String value;
        private String reason;
    }

}
