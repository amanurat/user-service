package no.ciber.validator

import no.ciber.Exception.DuplicateEmailException
import no.ciber.domain.AppUser
import no.ciber.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.validation.Errors
import org.springframework.validation.Validator

Component class EmailValidator : Validator {

    val userService: UserService

    Autowired constructor(userService: UserService){ this.userService = userService }

    override fun supports(clazz: Class<*>): Boolean {
        return clazz.equals(javaClass<AppUser>())
    }

    override fun validate(target: Any?, errors: Errors?) {
        when (target) {
            is AppUser -> {
                validateEmail(target)
            }
        }
    }

    private fun validateEmail(target: AppUser) {
        if (userService.hasUserWithEmail(target.email, target.id)) {
            throw DuplicateEmailException("Email already exists")
        }
    }
}