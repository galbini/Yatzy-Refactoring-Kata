/**
 * @deprecated the better way is to use the Yatzi class
 */
@Deprecated
public class YatzyUtils {


    public static int chance(int d1, int d2, int d3, int d4, int d5) {
        return Yatzy.of(d1, d2, d3, d4, d5).chance().getValue();
    }

    public static int yatzy(int... dice) {
        return Yatzy.of(dice[0], dice[1], dice[2], dice[3], dice[4]).yatzy().getValue();
    }

    public static int ones(int d1, int d2, int d3, int d4, int d5) {
        return Yatzy.of(d1, d2, d3, d4, d5).ones().getValue();
    }

    public static int twos(int d1, int d2, int d3, int d4, int d5) {
        return Yatzy.of(d1, d2, d3, d4, d5).twos().getValue();
    }

    public static int threes(int d1, int d2, int d3, int d4, int d5) {
        return Yatzy.of(d1, d2, d3, d4, d5).threes().getValue();
    }


    public static int score_pair(int d1, int d2, int d3, int d4, int d5) {
        return Yatzy.of(d1, d2, d3, d4, d5).score_pair().getValue();
    }

    public static int two_pair(int d1, int d2, int d3, int d4, int d5) {
        return Yatzy.of(d1, d2, d3, d4, d5).two_pair().getValue();
    }

    public static int four_of_a_kind(int d1, int d2, int d3, int d4, int d5) {
        return Yatzy.of(d1, d2, d3, d4, d5).four_of_a_kind().getValue();
    }

    public static int three_of_a_kind(int d1, int d2, int d3, int d4, int d5) {
        return Yatzy.of(d1, d2, d3, d4, d5).three_of_a_kind().getValue();
    }

    public static int smallStraight(int d1, int d2, int d3, int d4, int d5) {
        return Yatzy.of(d1, d2, d3, d4, d5).smallStraight().getValue();
    }

    public static int largeStraight(int d1, int d2, int d3, int d4, int d5) {
        return Yatzy.of(d1, d2, d3, d4, d5).largeStraight().getValue();
    }

    public static int fullHouse(int d1, int d2, int d3, int d4, int d5) {
        return Yatzy.of(d1, d2, d3, d4, d5).fullHouse().getValue();
    }
}