import com.ethiopiancalander.helpers.LocalizationHelper;
import com.ethiopianclander.enums.DisplayLanguageEnum;
import com.ethiopianclander.enums.MonthsEnum;

/**
 * Created by Amanuel Nega on 12/8/14.
 */
public class MainClass {
    public static void main(String[] args) {
        LocalizationHelper.setDisplayLanguage(DisplayLanguageEnum.ENGLISH);
        for(MonthsEnum enumT : MonthsEnum.values()){
            System.out.println(enumT);
        }
    }
}
