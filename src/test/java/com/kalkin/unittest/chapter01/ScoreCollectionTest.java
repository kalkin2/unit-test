package com.kalkin.unittest.chapter01;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class ScoreCollectionTest {


    @Test
    public void test() {
//        fail("not yet implemented");
    }

    @Test
    public void answersArithmeticMeanOfTwoNumbers() {

        //준비
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        //실행
        int actualResult = collection.arithmeticMean();

        // 단언
        Assert.assertThat(actualResult, equalTo(6));
    }
}
