import javax.inject.Inject;

/**
 * Created by Michael Greifeneder on 17.11.15.
 */
public class Main {

    @Inject
    Env environment;

    @Inject
    EnvDependency envDependency;


    public Main() {
        App app = new App();
        EnvComp envComp =  app.getEnvComp();
        ActComp actComp = DaggerActComp.builder().envComp(envComp).actMod(new ActMod()).build();
        actComp.inject(this);
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.show();
    }

    private void show() {
        System.out.println("Env: " + environment.getName());
        envDependency.print();
    }

}
