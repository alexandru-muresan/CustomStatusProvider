package edu.alexandru.components;

import com.sun.deploy.net.HttpResponse;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alexandru on 10-Jan-16.
 */
@RestController
public class StatusController {

    @RequestMapping(value = "/getStatus/{reqestStatus}", method = RequestMethod.GET, produces = "application/json")
    public HttpStatus customStatus(@PathVariable String reqestStatus, HttpRequest request, HttpResponse response) {
        try {
            int returnStatus = Integer.parseInt(reqestStatus);
            return HttpStatus.valueOf(returnStatus);
        } catch (NumberFormatException e) {
            return HttpStatus.BAD_REQUEST;
        }
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
    public String hello() {
        return "hello";
    }
}
