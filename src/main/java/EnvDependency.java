/**
 * Created by Michael Greifeneder on 17.11.15.
 */
public class EnvDependency {
    private AppDependency appDependency;

    public EnvDependency(AppDependency appDependency) {
        this.appDependency = appDependency;
    }

    public void print() {
        appDependency.print();
    }
}
