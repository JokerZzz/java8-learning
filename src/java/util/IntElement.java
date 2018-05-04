package util;

public class IntElement {

    private Integer arabicNumber;
    private String englishName;

    public IntElement(Integer arabicNumber, String englishName) {
        this.arabicNumber = arabicNumber;
        this.englishName = englishName;
    }

    public Integer getArabicNumber() {
        return arabicNumber;
    }

    public void setArabicNumber(Integer arabicNumber) {
        this.arabicNumber = arabicNumber;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }
}
