/**
 * Created by Michael Greifeneder on 17.11.15.
 */
public class Main {
    public static void main(String[] args) {
        AppComp appComp = DaggerAppComp.builder().appMod(new AppMod()).build();
        EnvComp envComp = appComp.getEnvComp(new EnvMod(new Env("Test Env")));
        //ActComp actComp = DaggerActComp.builder().envMod(envComp).actMod(new ActMod()).build();
    }
}
