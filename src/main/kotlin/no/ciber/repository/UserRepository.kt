package no.ciber.repository

import no.ciber.domain.AppUser
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

/**
 * Created by bjerke.
 */
RepositoryRestResource(path = "/users")
trait UserRepository : PagingAndSortingRepository<AppUser, java.lang.String>, JpaRepository<AppUser, java.lang.String> {
    fun findByEmail(Param("email") email: String?): AppUser?
}