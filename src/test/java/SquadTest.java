import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class SquadTest {

  // @Test
  // public void name_addsHeroToGroupAndGetsHeroName_String() {
  //   Squad testSquad = new Squad("Squad A");
  //   Hero testHero = new Hero("Scorpion", 42, "Hellfire", "Subzero");
  //   testSquad.addHero(testHero);
  //   assertEquals("Scorpion", testSquad.heroName(0));
  // }

  // @Test
  // public void name_getsGroupOfSquad_String() {
  //   Squad testSquad = new Squad("Squad A");
  //   Hero testHero = new Hero("Scorpion", 42, "Hellfire", "Subzero");
  //   Hero testHero2 = new Hero("Raiden", 47, "Lightning", "Shinnok");
  //   testSquad.addHero(testHero);
  //   testSquad.addHero(testHero2);
  //   String listOfHeroes = testSquad.heroName(0) + " " + testSquad.heroName(1);
  //   assertEquals("Scorpion Raiden", listOfHeroes);
  // }

  @Test
  public void all_returnsAllInstancesOfSquad_true() {
   Squad firstSquad = new Squad("Squad A");
   Squad secondSquad = new Squad("Squad B");
   assertEquals(true, Squad.all().contains(firstSquad));
   assertEquals(true, Squad.all().contains(secondSquad));
 }

  @Test
  public void clear_emptiesAllCategoriesFromList_0() {
    Squad testSquad = new Squad("Squad A");
    Squad.clear();
    assertEquals(Squad.all().size(), 0);
  }

  @Test
  public void getId_squadsInstantiateWithAnId_1() {
   Squad testSquad = new Squad("Squad A");
   assertEquals(1, testSquad.getId());
 }

 @Test
 public void find_returnsSquadWithSameId_secondSquad() {
   Squad.clear();
   Squad firstSquad = new Squad("Squad A");
   Squad secondSquad = new Squad("Squad B");
   assertEquals(Squad.find(secondSquad.getId()), secondSquad);
 }

 @Test
 public void getHeroes_initiallyReturnsEmptyList_ArrayList() {
  Squad.clear();
  Squad testSquad = new Squad("Squad A");
  assertEquals(0, testSquad.getHeroes().size());
}

@Test
public void addHero_addsHeroToList_true() {
  Squad testSquad = new Squad("Squad A");
  Hero testHero = new Hero("Scorpion", 42, "Hellfire", "Subzero");
  testSquad.addHero(testHero);
  assertTrue(testSquad.getHeroes().contains(testHero));
}

@Test
  public void find_returnsNullWhenNoTaskFound_null() {
    assertTrue(Squad.find(999) == null);
  }
}
