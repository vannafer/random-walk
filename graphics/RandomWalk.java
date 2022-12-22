package graphics;

public class RandomWalk{
    private static int stepX;
    private static int stepY;
    private static int steps;

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
    
        while (Math.sqrt(Math.pow((double) egg.getX()-150,2.0) + Math.pow((double) egg.getY()-150,2.0)) < 100) {
            try{ Thread.sleep(100);}
            catch(Exception ex) {};
            stepX = (int) (Math.random()*20 )-10;
            stepY = (int) (Math.random()*20 )-10;
            egg.translate(stepX, stepY);
            steps++;
        }
        System.out.println(steps);


        
    }
}