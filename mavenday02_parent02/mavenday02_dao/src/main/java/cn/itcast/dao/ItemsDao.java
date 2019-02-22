package cn.itcast.dao;

import cn.itcast.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository("itemsDao")
public interface ItemsDao {

    @Select("select * from items where id = #{id}")
    public Items findOne(Integer id);
}
