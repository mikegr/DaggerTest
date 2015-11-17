import dagger.Component;

/**
 * Created by Michael Greifeneder on 17.11.15.
 */
@Component(dependencies = EnvComp.class, modules = ActMod.class)
@ActScope
public interface  ActComp {

}
