package graphics;

public class RandomWalk{
    private int stepX;
    private int stepY;

    public static void main(String[] args){
        //bg
        Rectangle bg = new Rectangle(0,0,300,300);
        bg.setColor(Color.BLUE);
        bg.fill();  

        //the thing escaping
        Ellipse egg = new Ellipse(145, 145, 10, 10);
        egg.setColor(Color.RED);
        egg.fill();  

        //the cell
        Ellipse cell = new Ellipse(50, 50, 200, 200);
        cell.draw();

        while(egg.getX() ){
            stepX = (int) Math.random()*20 -10;
            stepY = (int) Math.random()*20 -10;
            egg.Translate(stepX, stepY);
        }


        
    }
}