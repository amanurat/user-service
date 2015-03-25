package no.ciber.repository

import no.ciber.domain.User
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * Created by bjerke.
 */
RepositoryRestResource(path = "/users")
trait UserRepository : PagingAndSortingRepository<User, java.lang.String>, JpaRepository<User, java.lang.String> {
    fun findByEmail(Param("email") email: String?): User?
}