package New._09_09_24;

public class TextInput implements StringModifier{
    private String text;

    public TextInput(String text) {
        this.text = text;
    }

    @Override
    public String modify(String input) {
        return text;
    }
}

