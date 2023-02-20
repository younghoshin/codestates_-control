public class addOneSeconds {
    public String addOneSecond(int hour, int minute, int second) {
        // TODO:

        if (second == 59 && minute ==59 && hour == 23){
            return "1초 뒤에 0시 0분 0초 입니다";
        }
        else if ( second == 59 ) {
            if (minute==59){
                return String.format("1초 뒤에 %d시 %d분 %d초 입니다",hour+1,0,0);

            }
            else{
                return String.format("1초 뒤에 %d시 %d분 %d초 입니다",hour,minute+1,0);
            }

        }
        else {
            return String.format("1초 뒤에 %d시 %d분 %d초 입니다",hour,minute,second+1);

        }
    }
}
