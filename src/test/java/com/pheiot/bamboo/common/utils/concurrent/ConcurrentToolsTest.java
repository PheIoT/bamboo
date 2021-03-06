package com.pheiot.bamboo.common.utils.concurrent;

import com.pheiot.bamboo.common.utils.concurrent.jsr166e.LongAdder;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConcurrentToolsTest {

    @Test
    public void longAdder() {
        LongAdder counter = ConcurrentTools.longAdder();
        counter.increment();
        counter.add(2);
        assertThat(counter.longValue()).isEqualTo(3L);
    }

}
