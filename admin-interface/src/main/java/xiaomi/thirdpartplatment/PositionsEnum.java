/*
 * Copyright (C), 2002-2017, 苏宁易购电子商务有限公司
 * FileName: ThreadLocalDemo
 * Author:   huangcheng
 * Date:     2019/6/27 7:16
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */

package xiaomi.thirdpartplatment;

import java.io.Serializable;

/**
 * @author haungcheng
 * @since 2019/6/27
 */
public enum PositionsEnum {

    YIN_YE_YUAN("10001", "营业员"),
    DU_DAO("10002", "督导"),
    DIAN_ZHANG("10003", "店长");

    private String positionCode;
    private String positionName;

    public String getPositionCode() {
        return positionCode;
    }

    public String getPositionName() {
        return positionName;
    }

    PositionsEnum(String positionCode, String positionName) {
        this.positionCode = positionCode;
        this.positionName = positionName;
    }


    static class GuideDto implements Serializable{
        private static final long serialVersionUID = -834158861177695767L;
        private String name;
        private Integer age;

        private static ThreadLocal<GuideDto> local = new ThreadLocal<>();

        private GuideDto() {
        }

        public static GuideDto instance() {
            GuideDto instance = local.get();
            if (null == instance) {
                local.set(new GuideDto());
            }
            return local.get();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "GuideDto{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }


}
