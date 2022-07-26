import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class BotWhatsApp {
    public static void main(String[] args) throws Exception{

        // Selecionar cor
        var reset = EnumCor.RESET;
        var verdeNegrito = EnumCor.VERDE_NEGRITO;
        var vermelhoNegrito = EnumCor.VERMELHO_NEGRITO;

        var bot = new Robot();
        var entrada = new Scanner(System.in);

        System.out.println();
        System.out.println(verdeNegrito + "Digite algo: " + reset);
        System.out.println();
        var texto = entrada.nextLine();

        var selecionarString = new StringSelection(texto);
        var clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selecionarString, null);

        System.out.println(vermelhoNegrito + "A loucura irá começar em 5 segundos. Aproveite!" + reset);
        Thread.sleep(5000);

        var i = 1;
        while (i <= 100) {
            Thread.sleep(400);

            bot.keyPress(KeyEvent.VK_CONTROL);
            bot.keyPress(KeyEvent.VK_V);
            bot.keyRelease(KeyEvent.VK_CONTROL);
            bot.keyRelease(KeyEvent.VK_V);

            bot.keyPress(KeyEvent.VK_ENTER);

            i++;
        }
    }
}
