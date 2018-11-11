  // 4. create three integer variables to  
    //    represent the x, y, and the size of the ellipse
  int dotSize = 100;
  int dotX = 300;
  int dotY = 300;
    
    void setup() {
      size(600, 600);
    
    }
    
    void draw() {
      background(#C6C2C2);
      ellipse(dotX, dotY, dotSize, dotSize);
      
      //3. draw an ellipse. Make sure it fits in the window.
      //5. use the variables created in step 4 in place of the numbers
      //   in your ellipse
    
    }
    
    void mousePressed() {
      int distance = getDistance(mouseX, mouseY, dotX, dotY);
      //6a. create an integer variable called distance
      //6b. use the getDistance method to initialize your varible
      //    use the mouse's x and y and the x and y of your ellipse 
     
      //7. print the distance variable
      print(distance);
      
      //8a. make an if statement to check if the distance variable
      //   is within the size of the ellipse
      if(distance <= dotSize){
        dotX=;  
      }
        //8b.  set the x and y of the ellipse to a random location on the window
       
      
    }
    
    int getDistance(int x1, int y1, int x2, int y2) {
      return (int)Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
    }
    
    
