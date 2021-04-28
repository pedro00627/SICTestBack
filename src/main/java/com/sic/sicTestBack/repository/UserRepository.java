/**
 * 
 */
package com.sic.sicTestBack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sic.sicTestBack.entities.User;

/**
 * @author pedro
 *
 */
public interface UserRepository extends JpaRepository<User, Long>{

}
