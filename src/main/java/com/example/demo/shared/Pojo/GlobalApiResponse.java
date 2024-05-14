package com.example.demo.shared.Pojo;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class GlobalApiResponse<T> {
    private String message;
    private Integer statusCode;
    private T data;

}
