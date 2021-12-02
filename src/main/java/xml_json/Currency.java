package xml_json;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Currency {
    private String name;
    private int unit;
    private String currencyCode;
    private String country;
    private double rate;
    private double change;
}
