/*
 * Copyright (C), 2002-2017, 苏宁易购电子商务有限公司
 * FileName: DemoDaoImpl
 * Author:   huangcheng
 * Date:     2019/6/1 16:22
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

package xiaomi.thirdpartplatment.intf;

import xiaomi.thirdpartplatment.domain.UserInfo;

import java.util.List;

/**
 * @author haungcheng
 * @since 2019/6/1
 */
public interface DemoDao {

    void insert();

    List<UserInfo> queryUser(String userName, String password);
}
