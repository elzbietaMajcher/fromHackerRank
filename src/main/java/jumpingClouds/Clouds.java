package jumpingClouds;

public class Clouds {

    static int jumpingOnClouds(int[] c) {
        int jumpNum = 0;
        int cumulusSeq = 0;

        for (int cumulus : c) {
            if (cumulus == 1) {
                if (cumulusSeq > 2) {
                    int jump = cumulusSeq / 2;
                    jumpNum = jumpNum - jump;
                }
                cumulusSeq = 0;
            }
            if (cumulus == 0) {
                cumulusSeq++;
                jumpNum++;
            }


        }

        if (cumulusSeq > 2) {
            int jump = cumulusSeq / 2;
            jumpNum = jumpNum - jump;
        }


        return jumpNum ;
    }
}
