package nirvana.tutorial.learn;

import java.util.logging.Logger;

/**
 * @hidden
 * @opt nodefontcolor "yellow"
 */
class UMLNoteOptions{}


/**
 * @opt nodefontcolor "blue"
 * @note This is a test
 * @composed 0..1 has 4..12 Tire
 */
public class Main {
    private static final Logger LOGGER= Logger.getAnonymousLogger();

    /**
     * @hidden
     */
    protected Main() {

    }
    public static void main(String[] args) {
        LOGGER.info("Hello, World!");
    }
}
