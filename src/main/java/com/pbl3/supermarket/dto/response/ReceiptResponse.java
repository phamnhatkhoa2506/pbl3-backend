package com.pbl3.supermarket.dto.response;


import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PUBLIC)
public class ReceiptResponse {
    List<ProductResponse> productResponseList;
    float totalPrice;
    LocalDate date;
    LocalTime time;
    CustomerResponse customerResponse;

}
