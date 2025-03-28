package com.pbl3.supermarket.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PUBLIC)
public class ApiResponse <T>{
    @Builder.Default
    @JsonProperty
    int code = 1000;
    String message;

    T result;
}
