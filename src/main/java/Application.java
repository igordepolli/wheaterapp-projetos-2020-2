
import com.mycompany.weatherdatadisplay.presenter.MainScreenPresenter;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class Application {

    public static void main(String[] args) {
        
        /*
        try {
            Date date1 = DateUtil.stringToDate("22/04/2003");
            Date date3 = DateUtil.stringToDate("24/04/2003");
            Date date4 = DateUtil.stringToDate("26/04/2003");
            Date date5 = DateUtil.stringToDate("15/05/2003");
            Date date6 = DateUtil.stringToDate("16/05/2003");
            
            WeatherData weatherData1 = new WeatherData(date1, 32.0, 25.0, 88.0);
            WeatherData weatherData2 = new WeatherData(date1, 22.0, 35.0, 48.0);
            WeatherData weatherData3 = new WeatherData(date3, 25.0, 255.0, 188.0);
            WeatherData weatherData4 = new WeatherData(date4, 23.0, 225.0, 188.0);
            WeatherData weatherData5 = new WeatherData(date5, 18.0, 2.0, 3.0);
            WeatherData weatherData6 = new WeatherData(date6, 28.0, 5.0, 6.0);
            
            WeatherDataCollection weatherDataCollection = WeatherDataCollection.getInstance();
            weatherDataCollection.getWeathers().addAll(Arrays.asList(weatherData1, weatherData2, weatherData3, weatherData4, weatherData5, weatherData6));
            
            Daily daily = new Daily();
            System.out.println(daily.getAverageTemperature());
            
        } catch (ParseException ex) {
            Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        JFrame frame = new JFrame();
        JDesktopPane desktopPane = new JDesktopPane();
        MainScreenPresenter mainScreenPresenter = MainScreenPresenter.getInstance();

        desktopPane.add(mainScreenPresenter.getView());
        mainScreenPresenter.getView().setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(desktopPane, BorderLayout.CENTER);
        frame.setSize(1400, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
}
