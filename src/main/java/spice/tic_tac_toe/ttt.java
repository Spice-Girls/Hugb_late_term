package spice.tic_tac_toe;

import java.util.Random;
import org.apache.commons.lang3.StringUtils;

public class ttt {
    public static void main(String[] args) {
        Random rand = new Random();
        int test = rand.nextInt();
        System.out.println(StringUtils.swapCase("Hello, world!") + test);
    }
}
