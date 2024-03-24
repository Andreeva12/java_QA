package HomeWork4_3;

public class TextEditor {
    private String text;

    public TextEditor() {
        text = "";
    }

    public void addText(String newText) {
        text += newText;
    }

    public void printCurrentText() {
        System.out.println("Текущая строка: " + text);
    }

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.addText("Это первая строка. ");
        textEditor.addText("Это вторая строка. ");
        textEditor.addText("Это третья строка. ");

        textEditor.printCurrentText();
    }
}
