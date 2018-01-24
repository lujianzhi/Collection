package interfacetest;

/**
 * Created by Ian.Lu on 2018/1/24.
 * Project : Collection
 */
public class Four extends AbstractOne implements IThree {

    @Override
    public void add() {
        super.add();
        System.out.println("Four");
    }
}
