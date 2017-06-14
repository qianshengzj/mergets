package cn.com.qs.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by randy on 2017/5/26.
 */
@ResponseStatus(value= HttpStatus.NOT_IMPLEMENTED)
public class TestException extends Exception{
    public TestException() {
    }

    public TestException(String message) {
        super(message);
    }
}
