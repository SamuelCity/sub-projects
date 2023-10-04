package com.example.adatpor;

import com.example.adaptor.Adaptor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AdaptorTests {

    @Test
    void isTrue() {
        final var adaptor = new Adaptor();

        assertThat(adaptor.canAccess())
            .isTrue();
    }
}
