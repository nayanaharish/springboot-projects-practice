//step1:Create Custom Qualifier Annotations for DebitCard implementation
package org.example.springbootpractice.CustomQualifiers;
import org.springframework.beans.factory.annotation.Qualifier;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface DebitCard {

}
