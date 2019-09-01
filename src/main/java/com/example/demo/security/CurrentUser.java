package com.example.demo.security;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import java.lang.annotation.*;
// L'interface qui contient l'utilisateur connecté
@Target({ ElementType.PARAMETER, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@AuthenticationPrincipal
public @interface CurrentUser {

}