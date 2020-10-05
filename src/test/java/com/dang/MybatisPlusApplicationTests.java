package com.dang;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {

   /* @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        List<User> students = userMapper.selectList(null);
        students.forEach(System.out::println);
    }

    @Test
    public void test1(){
        User user=new User();
        user.setName("张三2");
        user.setAge(5);
        user.setSex("男");
        int insert = userMapper.insert(user);
        System.out.println(insert);
    }

    @Test
    public void test2(){
        User user=new User();
        user.setId(2);
        user.setName("笑哈哈2");
        int result=userMapper.updateById(user);
        System.out.println(result);
    }

    //测试分页
    @Test
    public void test3(){
        Page<User> page=new Page<>(1,2);
        userMapper.selectPage(page,null);
        page.getRecords().forEach(System.out::println);
    }


    @Test
    public void test4(){
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("name","哈");
        
        userMapper.selectList(queryWrapper).forEach(System.out::println);
    }
*/
}
