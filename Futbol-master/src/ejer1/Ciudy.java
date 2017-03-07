
package ejer1;
import becker.robots.*;

public class Ciudy {
    
    private City room3;
    
    public Ciudy(){
        room3= new City(10,10);
        Wall [] us= new Wall[6];
        us[0]= new Wall(room3, 3,2,Direction.WEST);
        us[1]= new Wall(room3, 4,2,Direction.WEST);
        us[2]= new Wall(room3, 5,2,Direction.WEST);
        us[3]= new Wall(room3, 6,2,Direction.WEST);
        
        
    }
    
    
}
