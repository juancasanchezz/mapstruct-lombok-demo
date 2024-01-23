package com.cazadordigital.mapstructlombokdemo.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class GetCategory {

  private long id;

  private String name;

}
