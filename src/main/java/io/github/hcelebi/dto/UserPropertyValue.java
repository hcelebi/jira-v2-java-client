package io.github.hcelebi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserPropertyValue implements Serializable {

    @Serial
    private static final long serialVersionUID = -8460457018801271979L;
    private String value;
}
