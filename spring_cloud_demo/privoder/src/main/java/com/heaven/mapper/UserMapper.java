package com.heaven.mapper;

import com.heaven.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    List<User> findAll();

    User findById(Integer id);

}
