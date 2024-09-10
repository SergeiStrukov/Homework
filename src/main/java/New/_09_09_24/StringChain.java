package New._09_09_24;

public class StringChain {
    private final StringModifier[] modifiers;

    public StringChain(StringModifier... modifiers) {
        this.modifiers = modifiers;
    }

    public String process() {
        String result = "";
        for (StringModifier modifier : modifiers) {
            result = modifier.modify(result);
        }
        return result;
    }
}
