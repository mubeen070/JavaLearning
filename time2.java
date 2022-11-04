public class time2 {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    public time2() {
        this(0, 0, 0);
    }

    public time2(int h) {
        this(h, 0, 0);
    }

    public time2(int h, int m) {
        this(h, m, 0);
    }

    public time2(int h, int m, int s) {
        setTime(h, m, s);
    }

    public time2(time2 time) {

        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    public void setTime(int h, int m, int s) {
        setHour(h); // set the hour
        setMinute(m); // set the minute
        setSecond(s); // set the second
    }

    public void setHour(int h) {
        hour = ((h >= 0 && h < 24) ? h : 0);
    }

    public void setMinute(int m) {
        minute = ((m >= 0 && m < 60) ? m : 0);
    }

    public void setSecond(int s) {
        second = ((s >= 0 && s < 60) ? s : 0);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toUniversalString() {
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    private void ResetTime() {

        if (this.second >= 60) {
            this.minute += this.second / 60;
            this.second = this.second % 60;
        }
        if (this.minute >= 60) {
            this.hour += this.minute / 60;
            this.minute = this.minute % 60;
        }
        if (this.hour >= 24) {
            // No DAY const.
            this.hour = this.hour % 24;
        }

    }

    public void tick() {
        this.second++;
        this.ResetTime();
    }

    public void incrementMinute() {
        this.minute++;
        this.ResetTime();
    }

    public void incrementHour() {
        this.hour++;
        this.ResetTime();
    }
}