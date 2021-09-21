package com.yunmi.dao.mapper.base;

import java.util.List;
import com.yunmi.dao.entity.UserDO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
*  @author author
*/
@Repository
public interface UserDOBaseMapper {

    int insertUserDO(UserDO object);

    int updateUserDO(UserDO object);

    int update(UserDO.UpdateBuilder object);

    List<UserDO> queryUserDO(UserDO object);

    UserDO queryUserDOLimit1(UserDO object);

    @Select("select * from user")
    List<UserDO> queryALL();

    @Delete("delete from user where phoneNum = ${phone}")
    int deleteUser(@Param("phone") String phoneNum);

}