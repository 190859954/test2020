/*
 * Copyright (C), 2002-2017, 苏宁易购电子商务有限公司
 * FileName: UserInfo
 * Author:   huangcheng
 * Date:     2019/6/1 12:10
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

package xiaomi.thirdpartplatment.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author haungcheng
 * @since 2019/6/1
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo implements Serializable{

    private Integer id;

    private String name;

    private String password;

}
