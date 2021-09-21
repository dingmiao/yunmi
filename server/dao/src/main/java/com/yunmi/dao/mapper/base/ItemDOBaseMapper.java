package com.yunmi.dao.mapper.base;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.yunmi.dao.entity.ItemDO;
import org.springframework.stereotype.Repository;

/**
*  @author author
*/
@Repository
public interface ItemDOBaseMapper {

    int insertItemDO(ItemDO object);

    int updateItemDO(ItemDO object);

    int update(ItemDO.UpdateBuilder object);

    List<ItemDO> queryItemDO(ItemDO object);

    ItemDO queryItemDOLimit1(ItemDO object);

}