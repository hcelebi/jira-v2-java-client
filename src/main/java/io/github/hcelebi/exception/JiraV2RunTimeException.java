package io.github.hcelebi.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serial;

@Getter
@AllArgsConstructor
public class JiraV2RunTimeException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = -3829641624015437540L;

    public JiraV2RunTimeException(String message) {
        super(message);
    }
}
