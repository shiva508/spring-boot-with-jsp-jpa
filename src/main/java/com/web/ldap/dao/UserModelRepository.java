package com.web.ldap.dao;



import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.web.ldap.model.UserModel;


@Repository
public interface UserModelRepository<QUserModel> 
extends JpaRepository<UserModel, Integer>,CustomUserModelRepository {
public UserModel findByEmailAddress(String emailAddress);
//List<UserModel >findUserModelByUserNameAndEmailAddress(String username,String emailAddress);
//@Query("SELECT U FROM UserModel U where U.userName=?1 AND U.language=?2")
@Query("SELECT U FROM UserModel U where U.userName=:userName and U.language=:language")
public UserModel findByUserNameAndLanguage(@Param("userName")String userName,@Param("language")String language );
@Query("select u from UserModel u where u.userName like %?1")
public List<UserModel> findByUserNameEndsWith(String userName);
@Query(value="SELECT * FROM USER_MODEL WHERE USER_NAME=?1 OR EMAIL=?2",nativeQuery=true)
public List<UserModel >findUserModelByUserNameOrEmailAddress(String username,String emailAddress);
@Procedure(name="plus1inout")
public Integer explicitlyNamedPlus1inout(Integer arg);

}
