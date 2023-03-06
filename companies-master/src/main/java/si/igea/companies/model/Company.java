package si.igea.companies.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company implements Serializable {
    private Integer id;
    private String name;
    private Long pib;
    private String companyType;
}
