package com.mashibing.mybatisdemo02;

import com.mashibing.mybatisdemo02.dao.EmpMapper;
import com.mashibing.mybatisdemo02.dao.UserMapper;
import com.mashibing.mybatisdemo02.pojo.Emp;
import com.mashibing.mybatisdemo02.pojo.User;
import com.mashibing.mybatisdemo02.pojo.UserWrapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication
public class MybatisDemo02Application {

//    public static void main(String[] args) {
//        SpringApplication.run(MybatisDemo02Application.class, args);
//    }
    static Logger logger = Logger.getLogger(MybatisDemo02Application.class);
    public static void main(String[] args) throws IOException {

        logger.error("log:error");
        logger.warn("log:warn");
        logger.info("log:info");
        logger.debug("log:debug");
        // 1.加载全局配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-cfg.xml");
        // 2.获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        // 3.根据SqlSessionFactory获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = new User();
        user.setUsername("周乔");
        user.setAddress("河南");
        user.setGender("男");
        user.setId(27);
        User user1 = new User();
        user1.setUsername("胡子");
        user1.setAddress("廊坊");
        user1.setGender("男");
        user1.setId(27);
        ArrayList<User> users = new ArrayList<User>();
        users.add(user);
        users.add(user1);
        // 通过SqlSession获取Dao接口的代理对象
//        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        Integer i = mapper.insertUser(users);
//        System.out.println(i);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> emps = mapper.queryEmp();
        for (Emp emp:emps){
            System.out.println(emp + ":"+emp.getDept());
        }
        // 5.提交资源并关闭连接
        sqlSession.commit();
        sqlSession.close();
    }


}
