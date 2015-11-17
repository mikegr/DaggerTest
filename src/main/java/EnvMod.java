import dagger.Module;
import dagger.Provides;

/**
 * Created by Michael Greifeneder on 17.11.15.
 */
@Module
public class EnvMod {
    private Env env;

    public EnvMod(Env env) {

        this.env = env;
    }
    @Provides
    @EnvScope
    Env provideEnv() {
        return env;
    }

    @Provides
    @EnvScope
    EnvDependency provideEnvDependency(AppDependency appDependency) {
        return new EnvDependency(appDependency);
    }

}
