import Application
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import kotlin.platform.platformStatic

ComponentScan
EnableAutoConfiguration
public class Application {
    class object {
        platformStatic public fun main(args: Array<String>) {
            SpringApplication.run(javaClass<Application>(), *args)
        }
    }
}