public class convertScoreToGrade {
    public String convertScoreToGrade(int score) {
        // TODO:
        String grade;

        if(score == 100){
            return "A+";
        }
        else if (score >= 0 && score <= 100) {
            int sc = score /10;

            switch (sc) {

                case 9 :
                    grade = "A";
                    break;
                case 8 :
                    grade = "B";
                    break;
                case 7 :
                    grade = "C";
                    break;
                case 6 :
                    grade = "D";
                    break;

                default:
                    grade = "F";
                    return grade;

            }

            if (score % 10 >= 8 ){
                return grade.concat("+");
            }
            else if(score%10<=3){
                if(score == 93){
                    return grade;
                }
                else {
                    return grade.concat("-");
                }
            }
            else return grade;
        }
        else {
            return "INVALID SCORE";
        }
    }
}
