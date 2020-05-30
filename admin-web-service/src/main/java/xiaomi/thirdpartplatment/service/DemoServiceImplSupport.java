package xiaomi.thirdpartplatment.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import xiaomi.thirdpartplatment.intf.DemoDao;
import xiaomi.thirdpartplatment.intf.NewDemoDao;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2019/8/11 0011.
 */
@Component
public final class DemoServiceImplSupport implements InitializingBean, DisposableBean {

    @Resource
    private DemoDao demoDao;

    @Resource
    private NewDemoDao newDemoDao;

//    private static ConvertClazz clazz;
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        clazz = new ConvertClazz(demoDao, newDemoDao);
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        clazz = null;
//    }
//
//    private class ConvertClazz {
//        private DemoDao demoDao1;
//        private NewDemoDao newDemoDao1;
//
//        private ConvertClazz(DemoDao demoDao1, NewDemoDao newDemoDao1) {
//            this.demoDao1 = demoDao1;
//            this.newDemoDao1 = newDemoDao1;
//        }
//    }


    public  void test() {

        demoDao.insert();
        newDemoDao.queryUserInfo(null,null);

    }


    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
