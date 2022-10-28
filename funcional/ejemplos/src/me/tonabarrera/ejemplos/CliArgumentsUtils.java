package me.tonabarrera.ejemplos;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class CliArgumentsUtils {
    static void showHelp(CliArguments cliArguments){
        Consumer<CliArguments> consumer = arguments -> {
            if (arguments.getHelp()) {
                System.out.println("Manual solicitado");
            }
        };
        consumer.accept(cliArguments);
    }

    static CliArguments generateCli(){
        Supplier<CliArguments> generator = CliArguments::new;
        return generator.get();
    }
}
