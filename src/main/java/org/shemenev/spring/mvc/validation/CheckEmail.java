package org.shemenev.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)   // указывает, что применяется к полям
@Retention(RetentionPolicy.RUNTIME)  // сохраняется вплоть до выполнения кода
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {

    public String value() default "xyz.com";
    public String message() default "email must ends with xyz.com ";

    public Class<?>[] groups () default {};   // позволяет разбивать аннотации по группам
    public Class<? extends Payload>[] payload() default {};  // для переноса информации о метаданных клиента


}
