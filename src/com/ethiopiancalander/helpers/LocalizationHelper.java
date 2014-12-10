package com.ethiopiancalander.helpers;

import com.ethiopianclander.enums.DisplayLanguageEnum;

/**
 * Created by Amanuel Nega on 12/8/14.
 */
public class LocalizationHelper {

    public static void setDisplayLanguage(DisplayLanguageEnum lang){
        DisplayLanguageEnum.current = lang;
    }

}
