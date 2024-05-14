package com.example.demo.pojo;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.apache.logging.log4j.message.Message;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class RolePojo {

    private String rolename ;
    private String roleType ;
}
