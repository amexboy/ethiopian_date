package com.ethiopianclander.enums;

/**
 * Created by Amanuel Nega on 12/8/14.
 */
public enum MonthsEnum {
    SEPTEMBER("September", "Meskerem", "መስከረም"),
    OCTOBER("October", "Tikimt", "ጥቅምት"),
    NOVEMBER("November", "Hidar", "ኅዳር"),
    DECEMBER("December", "Tahisas", "ታኅሣሥ"),
    JANUARY("January", "Tir", "ጥር"),
    FEBRUARY("February", "Yekatit", "የካቲት"),
    MARCH("March", "Megabit", "መጋቢት"),
    APRIL("April", "Miyaziya", "ሚያዝያ"),
    MAY("May", "Ginbot", "ግንቦት"),
    JUNE("June", "Sene", "ሰኔ"),
    JULY("July", "Hamlie", "ሐምሌ"),
    AUGUST("August", "Nehassie", "ነሐሴ"),
    PUAGME(null, "Puagmien", "ጳጉሜን");

    private static int local = 0;

    private String month_en;
    private String month_am;
    private String month_am_en;

    MonthsEnum(String month_en, String month_am_en, String month_am) {
        this.month_en = month_en;
        this.month_am_en = month_am_en;
        this.month_am = month_am;
    }

    @Override
    public String toString(){
        switch (DisplayLanguageEnum.current){
            case ENGLISH:
                return month_en;
            case AMHARIC:
                return month_am;
            case AMHARIC_LATIN_PHONETICS:
                return month_am_en;
            default:
                return month_en;
        }
    }
}
