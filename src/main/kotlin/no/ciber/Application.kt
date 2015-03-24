package no.ciber

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import kotlin.platform.platformStatic

Configuration
ComponentScan
EnableAutoConfiguration
public open class Application {
      companion object {
        platformStatic public fun main(args: Array<String>) {
            SpringApplication.run(javaClass<Application>(), *args)
        }
    }
}

public fun main(args: Array<String>) {
    Application.main(args)
}
