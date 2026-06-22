class Solution {
    public double angleClock(int hour, int minutes) {
       
        if(hour==12)
            hour=0;
        double hour_angle=minutes*0.5+hour*30;
        double minute_angle=minutes*6;
        double angle = Math.abs(Math.min(hour_angle-minute_angle,minute_angle-hour_angle));
        if(angle>180)
        angle=360-angle;
        return angle;
    }
}