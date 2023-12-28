package com.generatiaTech.repository;

import java.util.List;

public interface UserRepository {
    com.zegasoftware.User findByUsername(String username);
    List<com.zegasoftware.User> findAll();
    com.zegasoftware.User save(com.zegasoftware.User user);
    void deleteByUsername(String username);
}
