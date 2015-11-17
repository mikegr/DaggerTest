import dagger.Module;

/**
 * Created by Michael Greifeneder on 17.11.15.
 */
@Module
public class EnvMod {
    private Env env;

    public EnvMod(Env env) {

        this.env = env;
    }
}
