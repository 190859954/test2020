/*
 * Copyright (C), 2002-2017, 苏宁易购电子商务有限公司
 * FileName: ZookeeperLock
 * Author:   huangcheng
 * Date:     2019/5/26 11:59
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

package xiaomi.thirdpartplatment.aop;

import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.exception.ZkNodeExistsException;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author haungcheng
 * @since 2019/5/26
 */
public class ZookeeperLock implements Lock {


    private static final String ZK_IP_PORT = "127.0.0.1:2181, 127.0.0.1:2182";

    private static final String LOCK_NODE = "/LOCK";

    private ZkClient zkClient = new ZkClient(ZK_IP_PORT);

    private CountDownLatch cdl = null;

    @Override
    public void lock() {
        if (tryLock()) {
            System.out.println("获取锁success");
            return;
        }
        waitForLock();
        lock();

    }

    private void waitForLock() {

        IZkDataListener listener = new IZkDataListener() {
            @Override
            public void handleDataChange(String s, Object o) throws Exception {

            }

            @Override
            public void handleDataDeleted(String s) throws Exception {
                System.out.println("------delete event---------");
                if (null != cdl) {
                    cdl.countDown();
                }
            }
        };

        //给节点家监听
        zkClient.subscribeDataChanges(LOCK_NODE, listener);
        if (zkClient.exists(LOCK_NODE)) {
            cdl = new CountDownLatch(1);
            try {
                cdl.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        zkClient.unsubscribeDataChanges(LOCK_NODE, listener);

    }


    @Override//非阻塞式加锁
    public boolean tryLock() {
        try {
            zkClient.createPersistent(LOCK_NODE);
            System.out.println("获取节点成功");
            return true;
        } catch (ZkNodeExistsException e) {
            return false;
        }
    }

    @Override
    public void unlock() {
        zkClient.delete(LOCK_NODE);
    }

    @Override
    public Condition newCondition() {
        return null;
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }
}
