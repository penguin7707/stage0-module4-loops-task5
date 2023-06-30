package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int subtract = (int)Math.floor(height / 2);

        for(int i = height - subtract; i >= 1; i--){

            for(int j=i;j<height - subtract;j++){
                System.out.print(' ');
            }

            for(int j=1;j<=i*2-1;j++){
                System.out.print("8");
            }

            System.out.println();
        }

        for(int i = 2; i <= height - subtract; i++)
        {

            for(int j=i;j<height - subtract;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i*2-1;j++){
                System.out.print("8");
            }

            System.out.println();
        }

    }
}
