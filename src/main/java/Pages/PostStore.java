package Pages;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostStore {

    private final Integer id;
    private final Integer petId;
    private final Integer quantity;
    private final String shipDate;
    private final String status;
    private final Boolean complete;

}
