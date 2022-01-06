package ss4_lop_va_doi_tuong_trong_Java.bai_tap.XayDungLopStopWatch;

public class StopWatch {
    long startTime;
    long endTime;

    public StopWatch() {

    }
    public long getStartTime() {
        return this.startTime;
    }
    public long getEndTime() {
        return this.endTime;
    }
    public long setStartTime(long a) {

        return this.startTime = a;
    }

    public long setEndTime(long b) {

        return this.endTime = b;
    }

    public long start() {
        return this.startTime = System.currentTimeMillis();
    }

    public long end() {

        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsetTime() {
        return this.endTime - this.startTime;
    }
}
