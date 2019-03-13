public class Coursework {

    private String theme;
    private int numberOfPages;
    private int currentCourse;
    private int dateYear;
    protected String author;
    private static int mark;

    public Coursework() {
        this("", 0, 0, 0, "");
    }

    public Coursework(String theme, int numberOfPages, int currentCourse, int dateYear) {
        this(theme, numberOfPages, currentCourse, dateYear, "");
    }

    public Coursework(String theme, int numberOfPages, int currentCourse, int dateYear, String author) {
        this.theme = theme;
        this.numberOfPages = numberOfPages;
        this.currentCourse = currentCourse;
        this.dateYear = dateYear;        this.author = author;
    }

    public Coursework(String Theme, int numberOfPages, int NumberOfPages, int CurrentCourse, int DateYear, String Author) {
        this.theme = theme;
        this.numberOfPages = numberOfPages;
        this.currentCourse = currentCourse;
        this.dateYear = dateYear;
        this.author = author;
        mark++;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getCurrentCourse() {
        return currentCourse;
    }

    public void setCurrentCourse(int currentCourse) {
        this.currentCourse = currentCourse;
    }

    public int getDateYear() {
        return dateYear;
    }

    public void setDateYear(int dateYear) {
        this.dateYear = dateYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static int getMark() {
        return mark;
    }

    public static void setMark(int mark) {
        Coursework.mark = mark;
    }

    @Override
    public String toString() {
        return "Coursework{" +
                "Theme='" + theme + '\'' +
                ", NumberOfPages=" + numberOfPages +
                ", CurrentCourse=" + currentCourse +
                ", DateYear=" + dateYear +
                ", Author='" + author + '\'' +
                '}';
    }

    public static void printStaticMark() {
        System.out.println("Mark:" + mark);
    }

    public void printMark() {
        System.out.println("Mark:" + mark);
    }

    public void resetValues(String theme, int numberOfPages, int currentCourse, int dateYear, String author) {
        this.theme = theme;
        this.numberOfPages = numberOfPages;
        this.currentCourse = currentCourse;
        this.dateYear = dateYear;
        this.author = author;
    }
}

