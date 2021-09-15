package com.yunmi.dao.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.yunmi.dao.entity.UserDO;
import org.springframework.stereotype.Repository;

/**
*  @author author
*/
@Mapper
@Repository
public interface UserDOBaseMapper {

    int insertUserDO(UserDO object);

    int updateUserDO(UserDO object);

    int update(UserDO.UpdateBuilder object);

    List<UserDO> queryUserDO(UserDO object);

    UserDO queryUserDOLimit1(UserDO object);

}