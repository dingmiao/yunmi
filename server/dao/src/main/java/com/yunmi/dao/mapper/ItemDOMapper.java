package com.yunmi.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.yunmi.dao.entity.ItemDO;
import com.yunmi.dao.mapper.base.ItemDOBaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
*  @author author
*/
@Repository
public interface ItemDOMapper extends ItemDOBaseMapper{

    @Select("select * from item")
    List<ItemDO> queryAll();

    @Delete("delete from item where title = ${title}")
    int deleteItemByTitle(@Param("title") String title);

}