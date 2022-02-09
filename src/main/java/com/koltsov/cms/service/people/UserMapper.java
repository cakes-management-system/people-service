package com.koltsov.cms.service.people;

import com.koltsov.cms.starter.mapper.CakeMangerMapperConfig;
import com.koltsov.cms.starter.mapper.GenericMapper;
import com.koltsov.cms.starter.web.dto.user.UserCreateDto;
import com.koltsov.cms.starter.web.dto.user.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = CakeMangerMapperConfig.class)
public interface UserMapper extends GenericMapper<User, UserDto, UserCreateDto> {
    @Mapping(target = "id", ignore = true)
    @Override
    User toNewEntity(UserCreateDto createDto);
}
