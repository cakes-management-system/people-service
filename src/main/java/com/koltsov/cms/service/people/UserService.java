package com.koltsov.cms.service.people;

import com.koltsov.cms.starter.service.DefaultCrudService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends DefaultCrudService<User, Long> {

    protected void updateFields(User to, User from) {
        to.setLogin(from.getLogin());
        to.setFirstName(from.getFirstName());
        to.setLastName(from.getLastName());
        to.setBirthDate(from.getBirthDate());
        to.setEmail(from.getEmail());
    }
}
