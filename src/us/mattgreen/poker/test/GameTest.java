package us.mattgreen.poker.test;

import org.junit.Before;
import org.junit.Test;
import us.mattgreen.poker.Card;
import us.mattgreen.poker.Game;

import static org.junit.Assert.assertTrue;
import static us.mattgreen.poker.Face.*;
import static us.mattgreen.poker.Suit.*;

public class GameTest {
    private Card[] hand;

    @Before
    public void setUp() {
        hand = new Card[]{new Card(JACK, CLUBS, 11), new Card(FIVE, CLUBS, 5), new Card(JACK, SPADES, 11)};
    }

    @Test
    public void twoOfAKindTest() {
        assertTrue("Two of a kind should have matched", Game.twoOfAKind(hand));
    }

    @Test
    public void twoPairsTest() {
        hand = new Card[]{new Card(JACK, CLUBS, 11), new Card(JACK, HEARTS, 11), new Card(FIVE, SPADES, 5), new Card(FIVE, CLUBS, 5)};

        assertTrue("Two pair should have matched", Game.twoPairs(hand));
    }

    @Test
    public void threeOfAKindTest() {
        hand = new Card[]{new Card(JACK, CLUBS, 11), new Card(JACK, HEARTS, 11), new Card(JACK, SPADES, 11), new Card(FIVE, CLUBS, 5)};

        assertTrue("Two pair should have matched", Game.threeOfAKind(hand));
    }

    @Test
    public void fullHouseTest() {
        hand = new Card[]{new Card(JACK, CLUBS, 11), new Card(JACK, HEARTS, 11), new Card(JACK, SPADES, 11), new Card(FIVE, CLUBS, 5), new Card(FIVE, SPADES, 5)};

        assertTrue("Full house should have matched", Game.threeOfAKind(hand));
    }
}
