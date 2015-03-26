package no.ciber.domain

import org.hibernate.validator.constraints.Length
import javax.persistence.*
import javax.validation.constraints.NotNull

Entity
Table(
        uniqueConstraints = array(
                UniqueConstraint(columnNames = * array( "email"))
        )
)
data public class AppUser (
        Id GeneratedValue var id: String? = null,
        NotNull Length(max = 32) var email: String? = null,
        NotNull Length(max = 16) var firstname: String? = null,
        NotNull Length(max = 16)var lastname: String? = null,
        ElementCollection var interests: MutableSet<Int>? = null
)