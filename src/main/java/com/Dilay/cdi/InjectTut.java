package com.Dilay.cdi;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;


@Named(value ="InjectTuto" )
@ApplicationScoped
public class InjectTut {
   @Inject
    List<String>consume ;

    public List<String> getConsume() {
        return consume;
    }
}
