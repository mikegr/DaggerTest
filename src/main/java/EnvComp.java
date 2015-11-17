import dagger.Component;
import dagger.Subcomponent;

/**
 * Created by Michael Greifeneder on 17.11.15.
 */
@EnvScope
@Subcomponent(modules = EnvMod.class)
public interface EnvComp {
}
