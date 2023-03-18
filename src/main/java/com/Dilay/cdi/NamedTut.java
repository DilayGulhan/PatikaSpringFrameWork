package com.Dilay.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import lombok.*;
import lombok.extern.log4j.Log4j;
import jakarta.inject.Named;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

//cdi ==> bean
@Named(value = "namedTutor")
@ApplicationScoped
public class NamedTut {
    private Long namedId ;
    private String namedata  = "Merhabalar Named Cdi Bean ";

}
