package yatzy.category;

import org.junit.Test;
import yatzy.Dice;
import yatzy.Score;
import yatzy.TestUtils;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SmallStraightScoreTest {

    @Test(expected = IllegalArgumentException.class)
    public void throws_if_number_of_dice_is_different_of_5() {
        List<Dice> dices = TestUtils.getDices(1,2,3,4);
        new SmallStraightScore(dices);
    }

    @Test(expected = IllegalArgumentException.class)
    public void throws_if_dices_is_null() {
        new SmallStraightScore(null);
    }

    @Test
    public void small_straight_scores_15() {
        assertEquals(Score.of(15), new SmallStraightScore(TestUtils.getDices(1,2,3,4,5)).score());
        assertEquals(Score.of(15), new SmallStraightScore(TestUtils.getDices(4,2,1,5,3)).score());
    }


    @Test
    public void small_straight_scores_0() {
        assertEquals(Score.of(0), new SmallStraightScore(TestUtils.getDices(5,5,5,5,1)).score());
        assertEquals(Score.of(0), new SmallStraightScore(TestUtils.getDices(2,3,4,5,6)).score());
        assertEquals(Score.of(0), new SmallStraightScore(TestUtils.getDices(2,3,4,1,6)).score());
    }
}
