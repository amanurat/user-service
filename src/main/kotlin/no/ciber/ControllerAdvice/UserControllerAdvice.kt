package no.ciber.ControllerAdvice

import no.ciber.Exception.DuplicateEmailException
import no.ciber.validator.EmailValidator
import org.apache.commons.logging.Log
import org.apache.commons.logging.LogFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

/**
 * Created by bjerke.
 */

ControllerAdvice class UserControllerAdvice{

    var logger: Log = LogFactory.getLog(javaClass<UserControllerAdvice>())

    ExceptionHandler(javaClass<DuplicateEmailException>())
    fun emailExistsException(e: DuplicateEmailException): ResponseEntity<String> {
        var responseEntity: ResponseEntity<String> = ResponseEntity(e.toString(), HttpStatus.CONFLICT)
        logger.info(java.lang.String.format(e.toString()))
        return responseEntity
    }
}