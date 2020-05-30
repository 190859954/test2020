/*
 * Copyright (C), 2002-2017, 苏宁易购电子商务有限公司
 * FileName: DemoService
 * Author:   huangcheng
 * Date:     2019/6/1 11:36
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

package xiaomi.thirdpartplatment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiaomi.thirdpartplatment.domain.UserInfo;

/**
 * @author haungcheng
 * @since 2019/6/1
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoServiceImplSupport demoServiceImplSupport;

    @Override
    public void insert() {
        demoServiceImplSupport.test();
    }

    @Override
    public UserInfo queryUser(String userName, String password) {
        return null;
    }


    private static int i = 0;
    private int j = 0;

    public DemoServiceImpl() {
        i++;
        System.out.println("i:"+i);
        j++;
        System.out.println("j:"+j);
    }


    public static void main(String[] args) {

        new DemoServiceImpl();
        new DemoServiceImpl();
        new DemoServiceImpl();

    }


    private void test11(){
        demoServiceImplSupport.test();

    }

    //    private static DemoDao demoDao1;
//
//    private static NewDemoDao newDemoDao1;
//
//
//    public DemoServiceImpl(DemoDao demoDao, NewDemoDao newDemoDao) {
//        this.demoDao1 = demoDao;
//        this.newDemoDao1 = newDemoDao;
//    }

//    @Value("${zk.server}")
//    private String zkServer;
//
//
//    @Override
//    public void insert() {
//        demoDao1.insert();
//    }
//
//    @Override
//    public UserInfo queryUser(String userName, String password) {
//
//        return newDemoDao1.queryUserInfo(userName, password);
//    }


}