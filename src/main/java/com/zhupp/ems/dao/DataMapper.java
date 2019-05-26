package com.zhupp.ems.dao;

import com.zhupp.ems.util.po.Data;
import com.zhupp.ems.util.po.DataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataMapper {
    long countByExample(DataExample example);

    int deleteByExample(DataExample example);

    int insert(Data record);

    int insertSelective(Data record);

    List<Data> selectByExample(DataExample example);

    int updateByExampleSelective(@Param("record") Data record, @Param("example") DataExample example);

    int updateByExample(@Param("record") Data record, @Param("example") DataExample example);
}