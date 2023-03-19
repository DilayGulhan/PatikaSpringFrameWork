package com.Dilay.cdi;


import jakarta.enterprise.context.ConversationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

//kapsam
//yaşam süresi
//performansımızı + -
@Named
//@ApplicationScoped bütün uygulama boyunca çalışır bütün kullanıcılar
// @RequestScoped 1 istek boyunca çalışır
//@SessionScoped // 1 kullanıcı için yaşar ancak logout olduğu zaman
//@Dependent
//@ConversationScoped  belli istek boyunca yaşar
///@SessionScoped Bean'in 1 instance olmasını sağlamak için
public class ScopedTut {


}
