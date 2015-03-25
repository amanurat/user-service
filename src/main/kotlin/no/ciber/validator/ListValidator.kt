package no.ciber.validator

import org.springframework.validation.Errors
import org.springframework.validation.Validator

class  ListValidator<out T : Validator?>(vararg val validators:T) : Validator {
    override fun supports(clazz: Class<*>?): Boolean {
        return validators.any { it.supports(clazz) }
    }

    override fun validate(target: Any?, errors: Errors?) {
        if(target == null) return
        validators
                .filter { it.supports(target.javaClass) }
                .forEach { it.validate(target,errors) }
    }
}