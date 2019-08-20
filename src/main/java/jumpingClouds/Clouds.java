package jumpingClouds;

public class Clouds {

    static int jumpingOnClouds(int[] c) {
        int jumpNum = 0;
        int cumulusSeq = 0;

        for (int cumulus : c) {
            if (cumulus == 1) {
                jumpNum = jumpNum + addJump(cumulusSeq);
                jumpNum++;
                cumulusSeq = 0;
            }

            if (cumulus == 0) {
                cumulusSeq++;
            }
        }

        return jumpNum + addJump(cumulusSeq);

    }

    public static int addJump(int cumulusSeq) {
        int jumpNum = 0;
        if (cumulusSeq == 2) jumpNum++;
        else if (cumulusSeq > 2) {
            int jump = cumulusSeq / 2;
            jumpNum = jumpNum + jump;
        }
        return jumpNum;
    }
}
