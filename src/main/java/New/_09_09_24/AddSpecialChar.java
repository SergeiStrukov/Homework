package New._09_09_24;

public class AddSpecialChar implements StringModifier{
    @Override
    public String modify(String input) {
        return STR."\{input}@#";
    }
}
