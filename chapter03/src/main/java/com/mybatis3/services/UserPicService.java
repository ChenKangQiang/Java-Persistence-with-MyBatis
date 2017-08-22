package com.mybatis3.services;

import com.mybatis3.domain.UserPic;
import com.mybatis3.mappers.UserPicMapper;
import com.mybatis3.util.MyBatisUtil;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.List;

/**
 * @author chenkangqiang
 * @date 2017/8/22
 * @Description
 */
public class UserPicService {

    private static final Logger logger = LoggerFactory.getLogger(UserPicService.class);


    public void insertUserPic(UserPic userPic) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            UserPicMapper mapper = sqlSession.getMapper(UserPicMapper.class);
            mapper.insertUserPic(userPic);
            //必须手动提交，否则执行sqlSession.close()后，事务回滚，插入的数据会消失
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }


    public UserPic selectUserPic(int id) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            UserPicMapper mapper = sqlSession.getMapper(UserPicMapper.class);
            return mapper.selectUserPic(id);
        } finally {
            sqlSession.close();
        }
    }
}
