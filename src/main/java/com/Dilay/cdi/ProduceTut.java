package com.Dilay.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;
@Named(value = "produceTutor ")
@ApplicationScoped
public class ProduceTut {
    @Produces // üretiyor
    public List<String> getList(){
        List<String> liste = new ArrayList<String>();
        liste.add("HTML5");
        liste.add("css3");
        liste.add("js");
        liste.add("react");
        liste.add("Angular");
        return liste;

    }
}
