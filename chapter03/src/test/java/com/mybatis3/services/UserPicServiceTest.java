package com.mybatis3.services;

import com.mybatis3.domain.UserPic;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.*;

/**
 * @author chenkangqiang
 * @date 2017/8/22
 * @Description
 */
public class UserPicServiceTest {

    private static UserPicService userPicService;

    @BeforeClass
    public static void setup() {
        TestDataPopulator.initDatabase();
        userPicService = new UserPicService();
    }

    @AfterClass
    public static void teardown() {
        userPicService = null;
    }


    @Test
    public void insertUserPic() {
        String filePath = "image/UserImg.png";
        byte[] pic = null;
        try {
            InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(filePath);
            pic = new byte[inputStream.available()];
            inputStream.read(pic);
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(pic.length);
        String name = "Tom";
        String bio = "put some lenghty bio here";
        UserPic userPic = new UserPic(0, name, pic, bio);

        userPicService.insertUserPic(userPic);
    }


    @Test
    public void selectUserPic() {
        insertUserPic();
        byte[] pic = null;
        String filePath = "/Users/chen/Desktop/newPic.png";
        UserPic userPic = userPicService.selectUserPic(1);
        try {
            pic = userPic.getPic();
            OutputStream outputStream = new FileOutputStream(new File(filePath));
            outputStream.write(pic);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
