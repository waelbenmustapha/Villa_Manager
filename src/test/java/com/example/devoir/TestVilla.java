package com.example.devoir;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestVilla {


	@Test
	@DisplayName("test equals")
	void testequal() {
		Assert.assertEquals(4,4);

	}

}
