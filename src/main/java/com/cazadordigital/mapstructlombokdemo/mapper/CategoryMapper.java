package com.cazadordigital.mapstructlombokdemo.mapper;

import com.cazadordigital.mapstructlombokdemo.dto.GetCategory;
import com.cazadordigital.mapstructlombokdemo.entity.Category;
import com.cazadordigital.mapstructlombokdemo.repository.CategoryRepository;
import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public abstract class CategoryMapper {

  @Autowired
  private CategoryRepository categoryRepository;

  @Mappings({
      @Mapping(source = "id", target = "categoryId"),
      @Mapping(source = "name", target = "categoryName")
  })

  abstract GetCategory toGetCategory(Category category);

  Category toEntity(GetCategory getCategory) {
    if (getCategory == null)
      return null;

    Category category = categoryRepository.findById(getCategory.getCategoryId()).orElse(null);

    if (category == null)
      return null;

    category.setId(getCategory.getCategoryId());
    category.setName(getCategory.getCategoryName());

    return category;

  }

  abstract List<GetCategory> toGetCategoryList(List<Category> categoryList);

  abstract List<Category> toEntityList(List<GetCategory> getCategoryList);

}
