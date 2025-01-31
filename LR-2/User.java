import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
class User {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private String country;
}