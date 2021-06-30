package HomeWork14;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)

public class MainTest {

    @Test
    public void checkArr() {
        Arrays.asList(new int [][][]{
                {{4, 4, 4, 5}, {5}},
                {{4, 3, 7, 5}, {3, 7, 5}},
                {{5, 5, 5, 4}, {}},

        });
    }

    @Test
    public void checkArr2(){

    }
}