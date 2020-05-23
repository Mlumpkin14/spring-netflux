package matt.springframework.springnetflux.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class MovieEvent {

    private String id;
    private Date date;
}
