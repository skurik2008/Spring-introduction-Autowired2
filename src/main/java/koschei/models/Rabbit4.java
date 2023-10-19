package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {
    private Duck5 duck;

    @Autowired
    public Duck5 setDuck(Duck5 duck1) {
        return this.duck = duck1;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + duck.toString();
    }
}
