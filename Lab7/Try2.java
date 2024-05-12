// Create interface EventListener with performEvent() method. Create MouseListener interface which inherits EventListener 
// along with mouseClicked(), mousePressed(), mouseReleased(), mouseMoved(), mouseDragged() methods. Also create 
// KeyListener interface which inherits EventListener along with keyPressed(), keyReleased() methods. WAP to create 
// EventDemo class which implements MouseListener and KeyListener and demonstrate all the methods of the interfaces.
interface EventListener{
    void performEvent();

}
interface MouseListener extends EventListener{
    public void mouseClicked();
    public void mousePressed();
    public void mouseReleased();
    public void mouseMoved();
    public void mouseDragged();

}
interface KeyListener extends EventListener{
    public void keyPressed();
    public void keyReleased();
}

class EventDemo implements EventListener , MouseListener{
    

}
public class Try2 {
    
}
