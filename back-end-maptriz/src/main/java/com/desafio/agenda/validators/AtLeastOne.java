package com.desafio.agenda.validators;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = AtLeastOneValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface AtLeastOne {
    String message() default "CPF or CPNJ is null";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

