import java.awt.Color;

public class Editor4 {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("lacking arguments");
            return;
        }
        String fileName = args[0];
        int steps = Integer.parseInt(args[1]);
        Color[][] sourceImage = Runigram.read(fileName);
        Color[][] grayscaleImage = Runigram.grayScaled(sourceImage);
        Runigram.setCanvas(sourceImage);
        Runigram.morph(sourceImage, grayscaleImage, steps);
    }
}