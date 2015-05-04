package no.ciber.service

import no.ciber.domain.AppUser

/**
 * Created by bjerke.
 */

trait UserService{

    fun getUserByEmail(email: String?): AppUser?

    fun hasUserWithEmail(email: String?, id: Int?) : Boolean

}