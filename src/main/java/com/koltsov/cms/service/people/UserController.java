package com.koltsov.cms.service.people;

import com.koltsov.cms.starter.web.controller.CrudController;
import com.koltsov.cms.starter.web.dto.user.UserCreateDto;
import com.koltsov.cms.starter.web.dto.user.UserDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController extends CrudController<User, Long, UserDto, UserCreateDto> {
}
