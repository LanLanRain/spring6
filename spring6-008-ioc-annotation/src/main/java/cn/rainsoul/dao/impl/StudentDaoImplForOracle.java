package cn.rainsoul.dao.impl;

import cn.rainsoul.dao.StudentDao;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDaoImplForOracle implements StudentDao {
    @Override
    public void deleteById() {
        System.out.println("oracle正在删除student。。。。");
    }
}
