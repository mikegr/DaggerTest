import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by Michael Greifeneder on 17.11.15.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface AppScope {
}
