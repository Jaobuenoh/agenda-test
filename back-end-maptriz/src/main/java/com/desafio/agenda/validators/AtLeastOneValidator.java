package com.desafio.agenda.validators;

import com.desafio.agenda.model.Contato;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AtLeastOneValidator implements ConstraintValidator<AtLeastOne, Contato> {

    @Override
    public void initialize(AtLeastOne constraintAnnotation) {

    }

    @Override
    public boolean isValid(Contato contato, ConstraintValidatorContext context) {

        String document = contato.getDocument();
        return document != null && !document.isEmpty();
    }
}
