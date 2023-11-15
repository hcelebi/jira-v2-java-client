package io.github.hcelebi.jirav2.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserProperty implements Serializable {
    @Serial
    private static final long serialVersionUID = 1602357708610431390L;
    private String key;
    private UserPropertyValue value;
}
