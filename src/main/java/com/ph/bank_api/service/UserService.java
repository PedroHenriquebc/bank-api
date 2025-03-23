package com.ph.bank_api.service;

import com.ph.bank_api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
