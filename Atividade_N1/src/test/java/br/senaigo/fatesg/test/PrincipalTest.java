package br.senaigo.fatesg.test;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.LocalTime;
import org.junit.Before;
import org.junit.Test;

import br.senaigo.fatesg.main.Principal;

public class PrincipalTest {
	
	LocalTime lt;
	SimpleDateFormat sdf;
	
	@Before
	public void init() {
		sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		lt = new LocalTime();
	}
	
	@Test
	public void testGetHorario() {
		String timeUtilDate = sdf.format(new Date());
		
		lt = LocalTime.parse(timeUtilDate);
		assertTrue(Principal.getHorario().getMillisOfSecond() - lt.getMillisOfSecond() <= 100);
	}

}
