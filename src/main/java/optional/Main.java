package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String empty = null;
        //.ofNullable() u≥żywamy gdy w optional może byc null
        Optional<String> stringOptional = Optional.ofNullable(empty);

        if (stringOptional.isPresent()) {
            System.out.println(stringOptional.get());
        }

        String name = "Tomek";
        //.of() używamy gdy optional nie jest nullem
        Optional<String> nameOptional = Optional.of(name);
        //orElse() jesli optional przechowuje null wtedy da nam obiekt z tej metody
        var name1 = nameOptional.orElse("Kamil");
        System.out.println("orElse: " + name1);

        //.orElseGet()
        var name3 = nameOptional.orElseGet(() -> "Kamil");
        System.out.println(".orElseGet: " + name3);

        //.orElseThrow
        nameOptional.orElseThrow(() -> new RuntimeException("W nameOptionaklu nic nie było") );
        stringOptional.orElseThrow(() -> new RuntimeException("W strignoptionalu nic nie było"));


    }
}
