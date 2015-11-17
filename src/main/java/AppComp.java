import dagger.Component;

/**
 * Created by Michael Greifeneder on 17.11.15.
 */
@AppScope
@Component(modules = AppMod.class)
public interface AppComp {

    EnvComp getEnvComp(EnvMod envMod);

    EnvProvider getEnvProvider();

}
