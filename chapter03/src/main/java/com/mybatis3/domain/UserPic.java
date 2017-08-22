package com.mybatis3.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author chenkangqiang
 * @date 2017/8/22
 * @Description
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPic {
    private int id;
    private String name;
    private byte[] pic;
    private String bio;
}
