package com.kirchnersolutions.picenter.DataRegression.entites;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Long>, JpaRepository<AppUser, Long> {

    @Query("SELECT u FROM AppUser u")
    List<AppUser> getAll();

    @Query("SELECT u.id FROM AppUser u WHERE LOWER(u.userName) = LOWER(:userName)")
    Long getUserIdByUserName(String userName);

    List<AppUser> findByUserNameAndPassword(String userName, String password);

    AppUser findByUserName(String username);

    List<AppUser> findByFirstName(String firstName);

    List<AppUser> findByLastName(String lastName);

    List<AppUser> findByFirstNameAndLastName(String firstName, String lastName);

    List<AppUser> findByCreateTimeBetween(Long start, Long stop);

    List<AppUser> findByCreateTimeLessThan(Long time);

    List<AppUser> findByCreateTimeGreaterThan(Long time);

    @Modifying
    @Query(
            "delete from AppUser u"
    )
    void truncateAppUsers();
}
