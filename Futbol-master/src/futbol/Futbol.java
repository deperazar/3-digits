
package futbol;
import becker.robots.*;

public class Futbol {
    private Robot joe;
    private Thing balon;
    private Thing num0[]=new Thing[13];
    private Thing num1[]=new Thing[12];
    private Thing num2[]=new Thing[12];
    private City room3;
    
    public Futbol() {
        
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
        
        
        
        //Number Zero
        for(int i=0; i < 13; i++){
            if(i<5){
                num0[i]= new Thing(room3, 1+i, 1);
            }
            else if(5<=i && i< 7){
                num0[i]= new Thing(room3, 5, 2);
                num0[i+1]= new Thing(room3, 5, 3);
                i=i+2;
            }
            else if(7<=i && i<12){
                 num0[i]= new Thing(room3, 5-(i-7),3);
            }
            else if(i==12){
                num0[12]= new Thing(room3, 1,2);
            }
        }
        //Number One
         for(int i=0; i < 5; i++){
             num1[i]=new Thing(room3, 1+i, 6);
         }
         
         //Number Two
         for(int i=0; i<3;i++){
            num2[i]=new Thing(room3, 1, 7+i);
            num2[i+3]=new Thing(room3, 3, 7+i);
            num2[i+6]=new Thing(room3, 5, 7+i);
            num2[9]=new Thing(room3, 2, 9);
            num2[10]=new Thing(room3, 4, 7);

         }
        
        joe=new Robot(room3, 6, 2, Direction.NORTH);
    }
    int [] firstnum= new int [15];
    int [] secondnum= new int [15];
    int [] thirdnum= new int [15];
    
    /*Método que recorre las habitaciones y guarda mediante
    un arreglo, los objetos que hay según el recorrido del robot*/
    public void checkroom(int i){
        if(i==1){
        for(int j=0;j<5;j++){
            joe.move();    
            if(joe.canPickThing()){
                firstnum[j]=1;
            }
            else{
                firstnum[j]=0;
            }
        }
        joe.turnLeft();
        joe.move();
        if(joe.canPickThing()){
                firstnum[5]=1;
            }
            else{
                firstnum[5]=0;
            }
        joe.turnLeft();
        for(int k=0;k<4;k++){
            joe.move();    
            if(joe.canPickThing()){
                firstnum[k+6]=1;
            }
            else{
                firstnum[k+6]=0;
            }
        }
        joe.turnLeft();
        joe.move();
        joe.move();
        if(joe.canPickThing()){
                firstnum[10]=1;
            }
            else{
                firstnum[10]=0;
            }
        joe.turnLeft();
         for(int k=0;k<4;k++){
            joe.move();    
            if(joe.canPickThing()){
                firstnum[k+11]=1;
            }
            else{
                firstnum[k+11]=0;
            }
        }
         joe.turnLeft();
         joe.move();
         joe.turnLeft();
         joe.move();
         joe.move();
         joe.move();
         joe.move();
         joe.move();
         joe.turnLeft();
         joe.move();
         joe.move();
         joe.move();
         joe.turnLeft();
    }
        else if(i==2){
            for(int j=0;j<5;j++){
            joe.move();    
            if(joe.canPickThing()){
                secondnum[j]=1;
            }
            else{
                secondnum[j]=0;
            }
        }
        joe.turnLeft();
        joe.move();
        if(joe.canPickThing()){
                secondnum[5]=1;
            }
            else{
                secondnum[5]=0;
            }
        joe.turnLeft();
        for(int k=0;k<4;k++){
            joe.move();    
            if(joe.canPickThing()){
                secondnum[k+6]=1;
            }
            else{
                secondnum[k+6]=0;
            }
        }
        joe.turnLeft();
        joe.move();
        joe.move();
        if(joe.canPickThing()){
                secondnum[10]=1;
            }
            else{
                secondnum[10]=0;
            }
        joe.turnLeft();
         for(int k=0;k<4;k++){
            joe.move();    
            if(joe.canPickThing()){
                secondnum[k+11]=1;
            }
            else{
                secondnum[k+11]=0;
            }
        }
         joe.turnLeft();
         joe.move();
         joe.turnLeft();
         joe.move();
         joe.move();
         joe.move();
         joe.move();
         joe.move();
         joe.turnLeft();
         joe.move();
         joe.move();
         joe.move();
         joe.turnLeft();
        }
        else if(i==3){
            for(int j=0;j<5;j++){
            joe.move();    
            if(joe.canPickThing()){
                thirdnum[j]=1;
            }
            else{
                thirdnum[j]=0;
            }
        }
        joe.turnLeft();
        joe.move();
        if(joe.canPickThing()){
                thirdnum[5]=1;
            }
            else{
                thirdnum[5]=0;
            }
        joe.turnLeft();
        for(int k=0;k<4;k++){
            joe.move();    
            if(joe.canPickThing()){
                thirdnum[k+6]=1;
            }
            else{
                thirdnum[k+6]=0;
            }
        }
        joe.turnLeft();
        joe.move();
        joe.move();
        if(joe.canPickThing()){
                thirdnum[10]=1;
            }
            else{
                thirdnum[10]=0;
            }
        joe.turnLeft();
         for(int k=0;k<4;k++){
            joe.move();    
            if(joe.canPickThing()){
                thirdnum[k+11]=1;
            }
            else{
                thirdnum[k+11]=0;
            }
        }
         joe.turnLeft();
         joe.move();
         joe.turnLeft();
         joe.move();
         joe.move();
         joe.move();
         joe.move();
         joe.move();
         joe.turnLeft();
         joe.turnLeft();
            
        }
            
    }
    
