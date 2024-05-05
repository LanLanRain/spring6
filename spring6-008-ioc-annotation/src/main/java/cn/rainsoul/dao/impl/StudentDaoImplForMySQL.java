package cn.rainsoul.dao.impl;

import cn.rainsoul.dao.StudentDao;
import org.springframework.stereotype.Repository;

//@Repository("studentDaoImplForMySQL")
@Repository("studentDao1")
public class StudentDaoImplForMySQL implements StudentDao {
    @Override
    public void deleteById() {
        System.out.println("mysql数据库正在删除学生信息");
    }
}
