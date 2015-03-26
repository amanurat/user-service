package no.ciber.service

import no.ciber.domain.User

/**
 * Created by bjerke.
 */

trait UserService{

    fun getUserByEmail(email: String?): User?

    fun hasUserWithEmail(email: String?) : Boolean

}