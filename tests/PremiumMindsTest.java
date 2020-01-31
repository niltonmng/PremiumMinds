import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pm.PremiumMinds;

class PremiumMindsTest {

	@Test
	void cacthPokemonTest() {
		PremiumMinds pm = new PremiumMinds();
		
		assertEquals(pm.catchPokemon(""),1);
		assertEquals(pm.catchPokemon("E"),2);
		assertEquals(pm.catchPokemon("O"),2);
		assertEquals(pm.catchPokemon("S"),2);
		assertEquals(pm.catchPokemon("N"),2);
		assertEquals(pm.catchPokemon("EE"),3);
		assertEquals(pm.catchPokemon("EO"),2);
		assertEquals(pm.catchPokemon("NESO"),4);
		assertEquals(pm.catchPokemon("NSNSNSNSNS"),2);
		assertEquals(pm.catchPokemon("NESNE"),5);
		assertEquals(pm.catchPokemon("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE"),42);
		assertEquals(pm.catchPokemon("NNNNNNNNNNNNNNNNNNNNNNNNNN"),27);
		assertEquals(pm.catchPokemon("OOOOOOOOOOOOOOOO"),17);
		assertEquals(pm.catchPokemon("SSSSSSSSSSSSSSSSSSSS"),21);
		assertEquals(pm.catchPokemon("SSSSSSSSSSSSSSSSSSSSNNNNNNNNNNNNNNNNNNNNNN"),23);
	}

}
