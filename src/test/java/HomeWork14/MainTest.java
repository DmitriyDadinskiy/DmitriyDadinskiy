package HomeWork14;

import org.junit.Assert;
import org.junit.Test;
//@RunWith(Parameterized.class)

public class MainTest {

    @Test
    public void checkArr() {


        int [] array = {1, 2, 4, 4, 5, 6, 7, 8, 1};
        int [] newArr = {5, 6, 7, 8, 1};

        Assert.assertArrayEquals(newArr, Main.checkArr(array));

        int [] array2 = {1, 2, 4, 4, 5,};
        int [] newArr2 = {5};

        Assert.assertArrayEquals(newArr2, Main.checkArr(array2));

        int [] array3 = {1, 2, 4, 1, 5,};
        int [] newArr3 = {1,5};

        Assert.assertArrayEquals(newArr3, Main.checkArr(array3));
    }
    @Test
    public void checkArr2(){
    int [] array = {1,2,1,4};

Assert.assertArrayEquals(new boolean[]{true}, Main.checkArr2(array));
        int [] array1 = {1,1,1,0};

        Assert.assertArrayEquals(new boolean[]{true}, Main.checkArr2(array1));
        int [] array2 = {2,4,2,4};

        Assert.assertArrayEquals(new boolean[]{true}, Main.checkArr2(array2));
    }
}