package com.mybatis3.mappers;

import com.mybatis3.domain.UserPic;

import java.util.List;

/**
 * @author chenkangqiang
 * @date 2017/8/22
 * @Description
 */
public interface UserPicMapper {

    int insertUserPic(UserPic userPic);

    UserPic selectUserPic(int id);

}
