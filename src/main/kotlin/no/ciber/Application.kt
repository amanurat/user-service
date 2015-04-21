package no.ciber

import no.ciber.domain.AppUser
import no.ciber.validator.EmailValidator
import no.ciber.validator.ListValidator
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration
import org.springframework.stereotype.Component
import javax.servlet.*
import javax.servlet.http.HttpServletResponse
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

    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration){
        config.exposeIdsFor(javaClass<AppUser>())
    }
}

Component
public open class CORSFilter : Filter {
    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain?) {
        response as HttpServletResponse
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        chain?.doFilter(request, response);
    }

    override fun init(filterConfig: FilterConfig?) {}

    override fun destroy() {}

}

public fun main(args: Array<String>) {
    Application.main(args)
}