package br.ce.wcaquino.taskbackend.utils;

import static br.ce.wcaquino.taskbackend.utils.DateUtils.isEqualOrFutureDate;
import static java.time.LocalDate.now;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

public class DateUtilsTest {

	private LocalDate date = now();

	@Test
	public void deveRetornarTrueParaDatasFuturas() {
		assertTrue(isEqualOrFutureDate(date.plusDays(1)));
	}

	@Test
	public void deveRetornarFalseParaDatasPassadas() {
		assertFalse(isEqualOrFutureDate(date));
	}

	@Test
	public void deveRetornarTrueParaDataAtual() {
		assertTrue(isEqualOrFutureDate(date));
	}
}
