int dotX = 0;
void setup() {
    size(800, 200);
}

void draw() {
    background(#CBCBCB);
    //3. make it a nice color
    fill(#42E882);
    //4. if the mouse is pressed...
    if(mousePressed){
      dotX=dotX+50;
    }
    //5. ... change the X co-ordinate so that the dot moves to the right
    //2. Draw an ellipse of height and width 100. Make sure to use your variable for the X position.
    ellipse(dotX, 100, 100, 100);
    fill(#000000);
    rect(750, 0, 20, 200);
    //6. Make your dot move really fast so that it can win the race 
    delay(100);
    //7. se this method to play a ding when your dot crosses the finish line. 
    }


import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
    if (!soundPlayed) {
        Minim minim = new Minim(this);
        AudioSample sound = minim.loadSample("196106__aiwha__ding.wav");
        sound.trigger();
        soundPlayed = true;
    }
}