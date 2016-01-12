package edu.alexandru.components;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

    @RequestMapping(value = "/getStatus/{reqestedStatus}", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json")
    public void customStatus(@PathVariable String reqestedStatus, HttpServletResponse response) throws IOException {
        try {
            int returnStatus = Integer.parseInt(reqestedStatus);

            response.setStatus(returnStatus);
        } catch (NumberFormatException e) {
            response.sendError(400, "Bad request. Status param must be integer.");
        }
    }

    @RequestMapping(value = "/hello", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json")
    public String hello(HttpServletResponse response) {
        response.setStatus(HttpStatus.OK.value());
        return "hello";
    }
}
