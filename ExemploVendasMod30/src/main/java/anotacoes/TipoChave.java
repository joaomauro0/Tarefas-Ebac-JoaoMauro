package anotacao;

import java.lang.annotation.*;

/**
 * @author joaomauro0
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}