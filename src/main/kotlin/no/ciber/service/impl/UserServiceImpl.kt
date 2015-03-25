package no.ciber.service.impl

import no.ciber.domain.User
import no.ciber.repository.UserRepository
import no.ciber.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * Created by bjerke.
 */
Service class UserServiceImpl : UserService {

    Autowired var userRepository: UserRepository? = null

    override fun getUserByEmail(email: String?): User? {
        return userRepository?.findByEmail(email)
    }

    override fun hasUserWithEmail(email: String?): Boolean {
        if(getUserByEmail(email) != null) {
            return true
        }
        return false
    }
}