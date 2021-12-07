package de.customed.diag.evaluation.exportpool;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by david on 28.07.16.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface ExportElement {
	String key();
	String description() default "";
	String unit() default "";
	ExportElementType type() default ExportElementType.MEASUREMENT;
	String[] typicalKeys() default {};
}
