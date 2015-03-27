package no.ciber

import no.ciber.validator.EmailValidator
import no.ciber.validator.ListValidator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration
import kotlin.platform.platformStatic

SpringBootApplication
public open class Application : RepositoryRestMvcConfiguration() {
      companion object {
        platformStatic public fun main(args: Array<String>) {
            SpringApplication.run(javaClass<Application>(), *args)
        }
    }

    Autowired var emailValidator: EmailValidator? = null

    override fun configureValidatingRepositoryEventListener(validatingListener: ValidatingRepositoryEventListener?) {
        validatingListener?.addValidator("beforeCreate", ListValidator(emailValidator))
        validatingListener?.addValidator("beforeSave", ListValidator(emailValidator))
    }
}

public fun main(args: Array<String>) {
    Application.main(args)
}
