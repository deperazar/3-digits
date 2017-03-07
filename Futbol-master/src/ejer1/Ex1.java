

package ejer1;
import java.util.*;
import becker.robots.*;

public class Ex1 {
    
    private Robot emra;
    private Thing nugget;
    private City room3; 
    
    public Ex1(){
        room3= new City();
        emra=new Robot(room3, 9, 9, Direction.WEST);
        nugget= new Thing(room3, 9, 9);
        
        room3= new City(10,10);
        Wall [] us= new Wall[40];
    
        int k=0;
        for(int i=0;i<4;i++){
            if(i==3){
                for(int j=0;j<5;j++){
                us[k]= new Wall(room3, j+1,3*i,Direction.EAST);
                k=k+1;
            }
            }
            else{
                for(int j=0;j<5;j++){
                us[k]= new Wall(room3, j+1,1+3*i,Direction.WEST);
                k=k+1;    
                    }
                }
        }
        for(int i=0;i<9;i++){
             
                    us[k]= new Wall(room3,1,1+i,Direction.NORTH);
                    k=k+1;
                    
        }
        us[k]= new Wall(room3,5,1,Direction.SOUTH);
        us[k+1]= new Wall(room3,5,3,Direction.SOUTH);
        us[k+2]= new Wall(room3,5,4,Direction.SOUTH);
        us[k+3]= new Wall(room3,5,6,Direction.SOUTH);
        us[k+4]= new Wall(room3,5,7,Direction.SOUTH);
        us[k+5]= new Wall(room3,5,9,Direction.SOUTH);
        
        emra=new Robot(room3, 6, 2, Direction.NORTH);
        nugget= new Thing(room3, 9, 9);
        
        
    }
    
    public void number(int a, int b, int c){
        Scanner lec=new Scanner(System.in);
        
        
        
        
       
        
    }
    
    
}
