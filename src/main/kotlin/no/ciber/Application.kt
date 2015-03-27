package no.ciber

import no.ciber.validator.EmailValidator
import no.ciber.validator.ListValidator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration
import org.springframework.util.StringUtils
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
    setPropertyFromSystemVariable("DB_URL", "spring.datasource.url")
    setPropertyFromSystemVariable("DB_USER", "spring.datasource.username")
    setPropertyFromSystemVariable("DB_PW", "spring.datasource.password")
    setPropertyFromSystemVariable("DB_DDL", "spring.jpa.hibernate.ddl-auto")
    Application.main(args)
}

private fun setPropertyFromSystemVariable(systemVariable: String?, propertyName: String?) {
    var variable = System.getenv(systemVariable)
    if (!StringUtils.isEmpty(variable)) {
        System.setProperty(propertyName, variable)
    }
}
