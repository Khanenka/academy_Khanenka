package Homework2;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
@Inherited
public @interface ProducerInfo {

	String name();

	String company();

	String[] productTypes();

	int number();

}
