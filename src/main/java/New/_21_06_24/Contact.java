package New._21_06_24;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Contact {
    private String name;
    private String surname;
    private String number;
    private String email;
}
