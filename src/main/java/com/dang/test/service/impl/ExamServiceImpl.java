package com.dang.test.service.impl;

import com.dang.test.entity.Exam;
import com.dang.test.mapper.ExamMapper;
import com.dang.test.service.ExamService;
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
public class ExamServiceImpl extends ServiceImpl<ExamMapper, Exam> implements ExamService {

}
