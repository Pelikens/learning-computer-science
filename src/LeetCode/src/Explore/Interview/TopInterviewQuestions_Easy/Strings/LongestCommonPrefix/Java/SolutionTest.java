package LeetCode.src.Explore.Interview.TopInterviewQuestions_Easy.Strings.LongestCommonPrefix.Java;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class SolutionTest {
    
    Solution solution;
    
    @BeforeEach
    public void setUp() throws Exception {
        solution = new Solution();
    }
    
    @AfterEach
    public void tearDown() throws Exception {
        solution = null;
    }
    
    @Test
    public void MainFunction() {
        assertTimeout(Duration.ofMillis(500), () -> {
             String[] args = new String[0];
             assertAll(() -> Solution.main(args));
        });
    }
    
    @Test
    public void TrivialCase1() {
        String[] strs = {"flower","flow","flight"};
        assertTimeout(Duration.ofMillis(500), () -> {
            String expected = "fl";
            String actual = Solution.longestCommonPrefix(strs);
            assertEquals(expected, actual);
        });
    }

    @Test
    public void TrivialCase2() {
        String[] strs = {"dog","racecar","car"};
        assertTimeout(Duration.ofMillis(500), () -> {
            String expected = "";
            String actual = Solution.longestCommonPrefix(strs);
            assertEquals(expected, actual);
        });
    }
}