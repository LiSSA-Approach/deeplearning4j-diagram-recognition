/* Licensed under MIT 2022. */
package edu.kit.kastel.lissa.deeplearning;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloWorldTest {
    @Test
    void testMain() {
        HelloWorld.main(new String[0]);
        Assertions.assertThat(true);
    }
}
