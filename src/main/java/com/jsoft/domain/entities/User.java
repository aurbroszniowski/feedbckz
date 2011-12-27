package com.jsoft.domain.entities;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

/**
 * Made by aurbrsz / 12/26/11 - 17:51
 */

@NodeEntity
public class User {

  @GraphId
  Long id;

  private String pseudo;
  private String email;
  private String password;

  public User() {
  }

  public Long getId() {
    return id;
  }

  public String getPseudo() {
    return pseudo;
  }

  public void setPseudo(final String pseudo) {
    this.pseudo = pseudo;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(final String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(final String password) {
    this.password = password;
  }

  @Override
  public int hashCode() {
    return id.hashCode();
  }

  @Override
  public String toString() {
    return "User[" + getId() + "," + getPseudo() + "," + getEmail() + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    User other = (User)obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}
