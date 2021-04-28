
import com.mycompany.weatherdatadisplay.presenter.MainScreenPresenter;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Application {

    public static void main(String[] args) {

        try {
            JFrame frame = new JFrame();
            MainScreenPresenter mainScreenPresenter = MainScreenPresenter.getInstance();

            mainScreenPresenter.getView().setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(mainScreenPresenter.getView(), BorderLayout.CENTER);
            frame.setSize(1400, 600);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
