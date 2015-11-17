/**
 * Created by Michael Greifeneder on 17.11.15.
 */
public class App {

    AppComp appComp;

    App() {
        appComp = DaggerAppComp.builder().appMod(new AppMod()).build();
    }

    AppComp getAppComp() {
        return appComp;
    }

    EnvComp getEnvComp() {
        return appComp.getEnvComp(new EnvMod(appComp.getEnvProvider().getDefaultEnv()));
    }
}
