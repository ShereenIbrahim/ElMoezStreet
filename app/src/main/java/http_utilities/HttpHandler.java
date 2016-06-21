package http_utilities;

/**
 * Created by 3yad on 25/03/2016.
 */
public interface HttpHandler {
    public static final String ip_address="http://192.168.1.22:8084";

    public static final String SIGNUP_URL = ip_address+"/ElmoezWebService/services/elmoez/signUp";
    public static final String LOGIN_URL = ip_address+"/ElmoezWebService/services/elmoez/logIn";
    public static final String EDIT_USERNAME_URL = ip_address+"/ElmoezWebService/services/elmoez/username";
    public static final String EDIT_PASSWORD_URL = ip_address+"/ElmoezWebService/services/elmoez/password";
    public static final String EDIT_IMAGE_URL = ip_address+"/ElmoezWebService/services/elmoez/image";
    public static final String REMOVE_IMAGE_URL = ip_address+"/ElmoezWebService/services/elmoez/removeimage";

}
