package com.web.ldap.dao.DefiningRepositoryInterfaces.FinetuningRepositoryDefinition;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import com.web.ldap.model.UserModel;
@NoRepositoryBean
public interface MyBaseRepository<T,ID extends Serializable> extends Repository<T, ID>{
Optional<T>  findById(ID id);
<S extends T> S save(S entity);
}
