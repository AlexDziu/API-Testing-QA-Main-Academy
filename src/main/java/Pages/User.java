package Pages;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class User {

    private final Integer code;
    private final String type;
    private final String message;
    private final Integer id;
    private final String userName;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final String phone;
    private final Integer userStatus;

}
