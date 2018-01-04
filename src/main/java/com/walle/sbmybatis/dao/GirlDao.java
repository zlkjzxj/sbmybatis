package com.walle.sbmybatis.dao;

import com.walle.sbmybatis.bean.Girl;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

/**
 * Created by walle
 * 2018/1/4 21:39
 * good good study,day day up!
 */
@Component
public class GirlDao {
    private final SqlSession sqlSession;

    public GirlDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Girl selectGirlById(int id) {
        return this.sqlSession.selectOne("selectGirlById", id);
    }
}
