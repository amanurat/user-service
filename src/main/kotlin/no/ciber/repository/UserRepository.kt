package no.ciber.repository

import no.ciber.domain.User
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RestResource

/**
 * Created by bjerke.
 */
RestResource(rel = "user")
trait UserRepository : PagingAndSortingRepository<User, java.lang.String> {
    fun findByLastname(Param("name") name: String, pageable: Pageable): Page<User>
    fun findByFirstname(Param("name") name: String, pageable: Pageable): Page<User>
    fun findByEmail(Param("email") email: String, pageable: Pageable): Page<User>
}