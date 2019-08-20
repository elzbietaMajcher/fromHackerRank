package jumpingClouds;

public class Clouds {

    static int jumpingOnClouds(int[] c) {
        int jumpNum = 0;

        int oneStepBack = 0;
        int twoStepBack = 0;


        for (int cloud: c) {
            if (cloud == 0 && oneStepBack == 0 && twoStepBack == 1){ jumpNum++; twoStepBack = oneStepBack; oneStepBack = cloud;}
            else if (cloud == 0 && oneStepBack == 1) {jumpNum++; twoStepBack = oneStepBack; oneStepBack = cloud;}
            else if (cloud == 1){twoStepBack = oneStepBack; oneStepBack = cloud;}

        }

        return jumpNum;
    }

}
