/*
 * Copyright (C), 2002-2017, 苏宁易购电子商务有限公司
 * FileName: TestEnum
 * Author:   huangcheng
 * Date:     2019/6/29 16:08
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

package xiaomi.thirdpartplatment;

/**
 * @author haungcheng
 * @since 2019/6/29
 */
public enum TestEnum {
    position_code_map("positionCodeMap"),
    biz_value("bizValue");

    private String config;

    TestEnum(String config) {
        this.config = config;
    }

    public String getConfig() {
        return config;
    }

    @Override
    public String toString() {
        return "TestEnum{" +
                "config='" + config + '\'' +
                "} " + super.toString();
    }
}
