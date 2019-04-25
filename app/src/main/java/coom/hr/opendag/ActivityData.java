package coom.hr.opendag;

public class ActivityData {
    private String name;
    private String time;

    public ActivityData(String name, String date) {
        this.name = name;
        this.time = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return time;
    }

    public void setDate(String date) {
        this.time = date;
    }

    // Generate data
    public static ActivityData[] generateDataINF() {
        ActivityData[] data = new ActivityData[4];
        data[0] = new ActivityData("Presentatie", "09:00");
        data[1] = new ActivityData("Workshop", "9:30");
        data[2] = new ActivityData("Presentatie", "12:00");
        data[3] = new ActivityData("Workshop", "12:30");

        return data;
    }
}
