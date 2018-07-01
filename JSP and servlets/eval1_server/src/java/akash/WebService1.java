/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akash;

import static java.lang.Integer.parseInt;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author akash
 */
@WebService(serviceName = "WebService1")
public class WebService1 {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "name_check")
    public boolean name_check(String txt) {
        //return "Hello " + txt + " !";
        if (txt.equalsIgnoreCase("Akash")) {
            return true;
        }
        return false;
    }

    @WebMethod(operationName = "date_check")
    public boolean date_check(String txt) {
        //return "Hello " + txt + " !";
        String regex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        if (txt.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    @WebMethod(operationName = "bmi")
    public boolean bmi(@WebParam(name = "name") String gender, String w, String h) {
        int wt = parseInt(w);
        int ht = parseInt(h);
        // return "Hello " + txt + " !";
        //TODO fill logic
        if (gender.equalsIgnoreCase("male")) {
            if (wt > 80 && ht < 160) {
                return true;
            } else {
                return false;
            }
        }
        if (gender.equalsIgnoreCase("female")) {
            if (wt > 60 && ht < 140) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
