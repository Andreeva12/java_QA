package HomeWork4_3;

public class Main {
    public static void main(String[] args) {
        // Создание объекта класса TextEditor
        TextEditor textEditor = new TextEditor();

        // Добавление нескольких строк текста
        textEditor.addText("Это первая строка. ");
        textEditor.addText("Это вторая строка. ");
        textEditor.addText("Это третья строка. ");

        // Вывод текущей строки
        textEditor.printCurrentText();
    }
}
