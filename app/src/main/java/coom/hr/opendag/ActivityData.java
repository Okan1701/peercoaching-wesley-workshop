package coom.hr.opendag;

public class ActivityData {
    private String name;
    private String time;

    enum Group {
        Informatica,
        TechnischeInformatica,
        CMI
    }

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
    public static ActivityData[] generateData(String group) {
        ActivityData[] data = new ActivityData[4];

        switch (group) {
            case "Communicatie":
                data[0] = new ActivityData("Presentatie", "08:30");
                data[1] = new ActivityData("Workshop", "09:00");
                data[2] = new ActivityData("Presentatie", "19:00");
                data[3] = new ActivityData("Workshop", "19:30");
                break;
            case "Informatica":
                data[0] = new ActivityData("Presentatie", "10:00");
                data[1] = new ActivityData("Workshop", "10:30");
                data[2] = new ActivityData("Presentatie", "12:00");
                data[3] = new ActivityData("Workshop", "12:30");
                break;

            case "Technische Informatica":
                data[0] = new ActivityData("Presentatie", "16:00");
                data[1] = new ActivityData("Workshop", "16:30");
                data[2] = new ActivityData("Presentatie", "17:00");
                data[3] = new ActivityData("Workshop", "17:30");
                break;

            default:
                data[0] = new ActivityData("Presentatie", "16:00");
                data[1] = new ActivityData("Workshop", "16:30");
                data[2] = new ActivityData("Presentatie", "17:00");
                data[3] = new ActivityData("Workshop", "17:30");
                break;
        }

        return data;
    }
}
