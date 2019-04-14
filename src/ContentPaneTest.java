import javax.swing.*;
import java.awt.*;

public class ContentPaneTest extends JFrame {

    public ContentPaneTest() {
        super("Test ContentPane");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // создание панели с двумя кнопками
        JPanel contents = new JPanel();
        contents.add(new Button("Пойду"));
        contents.add(new Button("Не пойду"));

        // замена панели содержимого
        setContentPane(contents);

        // Определение панели окна
        setSize(200, 100);

        // Открытие окна
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new ContentPaneTest();
    }
}
