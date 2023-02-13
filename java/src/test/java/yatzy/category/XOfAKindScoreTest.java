package yatzy.category;

import org.junit.Test;
import yatzy.Dice;
import yatzy.Score;
import yatzy.TestUtils;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class XOfAKindScoreTest {

    @Test(expected = IllegalArgumentException.class)
    public void throws_if_number_of_dice_is_different_of_5() {
        List<Dice> dices = TestUtils.getDices(1,2,3,4);
        new PairScore(dices);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throws_if_dices_is_null() {
        new PairScore(null);
    }
    

    @Test
    public void two_number_of_kind() {
        assertEquals(Score.of(2), new PairScore(TestUtils.getDices(1,1,1,1,1)).score());
        assertEquals(Score.of(10), new PairScore(TestUtils.getDices(5,1,5,1,5)).score());
        assertEquals(Score.of(4), new PairScore(TestUtils.getDices(2,2,1,1,2)).score());
        assertEquals(Score.of(4), new PairScore(TestUtils.getDices(2,4,1,1,2)).score());
        assertEquals(Score.of(6), new PairScore(TestUtils.getDices(2,4,3,1,3)).score());
        assertEquals(Score.of(0), new PairScore(TestUtils.getDices(2,4,3,1,5)).score());
    }

    @Test
    public void three_number_of_kind() {
        assertEquals(Score.of(3), new ThreeOfAKindScore(TestUtils.getDices(1,1,1,1,1)).score());
        assertEquals(Score.of(15), new ThreeOfAKindScore(TestUtils.getDices(5,1,5,1,5)).score());
        assertEquals(Score.of(6), new ThreeOfAKindScore(TestUtils.getDices(2,2,1,1,2)).score());
        assertEquals(Score.of(0), new ThreeOfAKindScore(TestUtils.getDices(2,4,1,1,2)).score());
    }

    @Test
    public void four_number_of_kind() {
        assertEquals(Score.of(4), new FourOfAKindScore(TestUtils.getDices(1,1,1,1,1)).score());
        assertEquals(Score.of(20), new FourOfAKindScore(TestUtils.getDices(5,5,5,1,5)).score());
        assertEquals(Score.of(8), new FourOfAKindScore(TestUtils.getDices(2,2,2,1,2)).score());
        assertEquals(Score.of(0), new FourOfAKindScore(TestUtils.getDices(2,4,1,1,2)).score());
    }

}
