package no.ciber.service.impl

import no.ciber.domain.AppUser
import no.ciber.repository.UserRepository
import no.ciber.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by bjerke.
 */
Service class UserServiceImpl : UserService {

    Autowired var userRepository: UserRepository? = null

    override fun getUserByEmail(email: String?): AppUser? {
        return userRepository?.findByEmail(email)
    }

    override fun hasUserWithEmail(email: String?, id: Int?): Boolean {
        val appUser = getUserByEmail(email)
        if(appUser == null) {
            return false
        }
        return appUser.id != id
    }
}