public class isPythagorean {
    public boolean isPythagorean(int side1, int side2, int side3) {
        // TODO:
        int longs;
        int s1,s2;
        if(side1 == side2&&side1 == side3 && side2 == side3){
            return false;
        }
        if(side1>side2&&side1>side3){
            longs = side1;
            s1=side2;
            s2=side3;
        }
        else if(side2>side1&&side2>side3){
            longs = side2;
            s1=side1;
            s2=side3;

        }
        else{
            longs = side3;
            s1=side1;
            s2=side2;
        }

        if(Math.pow(longs,2) == Math.pow(s1,2) + Math.pow(s2,2)){
            return true;
        }
        else {
            return false;
        }


    }
}

//    int pow1 = side1 * side1;
//    int pow2 = side2 * side2;
//    int pow3 = (int) Math.pow(side3, 2);
//
//		if (pow1 == pow2 + pow3 || pow2 == pow1 + pow3 || pow3 == pow1 + pow2) {
//                return true;
//                }
//
//                return false;
//                }