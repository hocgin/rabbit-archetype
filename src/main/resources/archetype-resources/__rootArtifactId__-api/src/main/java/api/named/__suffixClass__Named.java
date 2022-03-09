package ${package}.api.named;


import in.hocg.boot.named.annotation.Named;

import java.lang.annotation.*;

/**
 * Created by hocgin on 2021/12/10
 * email: hocgin@gmail.com
 *
 * @author hocgin
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Named(useService = ${suffixClass}NamedServiceApi.class)
public @interface ${suffixClass}Named {

    String idFor();

    String type() default "";

    String[] args() default {};

    boolean useCache() default true;
}
