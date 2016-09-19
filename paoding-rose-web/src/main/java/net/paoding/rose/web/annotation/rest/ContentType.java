package net.paoding.rose.web.annotation.rest;

import java.lang.annotation.*;


@Target( { ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ContentType {
    /**
     * 自定义文件扩展名
     *
     * @return
     */
    String value();
}
