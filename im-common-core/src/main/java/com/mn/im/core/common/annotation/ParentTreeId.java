package com.mn.im.core.common.annotation;

import java.lang.annotation.*;

/**
 * @author qiaomengnan
 * @ClassName: ParentTreeId
 * @Description: 属性上级节点id
 * @date 2018/3/29
 */
@Target({ ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ParentTreeId {

    String value() default  "";

    String replace() default "";

}
