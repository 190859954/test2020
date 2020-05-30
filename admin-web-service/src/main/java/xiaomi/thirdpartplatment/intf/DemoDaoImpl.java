/*
 * Copyright (C), 2002-2017, 苏宁易购电子商务有限公司
 * FileName: DemoDao
 * Author:   huangcheng
 * Date:     2019/6/1 16:21
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

package xiaomi.thirdpartplatment.intf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import xiaomi.thirdpartplatment.domain.UserInfo;

import java.util.List;

/**
 * @author haungcheng
 * @since 2019/6/1
 */
@Repository
public class DemoDaoImpl implements DemoDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

//    @Autowired
//    SqlSessionFactory sqlSessionFactory;

    @Override
    public void insert() {
        System.out.println("我是业务也是切点新增操作");
//        jdbcTemplate.execute("insert into user_info (name,password) VALUES ('huangcheng','123456')");
        System.out.println("我是业务也是切点删除操作");
//        jdbcTemplate.execute("DELETE FROM user_info WHERE id=5");
    }

    @Override
    public List<UserInfo> queryUser(String userName, String password) {
        System.out.println("我是业务也是切点查询");
//        return jdbcTemplate.queryForList("select * from user_info", UserInfo.class);
        return null;
    }

}
