package com.dang.test.service.impl;

import com.dang.test.entity.Student;
import com.dang.test.mapper.StudentMapper;
import com.dang.test.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author dang
 * @since 2020-10-02
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
