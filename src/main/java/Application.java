
import com.mycompany.weatherdatadisplay.presenter.MainScreenPresenter;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;


public class Application {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JDesktopPane desktopPane = new JDesktopPane();
        MainScreenPresenter mainScreenPresenter = new MainScreenPresenter();
        
        desktopPane.add(mainScreenPresenter.getView());
        mainScreenPresenter.getView().setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(desktopPane, BorderLayout.CENTER);
        frame.setSize(1400, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
