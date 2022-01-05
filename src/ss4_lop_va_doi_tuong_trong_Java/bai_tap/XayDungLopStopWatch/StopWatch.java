package ss4_lop_va_doi_tuong_trong_Java.bai_tap.XayDungLopStopWatch;

public class StopWatch {
    private long startTime ;
    private long endTime  ;

    public long getStartTime(){
        return  this.startTime ;
    }
    public long getEndTime(){
        return this.endTime;
    }
    public void  setStartTime( long startTime){
        this.startTime = startTime ;
    }
    public void  setEndTime( long endTime){
        this.endTime = endTime ;
    }

    public void start(){
        this.startTime = System.currentTimeMillis() ;
    }
    public void stop(){
        this.endTime = System.currentTimeMillis() ;
    }
    public float getElapsedTime(){
        return this.endTime  -  this.startTime;
    }
}