package greeter;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

public class Main {
    public static void main(String[] args) {
        IFn require = Clojure.var("clojure.core", "require");
        require.invoke(Clojure.read("greeter.greeters"));

        IFn politeGreeterMaker = Clojure.var("greeter.greeters", "polite-greeter");
        IFn ghettoGreeterMaker = Clojure.var("greeter.greeters", "ghetto-greeter");
        IFn rudeGreeterMaker = Clojure.var("greeter.greeters", "rude-greeter");
        Greeter politeGreeter = (Greeter)politeGreeterMaker.invoke();
        Greeter ghettoGreeter = (Greeter)ghettoGreeterMaker.invoke();
        Greeter rudeGreeter = (Greeter)rudeGreeterMaker.invoke();


        System.out.println("\n\nGreetings from Clojure:\n");

        System.out.println(politeGreeter.getClass());

        System.out.println(politeGreeter.greet("Rich"));
        System.out.println(ghettoGreeter.greet("Rich"));
        System.out.println(rudeGreeter.greet("Rich"));
    }
}
