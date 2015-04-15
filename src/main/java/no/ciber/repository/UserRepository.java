package no.ciber.repository;

import no.ciber.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by bjerke.
 */
@RepositoryRestResource(path = "/users")
public interface UserRepository extends PagingAndSortingRepository<AppUser, Integer>, JpaRepository<AppUser, Integer>{
    AppUser findByEmail(@Param("email") String email);
}