    public void checknum(int n){
        int zero[]={1,0,0,0,1,1,1,1,1,1,1,1,1,1,1};
        int one[]={0,0,0,0,0,0,0,0,0,0,1,1,1,1,1};
        int two[]={1,0,1,0,1,1,0,1,1,1,1,0,1,1,1};
        int aprove0=0;
        int aprove1=0;
        int aprove2=0;       
        
        if(n==1){
            for(int i=0;i<15;i++){
                if(firstnum[i]==zero[i] && firstnum[i]==one[i] && firstnum[i]==two[i]){
                    aprove0++;
                    aprove1++;
                    aprove2++;
                    if(aprove0==15){
                        System.out.println("First Number is 0");
                        aprove0=0;
                    }
                    else if(aprove1==15){
                        System.out.println("First Number is 1");
                        aprove1=0;
                    }
                    else if(aprove2==15){
                        System.out.println("First Number is 2");
                        aprove2=0;
                    }
                }
                else if(firstnum[i]==zero[i] && firstnum[i]==one[i]){
                    aprove0++;
                    aprove1++;
                    if(aprove0==15){
                        System.out.println("First Number is 0");
                        aprove0=0;
                    }
                    else if(aprove1==15){
                        System.out.println("First Number is 1");
                        aprove1=0;
                    }
                }
                else if(firstnum[i]==two[i]){
                    aprove2++;
                    if(aprove2==15){
                        System.out.println("First Number is 2");
                        aprove2=0; 
                    }
                }
            }
        }
     
        
        else if(n==2){
            for(int i=0;i<15;i++){
                if(secondnum[i]==zero[i]){
                    aprove0++;
                    if(aprove0==15){
                        System.out.println("Second Number is 0");
                        aprove0=0; 
                    }
                }
                else if(secondnum[i]==one[i]){
                    aprove1++;
                    if(aprove1==15){
                        System.out.println("Second Number is 1");
                        aprove1=0; 
                    }
                }
                else if(secondnum[i]==two[i]){
                    aprove2++;
                    if(aprove2==15){
                        System.out.println("Second Number is 2");
                        aprove2=0; 
                    }
                }
            }
        }
        else if(n==3){
            for(int i=0;i<15;i++){
                if(thirdnum[i]==zero[i]){
                    aprove0++;
                    if(aprove0==15){
                        System.out.println("Third Number is 0");
                        aprove1=0; 
                    }
                }
                else if(thirdnum[i]==one[i]){
                    aprove1++;
                    if(aprove1==15){
                        System.out.println("Third Number is 1");
                        aprove1=0; 
                    }
                }
                else if(thirdnum[i]==two[i]){
                    aprove2++;
                    if(aprove2==15){
                        System.out.println("Third Number is 2");
                        aprove2=0; 
                    }
                }
            }
        }
    }
    public void advanceLeft(){
        joe.turnLeft();
        joe.move();
    }
    public void advanceRight(){
        joe.turnLeft();
        joe.turnLeft();
        joe.turnLeft();
        joe.move();
    }

}