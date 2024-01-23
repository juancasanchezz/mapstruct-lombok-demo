package com.cazadordigital.mapstructlombokdemo.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "category")

public class Category {

  @Id
  private long id;

  private String name;

  private boolean status;

}
