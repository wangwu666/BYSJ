package com.ww.dao;

import com.ww.model.Train;
import com.ww.model.TrainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainMapper {
    int countByExample(TrainExample example);

    int deleteByExample(TrainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Train record);

    int insertSelective(Train record);

    List<Train> selectByExampleWithBLOBs(TrainExample example);

    List<Train> selectByExample(TrainExample example);

    Train selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Train record, @Param("example") TrainExample example);

    int updateByExampleWithBLOBs(@Param("record") Train record, @Param("example") TrainExample example);

    int updateByExample(@Param("record") Train record, @Param("example") TrainExample example);

    int updateByPrimaryKeySelective(Train record);

    int updateByPrimaryKeyWithBLOBs(Train record);

    int updateByPrimaryKey(Train record);
}