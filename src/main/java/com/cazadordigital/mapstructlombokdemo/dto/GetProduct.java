package com.cazadordigital.mapstructlombokdemo.dto;

public class GetProduct {

  private long id;

  private String name;

  private String creationDate;

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCreationDate() {
    return this.creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  @Override
  public String toString() {
    return "GetProduct{" +
        " id='" + getId() + "'" +
        ", name='" + getName() + "'" +
        ", creationDate='" + getCreationDate() + "'" +
        "}";
  }

}
