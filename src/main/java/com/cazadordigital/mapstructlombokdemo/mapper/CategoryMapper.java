package com.cazadordigital.mapstructlombokdemo.mapper;

import com.cazadordigital.mapstructlombokdemo.dto.GetCategory;
import com.cazadordigital.mapstructlombokdemo.entity.Category;
import com.cazadordigital.mapstructlombokdemo.repository.CategoryRepository;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class CategoryMapper {

  @Autowired
  private CategoryRepository categoryRepository;

  abstract GetCategory toGetCategory(Category category);

  Category toEntity(GetCategory getCategory) {
    if (getCategory == null)
      return null;

    Category category = categoryRepository.findById(getCategory.getId()).orElse(null);

    if (category == null)
      return null;

    category.setId(getCategory.getId());
    category.setName(getCategory.getName());

    return category;

  }

  abstract List<GetCategory> toGetCategoryList(List<Category> categoryList);

  abstract List<Category> toEntityList(List<GetCategory> getCategoryList);

}
