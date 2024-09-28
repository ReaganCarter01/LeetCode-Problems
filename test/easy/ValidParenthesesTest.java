package easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidParenthesesTest {

    @Test
    public void vpEmpty(){
        ValidParentheses vp = new ValidParentheses();
        String parentheses = "[";
        boolean solution = false;
        boolean result = vp.isValid(parentheses);

        assertEquals(solution, result);
    }

    @Test
    public void vpValidOneRelation(){
        ValidParentheses vp = new ValidParentheses();
        String parentheses = "[]";
        boolean solution = true;
        boolean result = vp.isValid(parentheses);

        assertEquals(solution, result);
    }
}
