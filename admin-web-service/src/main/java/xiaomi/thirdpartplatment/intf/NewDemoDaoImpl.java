/*
 * Copyright (C), 2002-2017, 苏宁易购电子商务有限公司
 * FileName: NewDemoSeerviceImpl
 * Author:   huangcheng
 * Date:     2019/6/1 19:07
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

package xiaomi.thirdpartplatment.intf;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import xiaomi.thirdpartplatment.domain.UserInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author haungcheng
 * @since 2019/6/1
 */
@Repository
public class NewDemoDaoImpl implements NewDemoDao {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Override
    public UserInfo queryUserInfo(String userName, String password) {
        SqlSession sqlSession = null;
        try {
            sqlSession = sqlSessionFactory.openSession();
            Map<String, Object> map = new HashMap<>();
            map.put("name", userName);
            map.put("password", password);
            return sqlSession.selectOne("newDemo.findOne", map);
        } finally {
            sqlSession.close();
        }
    }


//    @Autowired
//    SqlMapClient sqlMapClient;
//
//    @Override
//    public UserInfo queryUserInfo(String userName, String password) {
//
//        Map<String, Object> map = new HashMap<>();
//        map.put("name", userName);
//        map.put("password", password);
//        try {
//            return (UserInfo) sqlMapClient.queryForObject("newDemoNew.findOne", map);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

}
