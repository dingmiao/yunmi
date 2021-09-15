package com.yunmi.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.yunmi.dao.entity.ItemDO;
import com.yunmi.dao.mapper.base.ItemDOBaseMapper;
import org.springframework.stereotype.Repository;

/**
*  @author author
*/
@Mapper
@Repository
public interface ItemDOMapper extends ItemDOBaseMapper{


}