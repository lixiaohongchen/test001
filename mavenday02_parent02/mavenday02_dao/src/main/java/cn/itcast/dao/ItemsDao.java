package cn.itcast.dao;

import cn.itcast.domain.Items;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("itemsDao")
public interface ItemsDao {

    @Select("select * from items where id = #{id}")
    public Items findOne(Integer id);

    //查询所有
    @Select("select * from items")
    List<Items> findAll();
    /**
     * 什么鬼东西啊啊啊大萨达所多委屈
     */

    //给你加个鸡儿
    //都是时辰的错
    //111111
    /**
     * 我有一句mmp不知道当讲不当讲啊你妹的
     */

    //changchuan

}
