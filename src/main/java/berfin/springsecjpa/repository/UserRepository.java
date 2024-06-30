package berfin.springsecjpa.repository;

import berfin.springsecjpa.entities.AppUser;
import berfin.springsecjpa.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer> {

    Optional<AppUser> findByEmail(String username);

    AppUser findByRole(Role role);
}
