import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class YatzyUtilsTest {

    @Test
    public void chance_scores_sum_of_all_dice() {
        int expected = 15;
        int actual = YatzyUtils.chance(2,3,4,5,1);
        assertEquals(expected, actual);
        assertEquals(16, YatzyUtils.chance(3,3,4,5,1));
    }

    @Test public void yatzy_scores_50() {
        int expected = 50;
        int actual = YatzyUtils.yatzy(4,4,4,4,4);
        assertEquals(expected, actual);
        assertEquals(50, YatzyUtils.yatzy(6,6,6,6,6));
        assertEquals(0, YatzyUtils.yatzy(6,6,6,6,3));
    }

    @Test public void test_1s() {
        assertEquals(1, YatzyUtils.ones(1, 2, 3, 4, 5));
        assertEquals(2, YatzyUtils.ones(1,2,1,4,5));
        assertEquals(0, YatzyUtils.ones(6,2,2,4,5));
        assertEquals(4, YatzyUtils.ones(1,2,1,1,1));
    }

    @Test
    public void test_2s() {
        assertEquals(4, YatzyUtils.twos(1,2,3,2,6));
        assertEquals(10, YatzyUtils.twos(2,2,2,2,2));
    }

    @Test
    public void test_threes() {
        assertEquals(6, YatzyUtils.threes(1,2,3,2,3));
        assertEquals(12, YatzyUtils.threes(2,3,3,3,3));
    }

    @Test
    public void one_pair() {
        assertEquals(6, YatzyUtils.score_pair(3,4,3,5,6));
        assertEquals(10, YatzyUtils.score_pair(5,3,3,3,5));
        assertEquals(12, YatzyUtils.score_pair(5,3,6,6,5));
    }

    @Test
    public void two_Pair() {
        assertEquals(16, YatzyUtils.two_pair(3,3,5,4,5));
        assertEquals(16, YatzyUtils.two_pair(3,3,5,5,5));
    }

    @Test
    public void three_of_a_kind()
    {
        assertEquals(9, YatzyUtils.three_of_a_kind(3,3,3,4,5));
        assertEquals(15, YatzyUtils.three_of_a_kind(5,3,5,4,5));
        assertEquals(9, YatzyUtils.three_of_a_kind(3,3,3,3,5));
    }

    @Test
    public void four_of_a_kind() {
        assertEquals(12, YatzyUtils.four_of_a_kind(3,3,3,3,5));
        assertEquals(20, YatzyUtils.four_of_a_kind(5,5,5,4,5));
        assertEquals(12, YatzyUtils.four_of_a_kind(3,3,3,3,3));
    }


    @Test
    public void smallStraight() {
        assertEquals(15, YatzyUtils.smallStraight(1,2,3,4,5));
        assertEquals(15, YatzyUtils.smallStraight(2,3,4,5,1));
        assertEquals(0, YatzyUtils.smallStraight(1,2,2,4,5));
    }

    @Test
    public void largeStraight() {
        assertEquals(20, YatzyUtils.largeStraight(6,2,3,4,5));
        assertEquals(20, YatzyUtils.largeStraight(2,3,4,5,6));
        assertEquals(0, YatzyUtils.largeStraight(1,2,2,4,5));
    }

    @Test
    public void fullHouse() {
        assertEquals(18, YatzyUtils.fullHouse(6,2,2,2,6));
        assertEquals(0, YatzyUtils.fullHouse(2,3,4,5,6));
    }
}
