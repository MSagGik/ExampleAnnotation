import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // ограничение использования аннотации только к методам
@Retention(RetentionPolicy.RUNTIME) // аннотация доступна во время работы программы
public @interface MethodInfo {
    String author() default "MSagGik"; // автор метода
    int dateOfCreation() default 2022; // дата создания метода
    String purpose(); // цель метода
}
