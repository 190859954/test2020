/*
 * Copyright (C), 2002-2017, 苏宁易购电子商务有限公司
 * FileName: DemoService
 * Author:   huangcheng
 * Date:     2019/6/1 12:10
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

package xiaomi.thirdpartplatment.service;

import xiaomi.thirdpartplatment.domain.UserInfo;

/**
 * @author haungcheng
 * @since 2019/6/1
 */
public interface DemoService {

    void insert();

    UserInfo queryUser(String userName, String password);
}
