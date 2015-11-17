import dagger.Module;
import dagger.Provides;

/**
 * Created by Michael Greifeneder on 17.11.15.
 */
@Module
public class AppMod {

    @Provides
    @AppScope
    App provideApp() {
        return new App();
    }

    @Provides
    @AppScope
    EnvProvider provideEnvProvider() {
        return new EnvProvider();
    }

    @Provides
    @AppScope
    AppDependency provideAppDependecy() {
        return new AppDependency();
    }
}
