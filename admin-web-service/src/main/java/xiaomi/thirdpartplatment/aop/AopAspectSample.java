/*
 * Copyright (C), 2002-2017, 苏宁易购电子商务有限公司
 * FileName: aopAspectSample
 * Author:   huangcheng
 * Date:     2019/6/1 11:38
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

package xiaomi.thirdpartplatment.aop;

/**
 * @author haungcheng
 * @since 2019/6/1
 */
//@Component
public class AopAspectSample {


    public void before() {

        System.out.print("我是aop的before前置通知啊啊啊啊");


    }

    public void after() {

        System.out.print("我是aop的after后置通知啊啊啊啊");


    }
}
