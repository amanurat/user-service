package no.ciber.service

import no.ciber.domain.User
import org.springframework.stereotype.Service
import javax.transaction.Transactional

/**
 * Created by bjerke.
 */

trait UserService{

    fun getUserByEmail(email: String?): User?

    fun hasUserWithEmail(email: String?) : Boolean

}