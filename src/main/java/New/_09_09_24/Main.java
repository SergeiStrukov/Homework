package New._09_09_24;

public class Main {
    public static void main(String[] args) {
//        TextInput textInput = new TextInput("Test");
//        AddCharacter addCharacter = new AddCharacter();
//        AddSpecialChar addSpecialChar = new AddSpecialChar();
//        TextConvertToUpper textConvertToUpper = new TextConvertToUpper();
//        TextOutput textOutput = new TextOutput();
//
//        String test = textInput.getText();
//        String addText = addCharacter.addChar(test);
//        String addText2 = addSpecialChar.addChar2(addText);
//        String addText3 = textConvertToUpper.convertToUpper(addText2);
//
//        textOutput.printText(addText3);

        StringChain chain = new StringChain(
                new TextInput("Hello"),
                new AddCharacter(),
                new AddSpecialChar(),
                new TextConvertToUpper()
        );


        String result = chain.process();


        TextOutput textOutput = new TextOutput();
        textOutput.printText(result);
    }
}
